<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: white;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: ;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}

</style>
<style type="text/css">
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
h2{
margin-top : 10px;
    background-color: #acb5e9;
}
li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding:  14px 85px;
	text-decoration: none;
	 font-size: large;
}

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	background-color: #2e3230;
}</style>
<meta charset="UTF-8">
<title>About us</title>
</head>
<body>
<ul>
	<li><a  href="/home">Home</a></li>
	<li><a href="addnew">Student Register</a>
		<li><a class="ajaxTable" href="/ajaxTable">Student List</a></li>
		<li><a href="/login" >Log-out</a></li>
		<li><a href="/about" >About</a></li>
		</ul>
 <div class="about-section">
  <h1>About Us Page</h1>
  <p>Welcome To Student Management System</p>
  <p>King Nadhivarman College of Arts and Science, one of the specialized, teaching and Multidisciplinary college in Tamil Nadu. The College was founded and run by Nadhivarman educational trust, was established in the year 1994. King Nandhivaraman College located rural setting at Thellar, near to Vandhavasi and Tindivanam. King Nandhivarman College has aimed at imparting educational in all fields of knowledge to thousands of students around from the district and state. The College has crucial role in providing access to quality to higher education from economically and socially disadvantaged classes in and Thiruvannamalai District. </p>
</div>

<h2 style="text-align:center"></h2>

</body>
</html>