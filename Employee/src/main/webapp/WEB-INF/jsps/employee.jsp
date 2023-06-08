<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Employee Register</title>
<script type="text/javascript">
	function add() {

		var name = document.getElementById("name").value;
		var gender = document.querySelector('input[name="gender"]:checked').value;
		var department = document.getElementById("department").value;
		var proof = [];
		var checkboxes = document
				.querySelectorAll('input[name="proof"]:checked');
		for (var i = 0; i < checkboxes.length; i++) {
			proof.push(checkboxes[i].value);
		}

		$(document).ready(function() {

			$.ajax({

				url : "http://localhost:8080/register",
				data : {
					"name" : name,
					"gender" : gender,
					"department" : department,
					"proof" : proof.join(", ")
				},
				type : "POST",
				dataType : "text",
				success : function(response) {

					if (response == "success") {

						Swal.fire({
							icon : 'success',
							title : 'success...',
							text : 'success crendentials!',
							footer : '<a href="">Why do I have this issue?</a>'
						})

					} else {
						Swal.fire({
							icon : 'error',
							title : 'Oops...',
							text : 'Something went wrong!',
							footer : '<a href="">Why do I have this issue?</a>'
						})
					}
					/*  location.reload();  */
				}
			})
		})
	}
</script>





<style type="text/css">
* {
	box-sizing: border-box;
	font-family: Georgia, serif;
}

html {
	height: 100%;
}

body {
	background-color: #847c7c9e;
}

.align {
	color: #D6D7D7;
	font-size: 17px;
	padding: 5px;
}

.grid {
	margin: auto;
	max-width: 462px;
}

h1 {
	font-size: 38px;
	font-weight: 100;
	text-transform: uppercase;
	color: black;
	text-align: center;
}

h2 {
	font-size: 38px;
	font-weight: 100;
	text-transform: uppercase;
	text-align: center;
	text-align: center;
}

.registration_form {
	background-image: linear-gradient(#017681, #028D9A);
	box-shadow: 0 0 250px #70CED7;
	padding: 20px 15px;
}

.input {
	border: 1px solid #242c37;
	border-radius: 5px;
	background-color: transparent;
	text-align: center;
	color: #D6D7D7;
	font-size: 17px;
	outline: 0;
	padding: 8px;
	width: 80%;
	margin: 15px;
}

.input::placeholder {
	color: #A8B3B4;
}

.button {
	background-color: #01565E; //
	background-image: linear-gradient(160deg, #4ba3e2, #67b1d4);
	color: #fff;
	padding: 8px;
	margin-top: 5%;
	margin-bottom: 2%;
	width: 50%;
	border: none;
	border-radius: 8px;
	font-size: 20px;
	transition: all 0.5s;
	outline: none;
}

.button:hover {
	cursor: pointer;
	box-shadow: 0px 4px 17px 3px #70CED7;
}

.login_error {
	display: none;
	font-size: 16px;
}
</style>


</head>


<h1>WELCOME</h1>
<body class="align">
	<div class="grid" align="left">

		<div class="registration_form">

			<h2>registration</h2>

			<pre>
Name                            : <input type="text" name="name"
					id="name" required="required" />

Gender                          : <input type="radio" name="gender"
					id="gender" value="male">Male
	                                <input type="radio" name="gender"
					value="female">Female
	                      
Department                   : <select name="department" id="department"
					required="required">
                                 <option>Select</option>
                                <option value="Team Leader">Team Leader</option>
                                <option value="Developer">Developer</option>
                                <option value="Tester">Tester</option>
                          </select>
  
Please Click your Proof : <input type="checkbox" id="aadhar"
					required="required" name="proof" value="aadhar card">Aadhar card
                                         <input type="checkbox"
					id="pan card" name="proof" value="pan card">Pan card   	                       
                                         <input type="checkbox"
					id="Education Certification" name="proof"
					value="Education Certification">Education Certification 							
      
			       <input type="button" value="Submit" onclick="add()" />
     </pre>

		</div>

	</div>
</body>
</html>
