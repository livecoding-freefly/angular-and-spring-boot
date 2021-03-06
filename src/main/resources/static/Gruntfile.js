var proxySnippet = require('grunt-connect-proxy/lib/utils').proxyRequest;

module.exports = function (grunt) {

    grunt.initConfig({
        watch: {
            all: {
                files: ['Gruntfile.js']
            }
        },
        connect: {
            'static': {
                options: {
                    hostname: 'localhost',
                    port: 8001
                }
            },
            server: {
                options: {
                    hostname: 'localhost',
                    port: 8000,
                    middleware: function(connect) {
                        return [proxySnippet];
                    }
                },
                proxies: [
                    {
                        context: '/api', //for backend
                        host: 'localhost',// backend address
                        port: 8080 // backend port
                    },
                    {
                        context: '/', // else frontend
                        host: 'localhost',
                        port: 8001
                    }
                ]
            }
        }
    });
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-connect');
    grunt.loadNpmTasks('grunt-connect-proxy');

    grunt.registerTask('server', [
        'connect:static',
        'configureProxies:server',
        'connect:server',
        'watch'
    ]);

};