<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head><meta charset="ISO-8859-1">
<link rel="stylesheet" href="../../../user/Home.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
<!-- bootstrap -->
<title>GadgetBadget</title>
</head>
<body> 
<nav  class="navbar fixed-top navbar-white bg-white"> 
	<div class= "container">
			 	<a class="navbar-brand\" href="#">
			 		   <img src="../../../user/images/Capture.PNG" alt="logo" width="220" height="95" float="left"><br>
			 	</a>
		 		  			 
	  			<div class="topnav" id="myTopnav">
		 		<a href="#" class="active">Home</a>
		 		<a href="#">Products</a> 
		 		<a href="#">Projects</a>
		 		 <a href="#">Funding HelpDesk</a>
		 		<a href="javascript:void(0);" class="icon" onclick="myFunction()"> 
		 			 <i class="fa fa-bars"></i>
			 					  </a>
		 				</div> 
		 			<div class="dropdown">
		 			   <img src="../../../user/images/avatar.png" class="img-fluid" alt="avatar1" width="50" height="78" > 
		 		</div>
		 					
		 				</div>
		 			
		 			</nav>
		 		
		
		 			<br>
		 		  <img class="card-img-top" src="../../../user/images/admin.jpg" alt="Card image cap"  height="510">
		 		  <br><br>
		 		<center>
		 		 <div class="card border-primary mb-3" style='width:600px'>
		 		 <h5 style='color:red'>Enter your details....</h5><br> 
		 		 <center><form action='../../../user/userService/addUser/add' method='post' style='width:30rem'>
		 			<label for="exampleFormControlInput1">Email address</label>
		 			<input class="form-control" type="text" placeholder="Enter email" name="UserEmail" required><br>
		 		
		 			<label for="exampleFormControlInput1">First Name</label>
		 			<input class="form-control" type="text" placeholder="Enter first name" name="firstName" required><br>
		 			
		 			<label for="exampleFormControlInput1">Last Name</label>
		 			<input class="form-control" type="text" placeholder="Enter last name" name="lastName" required><br> 
		 		
		 			<input  type='hidden' name='type'  value='customer' >
		 		 
 		<label for="exampleFormControlInput1">Type</label><br>
	 			  <input  type="radio" name="type"  value="Admin" >
		 	<label for="exampleFormControlInput1">Admin</label>
	 		 <input  type="radio" name="type"  value="Customer">
		 	 <label for="exampleFormControlInput1">Customer</label>
		 <br><br><label for="exampleFormControlInput1">Contact Number</label> 
		 		<input class="form-control" type="text" placeholder="Enter your contact number" name="phone" required><br>
		 	<label for="exampleFormControlInput1">Password</label>
		 	<input class="form-control" type="password" placeholder="Enter your password" name="password" required><br> 
		 <input type='submit' value='Save Details' class='btn btn-success' >
		 		
		 	  </form><center>
		 		</div>
		 		</center>
		 		<!-- Footer -->
		 	<footer class="page-footer font-small color-dark" style="background-color:#1f3a93"> 
		 		
		 	 <div style="background-color: #59abe3;">
		 	   <div class="container">
		 		     <!-- Grid row-->
		 	      <div class="row py-4 d-flex align-items-center">
		 	
		 	        <!-- Grid column -->
		 		       <div class="col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0">
		 		         <h6 class="mb-0" style="color:white">Get connected with us on social networks!</h6>
		 	        </div> 
		 	        <!-- Grid column -->
		 	
		 		     <!-- Grid column --> 
		 	      <div class="col-md-6 col-lg-7 text-center text-md-right">
		 
		 		<!-- Facebook -->
		 	        <a class="fa fa-facebook"></a>
		 	        <!-- Twitter -->
		 	         <a class="fa fa-twitter "></a>
		 	         <!-- Google +-->
		 		          <a class="fa fa-google-plus-g"></a>
		 		       <!--Linkedin -->
		 	        <a class="fa fa-linkedin"></a>
		 		   <!--Instagram-->
		 	          <a class="fa fa-instagram "> </a>
		 	
		 	     </div>
		 	       <!-- Grid column -->
		 	 
		 		 </div>
		 		      <!-- Grid row-->
		 		
		    </div>
		 		  </div>
		 		
		 		<!-- Footer Links --> 
		 		<div class="container text-center text-md-left mt-5">
		 
		 	  <!-- Grid row -->
		 		 <div class="row mt-3">
		 
		 		      <!-- Grid column --> 
		 		     <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
		 	
		 		        <!-- Content --> 
		 		       <h6 class="text-uppercase font-weight-bold" >GadgetBadget Company</h6>
		 		      <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;"> 
		 	       <p style="color:white">Best funding company for young researchers....</p>
		 		    </div>
		 	     <!-- Grid column -->
		 		      <!-- Grid column -->
		 	      <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
		 
		 	<!-- Links -->
		 		        <h6 class="text-uppercase font-weight-bold">Products</h6>
		 		        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
		 		        <p>
		 		          <a href="#!\" style=\"color:white">pen Drives</a>
		 		        </p>
		 		        <p>
		 		          <a href="#" style="color:white">Hard Disks</a>
		 		        </p>
		 		     <p>
		 	        <a href="#" style="color:white">T shirts</a>
		 		      </p>
		 	        <p>
		 	         <a href="#" style="color:white">Cables</a> 
		 		       </p>
		 	      </div>
		 	      <!-- Grid column -->
		 	
		 		     <!-- Grid column -->
		 		  <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4"> 
		 	
		 	      <!-- Links -->
		 	       <h6 class="text-uppercase font-weight-bold">Contact</h6>
		 	       <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
		 	       <p style="color:white">
		 		         <i class="fa fa-home mr-3"></i> Colombo, SriLanka</p>
		 		      <p style="color:white">
		 	        <i class="fa fa-envelope mr-3" style="color:white"></i> info@example.com</p>
		 	       <p style="color:white">
		 		        <i class="fa fa-phone mr-3" style="color:white"></i> + 01 234 567 88</p> 
		 				 <p style="color:white">
		 		          <i class="fa fa-print mr-3" style="color:white\"></i> + 01 234 567 89</p> 
		 		</div>
		 		      <!-- Grid column -->
		 		    </div>
		 		    <!-- Grid row -->
		 		 
		 	</div>
		 	  <!-- Footer Links -->
		 	  <!-- Copyright -->
		 		<div class="footer-copyright text-center py-3" style="color:white">© 2020 Copyright:
		 		<a href="https://mdbootstrap.com/" style="color:white"> GadgetBadget Company</a>
		 		  </div> 
		 		 <!-- Copyright -->
		 		</footer> 
		 		<!-- Footer -->
		 		<script> 
		 		function myFunction() {
		 		  var x = document.getElementById("myTopnav");
		 		  if (x.className === "topnav") {
		 		 x.className += " responsive"}
		 		 else {
		 		    x.className = "topnav";
		 		  } 
		 		} 
		 		</script>
		 	
		 		 <!-- bootstrap -->
		 			<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		 			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script> 
		 			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
		 		<!-- bootstrap -->
		 
		 		</body> 
		 		</html>