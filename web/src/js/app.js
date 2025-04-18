var app = angular.module('testApp', []);

app.controller('MainController', function ($scope, $http) {
    $scope.loading = true;
    $scope.error = null;
    $scope.data = null;

    $http.get('https://localhost:8085/api/data')
        .then(function (response) {
            $scope.dataItems = response.data;
            $scope.loading = false;
        })
        .catch(function (error) {
            $scope.error = 'Errore nel caricamento dei dati: ' + error.message;
            $scope.loading = false;
        });
}); 