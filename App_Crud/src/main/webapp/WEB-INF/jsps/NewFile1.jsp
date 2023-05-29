<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">*
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}
section
{
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background: #021722;
    animation: animateBgColor 30s linear infinite;
}
@keyframes animateBgColor
{
    0%
    {
        filter: hue-rotate(0deg);
    }
    100%
    {
     filter: hue-rotate(360deg);   
    }
}
.loader
{
    position: relative;
    
}
.loader span
{
    position: absolute;
    top: 0;
    left: -200px;
    width: 200px;
    transform-origin: right;
    transform: rotate(calc(18deg* var(--i)))
       
}
.loader span::before
{
   content: '';
    position: absolute;
    left: 0;
    width: 18px;
    height: 15px;
    background: #f11212;
    border-radius: 5%;
    animation: animate 2s linear infinite;
    animation-delay: calc(-2s* var(--i));
    box-shadow: 0 0 10px #f11212,
    0 0 20px #f11212,
    0 0 40px #f11212,
    0 0 60px #f11212,
    0 0 80px #f11212,
    0 0 100px #f11212;
}
@keyframes animate
{
0%

{
    transform: translateX(0) scale(0.5);
}
    50%

{
    transform: translateX(200px) scale(1);
}
    100%

{
    transform: translateX(0) scale(0.5);
}
}</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <section>
        <div class="loader">
        <span style="--i:1"></span>
            <span style="--i:1;"></span>
            <span style="--i:2;"></span>
            <span style="--i:3;"></span>
            <span style="--i:4;"></span>
            <span style="--i:5;"></span>
            <span style="--i:6;"></span>
            <span style="--i:7;"></span>
            <span style="--i:8;"></span>
            <span style="--i:9;"></span>
            <span style="--i:10;"></span>
            <span style="--i:11;"></span>
            <span style="--i:12;"></span>
            <span style="--i:13;"></span>
            <span style="--i:14;"></span>
            <span style="--i:15;"></span>
            <span style="--i:16;"></span>
            <span style="--i:17;"></span>
            <span style="--i:18;"></span>
            <span style="--i:19;"></span>
            <span style="--i:20;"></span>
            </div>
        </section>
</body>
</html>