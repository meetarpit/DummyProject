<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="js/AdminRegisterController.js"></script>
</head>
<body ng-app="register" ng-controller="regController">
<form ng-submit="insertAdmin()">
<table>
<tr>
<td>Name</td>
<td><input type="text" ng-model="adminForm.aemail"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" ng-model="adminForm.apass"></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" ng-model="adminForm.gender" value="M">Male
<input type="radio" ng-model="adminForm.gender" value="F">female
</td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" ng-model="adminForm.address"></td>
</tr>
<tr>
<td>Phone</td>
<td><input type="number" ng-model="adminForm.phone"></td>
</tr>
<tr>
<td>Roles</td>
<td><input type="text" ng-change="roleArraySend()" ng-model="adminForm.roles.rolename"></td>
</tr>
<tr>
<td><button>submit</button></td>
</tr>
</table>
</form>
<h1 style="color:skyblue;">LIST OF ALL</h1>
<table>
<tr>
<th>Email</th>
<th>Password</th>
<th>Gender</th>
<th>Address</th>
<th>Phone</th>
</tr>
<tr ng-repeat="x in adminList">
<td>{{x.aemail}}</td>
<td>{{x.apass}}</td>
<td>{{x.gender}}</td>
<td>{{x.address}}</td>
<td>{{x.phone}}</td>
</tr>
</table>
</body>
</html>