var testApp = angular.module('testApp', []);

testApp.controller('CommentsCtrl',["$scope", "$http", function($scope, $http){
    $http.get('/test-app/comments').success(function(data){
        $scope.comments = data;
    });
}]);