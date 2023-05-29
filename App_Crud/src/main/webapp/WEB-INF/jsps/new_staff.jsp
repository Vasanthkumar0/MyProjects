<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staff Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">


<script type="text/javascript">
	function saveStaff() {

		var firstName = document.getElementById("firstName").value;
		var lastName = document.getElementById("lastName").value;
		var email = document.getElementById("email").value;
		var phoneNumber = document.getElementById("phoneNumber").value;
		var staffID = document.getElementById("staffID").value;
		var department = document.getElementById("department").value;
		var jobTitle = document.getElementById("jobTitle").value;
		var startDate = document.getElementById("startDate").value;
		var address = document.getElementById("address").value;


		$(document).ready(function() {
			alert("abd");

			$.ajax({

				url : "http://localhost:8080/saveStaff",
				data : {
					"firstName" : firstname,
					"lastName" : lastName,
					"email" : email,
					"phoneNumber" : phoneNumber,
					"staffID" : staffID,
					"department" : department,
					"jobTitle" : jobTitle,
					"startDate" : startDate,
					"address" : address
				},
				type : "POST",
				dataType : "text",
				success : function(response) {
				/* 	alert(response);

					if (response == "success") {
						alert("dinesh");
						Swal.fire({
							icon : 'success',
							title : 'success...',
							text : 'success crendentials!',
							footer : '<a href="">Why do I have this issue?</a>'
						})

					} else {
						alert("wrong");
					} */
				}

			});

		});

	}

	/* function validateForm() {
	 var firstName = document.forms["registrationForm"]["firstname"].value;
	 var lastName = document.forms["registrationForm"]["lastname"].value;
	 var email = document.forms["registrationForm"]["email"].value;
	 var phoneNumber = document.forms["registrationForm"]["phoneNumber"].value;
	 var staffID = document.forms["registrationForm"]["staffID"].value;
	 var department = document.forms["registrationForm"]["department"].value;
	 var jobTitle = document.forms["registrationForm"]["jobTitle"].value;
	 var startDate = document.forms["registrationForm"]["startDate"].value;
	 var address = document.forms["registrationForm"]["address"].value;

	 if (firstName == "") {
	 alert("First name must be filled out");
	 return false;
	 }
	 if (lastName == "") {
	 alert("Last name must be filled out");
	 return false;
	 }
	 if (email == "") {
	 alert("Email must be filled out");
	 return false;
	 }
	 if (phoneNumber == "") {
	 alert("Phone number must be filled out");
	 return false;
	 }
	 if (isNaN(phoneNumber)) {
	 alert("Phone number must be numeric");
	 return false;
	 }
	 if (staffID == "") {
	 alert("Staff ID must be filled out");
	 return false;
	 }
	 if (department == "") {
	 alert("Department must be filled out");
	 return false;
	 }
	 if (jobTitle == "") {
	 alert("Job title must be filled out");
	 return false;
	 }
	 if (startDate == "") {
	 alert("Start date must be filled out");
	 return false;
	 }
	 if (address == "") {
	 alert("address must be filled out");
	 return false;
	 }
	
	 return true;
	 } */
</script>
<style>
.container {
	max-width: 500px;
	margin-top: 50px;
}

.form-group label {
	font-weight: bold;
}

.form-group input[type="text"], .form-group input[type="email"],
	.form-group input[type="date"], .form-group input[type="password"] {
	border-radius: 20px;
}

body {
	background-size: cover;
	background-image:
		url("https://media.istockphoto.com/id/963192098/photo/exam-with-school-student-having-a-educational-test-thinking-hard-writing-answer-in-classroom.jpg?s=612x612&w=0&k=20&c=sxRP5p66TLsonilgf4rlF8n7IxmraPVFpS5f5h-KEu0=");
}


head> <body><!--Custom CSS --> <style>.container {
	max-width: 500px;
	margin-top: 50px;
}

.form-group label {
	font-weight: bold;
}

.form-group input[type="text"], .form-group input[type="email"],
	.form-group input[type="date"], .form-group input[type="password"] {
	border-radius: 20px;
}

</style>

</head>
<body>

	<div class="container">

		<h1>Staff Registration</h1>

		<form>

			<div class="form-group">
				<label for="firstName">First Name:</label> <input type="text"
					class="form-control" id="firstName" name="firstName">
			</div>

			<div class="form-group">
				<label for="lastName">Last Name:</label> <input type="text"
					class="form-control" id="lastName" name="lastName">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" name="email">
			</div>
			<div class="form-group">
				<label for="phoneNumber">Phone Number:</label> <input type="text"
					class="form-control" id="phoneNumber" name="phoneNumber">
			</div>
			<div class="form-group">
				<label for="staffID">Staff ID:</label> <input type="text"
					class="form-control" id="staffID" name="staffID">
			</div>
			<div class="form-group">
				<label for="department">Department:</label> <input type="text"
					class="form-control" id="department" name="department">
			</div>
			<div class="form-group">
				<label for="jobTitle">Job Title:</label> <input type="text"
					class="form-control" id="jobTitle" name="jobTitle">
			</div>
			<div class="form-group">
				<label for="startDate">Start Date:</label> <input type="date"
					class="form-control" id="startDate" name="startDate">
			</div>

			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					class="form-control" id="address" name="address">
			</div>

			<button type="submit" onclick="saveStaff()" class="btn btn-primary">Register</button>
		</form>
	</div>

</body>
</html>