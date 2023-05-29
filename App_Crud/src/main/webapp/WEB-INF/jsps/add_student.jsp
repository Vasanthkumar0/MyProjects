<%@ page language="java" contentType="text/html; charset=ISO-8859-1;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="js/app-ajax.js" type="text/javascript"></script>
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
 <link rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">  
    <style type="text/css">
body{
background-image:url("https://img.freepik.com/free-photo/ready-back-school_1134-12.jpg");
min-height:95vh;

    color: #ff8300;
   
}
.card{
background-color:#f9f7f7b8
}

</style>

<script type="text/javascript">

function save(){

	var name=document.getElementById("name").value;
	var roll=document.getElementById("roll").value;
	var email=document.getElementById("email").value;
	var address=document.getElementById("address").value;
	var mobile=document.getElementById("mobile").value;
	var age=document.getElementById("age").value;
	var gender=document.getElementById("gender").value;
	var department=document.getElementById("department").value;
	 var file = document.getElementById("file").value; 
	console.log(file);
	
	 if (name == "" || roll == "" || email == "" || address == "" || mobile == "" || age == "" || gender == "" || department == "") {
		    alert("All fields are required");
		    return false;
		  }
	
$(document).ready(function(){
	
$.ajax({
	
url:"http://localhost:8080/register",
data:{"name"    :name,
	"rollNo"    :roll,
	"email"     :email,
	"address"   :address,
	"mobile"    :mobile,
	"age"       :age,
	"gender"    :gender,
	"file":file,
	"department":department},
type:"POST",
dataType:"text",
success:function(response){
	
	if(response){
		
		Swal.fire({
		      icon: 'success',
		      title: 'success...',
		      text: 'success crendentials!',
		      footer: '<a href="">Why do I have this issue?</a>'
		     })
		   
		}
	else{
		alert("wrong")
		}
	 /*  location.reload();  */
}	
	 
})
})
}

</script>
<style type="text/css">
<style>

table, th, td {
	border: 1px solid black;
}
body {
background-image:url("https://wallpapers.com/images/hd/graduation-hat-toss-4rtredhencebrilw.jpg") ;
color:#f500ff;
	background-size: 100% 100%;
	
}

div.a {
	text-align: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}
.btn {
    display: inline-block;
    font-weight: 400;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    border: 1px solid transparent;
    padding: 0.375rem 0.75rem;
    font-size: 1.5rem;
    line-height: 1.5;
    border-radius: 1.25rem;
    transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
    width: 145px;
}
h2 {
    margin-top: 10px;
    background-color: #81620cc4;
    color: black;
}
li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding:  14px 30px;
	text-decoration: none;
	 font-size: large;
}

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	background-color: #2e3230;
}
.form-control {
    display: block;
    width: 100%;
    height: calc(2.25rem + 2px);
    padding: 0.375rem 2.75rem;
    font-size: 1rem;
    line-height: 1.5;
    color: #495057;
    background-color: #fff;
    background-clip: padding-box;
    border: 1px solid #ced4da;
    border-radius: 0.25rem;
    transition: border-color .15s ease-in-out,box-shadow .15s ease-in-out;
}
button, input, optgroup, select, textarea {
    margin: 0;
    font-family: inherit;
    font-size: inherit;
    color: black;
    line-height: inherit;
}
.col-form-label {
    padding-top: calc(0.375rem + 1px);
    padding-bottom: calc(0.375rem + 1px);
    margin-bottom: 0;
    font-size: inherit;
    line-height: 1.5;
    color: red;
}
label {
    display: inline-block;
    margin-bottom: 0.5rem;
    color: red;
}
.form-group {
    margin-bottom: 1rem;
    color: black;
}
</style>
<title>Student Register Page</title>
</head>
<body>

<ul>
	<li><a  href="/home">Home</a></li>
	<li><a href="addnew">Student Register</a>
		<li><a class="ajaxTable" href="/ajaxTable">Student List</a></li>
		<li><a href="/login" >Log-out</a></li>
		
	</ul>
		<h2 class="w3-text-light-grey" >Student Register</h2>
</body>

<body>

<div class="container">
       
        <div class="card">
            <div class="card-body">
                <div class="col-md-20">
                <div class="row">
                       <div class="form-group row-md-8" style="overflow-x:auto;">
                                      <label for="name" class="col-form-label">Name</label>
                                <input type="text" class="form-control" id="name"
                                   name="name" placeholder="Enter Name" pattern="[A-Za-z]" required="required"	/><br><br>
                            </div>
                            <div class="form-group row-md-8">
                                <label for="rollNo" class="col-form-label">Roll No.</label>
                                <input type="text" class="form-control" id="roll"
                                    name="rollNo" placeholder="Enter Roll No." required="required" /><br><br>
                            </div>
                            <div class="form-group row-md-8">
                                <label for="email" class="col-form-label">Email</label>
                                <input type="text" class="form-control" id="email"
                                    name="emailId" placeholder="abcd@gamil.com" required="required" />
                            </div>
                            </div>
                             <div class="row">
                            <div class="form-group row-md-8">
                                <label for="address" class="col-form-label">Address</label>
                                <input type="text" class="form-control" id="address"
                                    name="address" placeholder="Address" required="required"/>
                            </div>
                            <div class="form-group row-md-8">
                                <label for="mobile" class="col-form-label">Mobile</label>
                                <input type="tel" maxlength="10" class="form-control" id="mobile"
                                    name="mobile" minlength="10"  onkeypress='return event.charCode >= 48 && event.charCode <= 57'  placeholder="87########" pattern="\d{10}" required="required" />
                            </div>
                            <div class="form-group row-md-8">
                                <label for="age" class="col-form-label">Data Of Birth</label>
                                <input type="date" class="form-control" id="age"
                                   name="age"  required="required" min="18" max="25"/>
                                      </div>
                                       </div>
                                   
                                   <div class="form-group" >  
                                   <label for="gender" class="col-form-label">Gender</label><br>
                                   <input type="radio" name="gender" id="gender" class="col-form-label" value="male"> Male<br>
                                   <input type="radio" name="gender" id="gender" class="col-form-label" value="female"> Female<br>
                                   
                            </div>
                               <center> 
                            <div class="form-group ">
                                <div class="form-group col-md-8">
               <label for="department">Department</label>
   
                          <select class="form-control" id="department" required="required">
              	          <option value="">Select Department</option>
         		          <option value="Computer Science">Computer Science</option>
    					  <option value="Electronics">Electronics</option>
    					  <option value="Mechanical">Mechanical</option>
    					  <option value="Civil">Civil</option>
     					  <option value="Electrical">Electrical</option>
    					  <option value="Chemical">Chemical</option>
     
            
    </select>
                            </div>
								
								<div class="form-group ">
                                <label for="department" class="col-form-label"> Chose a Student Photo </label>
                                <input type="file"  id="file"
                                    name="file"  required="required"/>
                                     
                            </div> 	
                            </center> 
                        
                             <center>
                             <div class="form-group row-md-8">
                            <div class="col-md-4">
                      
                                <button type="submit" onclick="save()"  class="btn btn-primary" >Submit</button>
                         
                            </div>
</div>
 </center>
                  </div>
                </div>
            </div>
        </div>
   
</body>
</html>