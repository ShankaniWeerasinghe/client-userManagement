<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="com.user" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
<link rel="stylesheet" href="View/bootstrap.min.css">
<!-- bootstrap -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
		
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
		
		
	<!-- bootstrap -->
<script src="components/jquery-3.2.1.min.js"></script>
<script src="components/main.js"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-8">

<body> 

 <h1 class="m-3">User details</h1>



 <form id="user">
 
 <div class="input-group input-group-sm mb-3">
 <div class="input-group-prepend">
 <span class="input-group-text" id="UserEmail">User Email: </span>
 </div>
 <input type="text" id="UserEmail" name="txtName">
 </div>

<div class="input-group input-group-sm mb-3">
 <div class="input-group-prepend">
 <span class="input-group-text" id="firstName">First Name: </span>
 </div>
 <input type="text" id="firstName" name="txtName">
 </div>
 
 <div class="input-group input-group-sm mb-3">
 <div class="input-group-prepend">
 <span class="input-group-text" id="LastName">Last Name: </span>
 </div>
 <input type="text" id="lastName" name="txtName">
 </div>
 
 <input  type='hidden' name='type'  value='customer' >
 
 <div class="input-group input-group-sm mb-3">
 <div class="input-group-prepend">
 <span class="input-group-text" id=phone>Contact Number: </span>
 </div>
 <input type="text" id="phone" name="txtName">
 </div>
 
 <div class="input-group input-group-sm mb-3">
 <div class="input-group-prepend">
 <span class="input-group-text" id=password>Password : </span>
 </div>
 <input type="text" id="password" name="txtName">
 </div>

<input id='password' name='password' type='text' class='form-control form-control-sm'><br>
		<input id="btnSave" name="btnSave" type="button" value="Save" class="btn btn-primary">
		<input type="hidden" id="hidItemIDSave" name="hidItemIDSave" value="">

</form>
<div id="alertSuccess" class="alert alert-success"></div>
<div id="alertError" class="alert alert-danger"></div>
<br><div id="divItemsGrid">

</div>
</div> </div> </div> 
</body>
</html>