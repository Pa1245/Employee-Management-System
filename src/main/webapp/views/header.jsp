<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deloitte EMS</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<link rel="icon" href="favicon.ico" type="image/gif" sizes="16x16">
<style>
nav ul li:hover{
 background-color:#82b725;
}
</style>
</head>
<body>
	<nav>
		<div class="nav-wrapper black">
			<a href="#" class="brand-logo"><img src="logodeloitte.png" width=200></a>
			<ul id="nav-mobile" class="right hide-on-med-and-down">
				<li><a href="addemp.jsp">Add</a></li>
				<li><a href="updateemp.jsp">Update</a></li>
				<li><a href="deleteemp.jsp">Delete</a></li>
				<li><a href="getemp.jsp">Get Employee</a></li>
				<li><a href="showall">View All</a></li>
			</ul>
		</div>
	</nav>