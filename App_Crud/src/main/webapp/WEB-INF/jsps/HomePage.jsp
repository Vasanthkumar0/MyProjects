<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<title>Home</title>
<script type="text/javascript">
$(function() {
	let slideIndex = 1;
	showSlides(slideIndex);

	// Next/previous controls
	function plusSlides(n) {
	  showSlides(slideIndex += n);
	}

	// Thumbnail image controls
	function currentSlide(n) {
	  showSlides(slideIndex = n);
	}

	function showSlides(n) {
	  let i;
	  let slides = document.getElementsByClassName("mySlides");
	  let dots = document.getElementsByClassName("dot");
	  if (n > slides.length) {slideIndex = 1}
	  if (n < 1) {slideIndex = slides.length}
	  for (i = 0; i < slides.length; i++) {
	    slides[i].style.display = "none";
	  }
	  for (i = 0; i < dots.length; i++) {
	    dots[i].className = dots[i].className.replace(" active", "");
	  }
	  slides[slideIndex-1].style.display = "block";
	  dots[slideIndex-1].className += " active";
	} 
		});
</script>
<style type="text/css">

body {

	background-color:#021010 !important;
	background-repeat: no-repeat;
	 background-size: 100% 100%;	
	 text-align: center;
	
}
h1 {
background-color: aliceblue;
    margin-top: 0px;
    margin-bottom: 0px;
}
div.a {
  text-align: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #0040ff;
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
	background-color: #04AA6D;
}
body {

    background-color:#dddddd;     
  font-family: "Lato", sans-serif;
}
/* h1,h2{
    background-color: burlywood;
} */

.w3-container{
    padding: 10px 10px 10px 10px;
    text-align: center;
  
}
h1 {
    background-color: black;
    margin-top: 0px;
    margin-bottom: 0px;
    color: white;
}
	 <!-- Slideshow container -->
<style>
* {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides {display: none;}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  animation-name: fade;
  animation-duration: 2s;
}

