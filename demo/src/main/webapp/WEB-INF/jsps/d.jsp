<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New</title>
</head>
<body>
<form action="save" method="post">
   <h1>Employee List</h1>
   <pre>
Name        : <input type="text" name="name" pattern="[A-Za-z ]+" required/><br><br>

Email ID    : <input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="email"required /><br><br>

    <input type="submit"  value="Save"/>
         </pre>    </form>  
</body>
</html>