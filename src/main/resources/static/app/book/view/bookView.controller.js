angular
    .module('bookModule') // getter
    .controller('bookViewController', bookViewController);

function bookViewController($scope, $http, $routeParams) {
    $http.get('/api/books/' + $routeParams.bookId)
        .then(function (response) {
            $scope.book = response.data;
        });
}