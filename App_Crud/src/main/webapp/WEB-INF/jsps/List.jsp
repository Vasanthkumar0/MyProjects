<%-- <%@page import="java.lang.reflect.Method"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>All Students</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
<style type="text/css">
body{
background-image:url("https://img.freepik.com/premium-photo/back-school-with-blue-glass-with-school-supplies-school-desk-background-clean-green-chalk-board_94863-679.jpg");
background-size:cover;
}
.card{
background-color:#f9f7f7b8
}
.menu{
    float: right;
    list-style: none;
    margin-top:30px;
}
.menu ul li{
    display: inline-block;
}
.menu ul li a{
    color: #fff;
    text-decoration: none;
    padding: 5px 20px;
    font-family: 'poppins' ,sans-serif;
    font-size: 16px;
}
.menu ul li a:hover{
    color: rgb(199, 139, 255);
}
</style>

</head>
<body>
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="home">Home<span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="addnew">New Student Add</a>
      <a class="nav-item nav-link" href="StudentHome">Student Edit</a>
      <a class="nav-item nav-link disabled" href="StudentHome">Student Delete</a>
    </div>
  </div>
</nav>
 </body>
<body>
 
   
         
    <div class="container my-2">
        <div class="card">
            <div class="card-body">
                <div class="container my-5">
                    <p class="my-5">
                        
                        
                    
                     </p>
                    <div class="col-md-10">
                        <c:if test="${students.size()==0}">
                            <h2>No record found !!</h2>
                        </c:if>
                        <c:if test="${students.size() gt 0 }"> 
                            <div>
                                <table class="table table-striped table-responsive-md">
                                    <thead>
                                  
                                        <tr>
                                        	<th>Id</th>
                                            <th>Name</th>
                                            <th>RollNo.</th>
                                            <th>Email</th>
                                            <th>Address</th>
                                            <th>Mobile</th>
                                            <th>DateOfBirth</th>
                                            <th>Gender</th>
                                            <th>department</th>
                                           
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="student" items="${studends}">
                                            <tr>
                                                <td ${student.id }></td>
                                                <td ${student.name }></td>
                                                <td ${student.rollNo }></td>
                                                <td ${student.emailId }></td>
                                                <td ${student.address }></td>
                                                <td ${student.mobile }></td>
                                                <td ${student.age }></td>
                                                <td ${student.gender }></td>
                                                <td ${student.department }></td>
 											 </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html> --%>