@keyframes fade {
  from {opacity: .10} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
</style>


</head>
<body>

<ul>
	<li><a  href="/home">Home</a></li>
	<li><a href="addnew">Student Register</a>
		<li><a class="ajaxTable" href="/ajaxTable">Student List</a></li>

		<li><a href="/about" >About</a></li>
				<li><a href="/login" >Log-out</a></li>
		</ul>
	<h1>Welcome To Student Management</h1>
	<div id="slideshow"></div>




<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 10</div>
  <img src="https://images.unsplash.com/photo-1592930954854-7d00c87d0cf4?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80" style="width:100%">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 10</div>
  <img src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/406173971.jpg?k=80c290c871d344a32dfe6ef15aa24f81f9eda3636e7eea5154bfb92d1cb77580&o=&hp=1" style="width:100%">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 10</div>
  <img src="https://images.unsplash.com/photo-1523240795612-9a054b0db644?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c3R1ZGVudCUyMGxpZmV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" style="width:100%">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">4 / 10</div>
  <img src="https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fHN0dWRlbnQlMjBsaWZlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" style="width:100%">
  <div class="text">Caption Four</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">5 / 10</div>
  <img src="https://images.unsplash.com/photo-1562774053-701939374585?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y29sbGVnZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60" style="width:100%">
  <div class="text">Caption Five</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">6 / 10</div>
  <img src="https://images.unsplash.com/photo-1519452575417-564c1401ecc0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Y29sbGVnZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60" style="width:100%">
  <div class="text">Caption Six</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">7 / 10</div>
  <img src="https://images.unsplash.com/photo-1523580846011-d3a5bc25702b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80" style="width:100%">
  <div class="text">Caption Seven</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">8 / 10</div>
  <img src="https://media.istockphoto.com/id/654454404/photo/graduation-hat-with-degree-paper-on-a-stack-of-book.jpg?s=612x612&w=0&k=20&c=OxD0WxoyTJTy_OmmDdfbD8dsuFO1_xak8-RuVJyEhy8=" style="width:100%">
  <div class="text">Caption Eight</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">9 / 10</div>
  <img src="https://media.istockphoto.com/id/969013932/photo/mumbai-university-library-building.jpg?s=612x612&w=0&k=20&c=gBJltZXMsMbdqBtJE0R7Hj-uy3CBOeJdtGHLB4jfAX0=" style="width:100%">
  <div class="text">Caption Nine</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">10 / 10</div>
  <img src="https://media.istockphoto.com/id/1177184973/photo/e-learning-for-student-and-university-concept.jpg?s=612x612&w=0&k=20&c=jy2_wlYLK6jMuTzRgGca7mkI8RLqVcpHm7WtsI8Utgk=" style="width:100%">
  <div class="text">Caption Ten</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
</div>

<script>
let slideIndex = 0;
showSlides();

function showSlides() {
	  let i;
	  let slides = document.getElementsByClassName("mySlides");
	  let dots = document.getElementsByClassName("dot");
	  for (i = 0; i < slides.length; i++) {
	    slides[i].style.display = "none";
	  }
	  slideIndex++;
	  if (slideIndex > slides.length) {
	    slideIndex = 1
	  }
	  for (i = 0; i < dots.length; i++) {
	    dots[i].className = dots[i].className.replace(" active", "");
	  }
	  slides[slideIndex-1].style.display = "block";
	  dots[slideIndex-1].className += " active";
	  setTimeout(showSlides, 2000); // Change the time here (in milliseconds)
	}
</script>


	<head>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
</head>

<footer>
  <div class='container'>
    <div class='img-card'>
      <i class = 'material-icons' id='icons'>location_on</i>
    </div>
    <div class = 'text-card'>
      <b>Location</b>
      <button><a href="https://www.google.com/maps">Map</a></button>
    </div>
  </div>
  
  <div class='container'>
    <div class='img-card'>
      <i class = 'material-icons' id='icons'>call</i>
    </div>
    <div class = 'text-card'>
      <b>Contact</b>
      <p>+44 018273
      fa@gmail.com</p>
    </div>
  </div>
  
  <div class='container'>
    <div class='img-card'>
      <i class = 'material-icons' id='icons'>person</i>
    </div>
    <div class = 'text-card'>
      <b>Account</b>
      <button><a href="login">Login</a></button>
    </div>
  </div>
  
  <div class='container'>
    <div class='img-card'>
      <i class = 'material-icons' id='icons'>settings</i>
    </div>
    <div class = 'text-card'>
      <b>Settings</b>
  <button>Setting</button>
    </div>
  </div>
</footer>



<style>
@import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@400;700&family=Space+Grotesk&display=swap');
body{
  background-color: #560bad;
}

footer{
  width: 100%;
  height: 40vh;
/*   background-image: url("https://images.pexels.com/photos/220357/pexels-photo-220357.jpeg?auto=compress&cs=tinysrgb&w=1600");
 */
background-color:lightslategray; 
  display: flex;
  justify-content: space-evenly;
  align-items: center;
}

.container{
  height: 200px;
  width: 100px;
  
  position: relative;
}

.img-card{
  width: 100px;
  height: 100px;
  background-color: #e5e900;
  z-index: 2;
  
  display: flex;
  justify-content: center;
  align-items: center;
  
  position: absolute;
  top: 25%;
  
  transition-duration: 0.3s;
}

.img{
  width : 50px;
  padding: 25px;
}

#icons{
  font-size: 70px;
  padding: 15px;
}

.text-card{
  width: 100px;
  height: 100px;
  color: #4cc9f0;
  font-family: 'Quicksand', sans-serif;
  font-size: 12px;
  background-color: #240046;
  z-index: 1;
  
  position: absolute;
  top: 25%;
  
  transition-duration: 0.3s;
  
  box-sizing: border-box;
  padding: 1em;
}

.container:hover .img-card{
  top: 0px;
  box-shadow: -3px -26px 70px 16px rgba(255,199,255,0.3);
}

.container:hover #icons{
  color: red;
}

.container:hover .text-card{
  top: 50%;
}

.text-card button{
  background-color: #4cc9f0;
  color: black;
  border-radius: 10px;
  margin-top: 1em;
  padding: 0.5em 1em;
}

.text-card button:hover{
  color: white;
}

</style>

</body>
</html>