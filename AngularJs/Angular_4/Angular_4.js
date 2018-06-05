var app = angular.module('myApp', []);
app.controller('CDCtrl', function($scope) {
    $scope.CDid = 1234;
    $scope.CDName = "Doe";
    $scope.CDPrice=24;
    $scope.fullName = function() {
        return   $scope.CDid + " " + $scope.CDName+" "+  $scope.CDPrice;
    };
});