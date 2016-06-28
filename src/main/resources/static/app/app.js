angular
    .module('myApp', ['bookModule', 'ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/app/main.html'
            });
    });


