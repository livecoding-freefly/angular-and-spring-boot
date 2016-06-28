angular
    .module("bookModule", ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/books', {
                controller: 'bookListController',
                templateUrl: '/app/book/list/bookList.html'
            })
            .when('/book/:bookId', {
                controller: 'bookViewController',
                templateUrl: '/app/book/view/bookView.html'
            });
    });