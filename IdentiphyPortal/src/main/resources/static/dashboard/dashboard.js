'use strict';

angular.module('myApp.dashboard', ['ngRoute'])
.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {
    templateUrl: 'dashboard/dashboard.html',
    controller: DashboardCtrl,
		resolve: DashboardCtrl.resolve
  });
}]);

function DashboardCtrl($scope, $rootScope, $http, authService, isAuthenticated) {
	$rootScope.authenticated = isAuthenticated;

	$scope.serverResponse = '';
	$scope.responseBoxClass = '';

	var setResponse = function(res, success) {
		$rootScope.authenticated = isAuthenticated;
		if (success) {
			$scope.responseBoxClass = 'alert-success';
		} else {
			$scope.responseBoxClass = 'alert-danger';
		}
		$scope.serverResponse = res;
		$scope.serverResponse.data = JSON.stringify(res.data, null, 2);
	}

	if ($rootScope.authenticated) {
		authService.getUser()
		.then(function(response) {
			$scope.user = response.data;
		});
	}

	$scope.getUserInfo = function() {
		authService.getUser()
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}

	$scope.getAllUserInfo = function() {
		$http.get('user/all')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getAllBiometricTypesInfo = function() {
		$http.get('biometrictype/all')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.createNewTenant = function() {
		
		var data = $.param({
            json: JSON.stringify({
            	tenantname: "Tenant1",
                address1: "address1",
                address2: "address2",
                city: "city",
                country: "country",
                
            })
        });
		var data1 = {
                tenantname: "Tenant1",
                address1: "address1",
                address2: "address2",
                city: "city",
                country: "country",
                
            }
		console.log(data1);
		$http.post('tenant',data1)
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getAllTenant = function() {
		
		$http.get('tenant/all')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	
	$scope.getTenant = function() {
		
		$http.get('tenant/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.deleteTenant = function() {
		
		$http.delete('tenant/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getTenantUsers = function() {
		
		$http.get('tenantusers/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.createNewTenantUser = function() {
		
		var data = $.param({
            json: JSON.stringify({
            	tenant_id: "1",
            	user_name: "tenant user 1",
            	password: "password",
            	employeealias: "employeealiasuser1",
            	email: "email@test.com",
                
            })
        });
		
		var data1 = {
				tenant_id: "1",
            	user_name: "tenant user 1",
            	password: "password",
            	employeealias: "employeealiasuser1",
            	email: "email@test.com",
                
            }
		
		
		$http.post('tenantuser',data1)
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getAllTenantUsers = function() {
		
		$http.get('tenantuser/all')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
		
	$scope.getTenantUser = function() {
		
		$http.get('tenantuser/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.deleteTenantUser = function() {
		
		$http.delete('tenantuser/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	/****  Tenant User Subscription ********/
	
	$scope.createNewTenantUserSubscription = function() {
		
		var data1 = {
				tenantuserid: "1",
				tenantbiometricsubscriptionid: "1",
				enrolldate: "2017-08-30",
            	status: "0",
            	email: "email@test.com",
                
            }
		
		
		$http.post('tenantusersubscription',data1)
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getAllTenantUserSubscriptions = function() {
		
		$http.get('tenantusersubscription/all')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
		
	$scope.getTenantUserSubscription = function() {
		
		$http.get('tenantusersubscription/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.deleteTenantUserSubscription = function() {
		
		$http.delete('tenantusersubscription/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	$scope.getTenantSubscriptions = function() {
		
		$http.get('tenantsubscriptions/1')
		.then(function(response) {
			setResponse(response, true);
		})
		.catch(function(response) {
			setResponse(response, false);
		});
	}
	
	
}
DashboardCtrl.resolve = {
	isAuthenticated : function($q, $http) {
		var deferred = $q.defer();
		$http({method: 'GET', url: 'auth/refresh'})
		.success(function(data) {
			deferred.resolve(data.access_token !== null);
		})
		.error(function(data){
			deferred.resolve(false); // you could optionally pass error data here
		});
		return deferred.promise;
	}
};

DashboardCtrl.$inject = ['$scope', '$rootScope', '$http', 'AuthService', 'isAuthenticated'];

