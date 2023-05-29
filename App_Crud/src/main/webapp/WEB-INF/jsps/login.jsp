<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <link href="https://fonts.googleapis.com/css2?family=Niconne&display=swap" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200&family=Niconne&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<link href="css/login.css" rel="stylesheet" ></link>  
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
<title>login Page</title>
<script type="text/javascript">

function login(){
	
 	var username = document.getElementById("username").value
	var password = document.getElementById("password").value
	
	$(document).ready(function(){
			
			$.ajax({
				url:"http://localhost:8080/loginvalidation",
				data:{"username":username, "password":password},
			    type:"GET",
			    dataType:"text",
			success:function(response){
				
				if(response=="login successful"){
					
				    window.location.replace("http://localhost:8080/home");
				}
				else{
						alert("login filed")
					}
				}
			
			});
		
	});


}

</script>
</head>
<body>


    <div class="container">
        <div class="image">
            <h1>Welcome</h1>
        </div>
        <div class="content">
            <h1>Login</h1>
            <div class="form-group">
                <label for="">UserName</label>
                <br>
                <input type="text" class="form-control" name="" id="username" aria-describedby="helpId" placeholder="UserName">

            </div>
            <div class="form-group">
                <label for="">Password</label>
                <br>
                <input type="password" class="form-control" name="" id="password" placeholder="Password">
            </div>
            
            <br>
             <button onclick="login()" class="btn">login</button>
                  <button  class="btn"><a href="Signup">Signup</a></button>
        </div>
    </div>


</body>
</html>