<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Employee</title>
</head>
<body>
<h2>Enter Your Details</h2>
<hr>
<form action="12345" method="post">
<pre>
<h2>

Name        : <input type="text" name="Name" pattern="[A-Za-z ]+" required/><br><br>

Email ID    : <input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="emailId"required /><br><br>

Mobile      : <input type="number" name="mobile"  required /><br><br>

Date        : <input type="date" name="date" />

Gender      : <input type="radio" id="male" name="gender" value="Male" checked><label for="male">Male</label><br>
              <input type="radio" id="female" name="gender" value="Female"><label for="female">Female</label><br><br>
          
         <input type="submit"  value="Save"/>


</h2>
</pre>
</form>
</body>
</html>