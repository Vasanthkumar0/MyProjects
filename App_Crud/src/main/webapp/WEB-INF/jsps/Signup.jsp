<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
<link href="css/signup.css" rel="stylesheet" ></link>    
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
<title>SignUp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style type="text/css">
body {
 
}
.login-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 100vh;
 background: url('https://t3.ftcdn.net/jpg/03/55/60/70/360_F_355607062_zYMS8jaz4SfoykpWz5oViRVKL32IabTP.jpg');
}

form {
  display: flex;
  flex-direction: column;
  padding: 45px;
  background-color: #b33d3d52;
  border-radius: 25px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  border: 2px solid black;
      margin: auto;
}

input {
  margin-bottom: 20px;
  padding: 10px;
  border-radius: 5px;
  border: none;
  font-size: 16px;
}
.h1 {
    margin-bottom: 0.5rem;
    font-family: inherit;
    font-weight: 500;
    line-height: 1.2;
    color: darkgray;
}

.buttons {
  display: flex;
  justify-content: center;
  width: 100%;
  margin-top: 20px;
}

button[type="submit"], button[type="button"] {
  padding: 10px 20px;
  background-color: #0f0;
  color: white;
  border-radius: 45px;
  border: none;
  font-size: 16px;
  cursor: pointer;
  width: 45%;
}

button[type="submit"]:hover, button[type="button"]:hover {
  background-color: #00ff00;
}

</style>
  
<script type="text/javascript">

function signup(){
	
	var user=document.getElementById("username").value;
	var pass=document.getElementById("password").value;

	
	$(document).ready(function(){
	$.ajax({
	url:"http://localhost:8080/newUser",
	data:{"username":user,"password":pass},
	type:"POST",
	dataType:"text",
	success:function(response){
		console.log(response)
		
		 if(response == "success"){
			
			Swal.fire({
			      icon: 'success',
			      title: 'success...',
			      text: 'success crendentials!',
			      footer: '<a href="">Why do I have this issue?</a>'
			     })
			}
	}
	
	
	})
	})



}

</script>

</head>
<body>
 
       
        <div class="login-container">
        <div>
         <h1 >Create Account</h1>
          <span>Already have an account? <a href="login ">Login</a></span>
        </div>
  <h2 >SignUp</h2>
  <form>
 
 
    <input type="text" id="username" placeholder="Username">
    <input type="password" id="password" placeholder="Password">
    <div class="buttons">
      
                           <button type="button" onclick="signup()">Register</button>
    </div>
  
   
  </form>
</div>
        
          
         
         
</body>
</html>