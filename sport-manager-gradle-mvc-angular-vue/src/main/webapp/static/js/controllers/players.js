angular.module('tournamentApp').controller('playersController',
		function($scope, $http) {
			$http.get('/sport-manager-gradle-mvc-angular-vue/players').then(function(response) {
				$scope.tasks = response.data;
			});
		});
