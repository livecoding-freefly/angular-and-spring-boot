angular
    .module('myApp', [])
    .controller('HomeController', HomeController);

function HomeController($scope) {
    $scope.greeting = "Hello, world!!!";
}