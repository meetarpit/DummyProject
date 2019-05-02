/**
 * 
 */
var app=angular.module("register",[]);
app.controller("regController",function($scope,$http){
	$scope.adminForm={roles:[{id:-1,rolename:""}],aid:-1,aemail:"",apass:"",gender:"",address:"",phone:""};
	$scope.adminList=[];
	
	
	getAllAdminList();
	
	
	$scope.roleArraySend=function(){
		$scope.adminForm['roles'][0]['rolename']=$scope.adminForm.roles.rolename;
	}
	
	
	
	$scope.insertAdmin=function(){
	
		$http({
			method:"POST",
			url:"adminlogin",
			data:angular.toJson($scope.adminForm),
			header:{
				'Content-Type':'application/json'
			}
		}).then(_sucess,_error)
		
	}
	

	
	
	
	
	function _sucess(){
		console.log("inserted");
		getAllAdminList();
		clearForm();
	}
	function _error(){
		console.log("Rejected")
	}
	
	function getAllAdminList(){
		$http({
			method:"GET",
			url:"adminList"			
		}).then(function sucessCallBack(response){
			$scope.adminList=response.data;
			console.log("$scope.adminList"+response.data);
		},_error)
	}
	
	function clearForm(){
		$scope.adminForm.aid=-1;
		$scope.adminForm.aemail="";
		$scope.adminForm.apass="";
		$scope.adminForm.gender="";
		$scope.adminForm.address="";
		$scope.adminForm.phone="";
		
	}
	
	
	
	
});