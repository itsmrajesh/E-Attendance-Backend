<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="Stylesheet" type="text/css" href="css/mystyle.css">
<style>
body {
	background-color: #18B9D6;
	padding: 0px;
	margin: 0px;
	background-image: url("man.jpg");
	background-image: repeat 0;
}

header {
	margin: 0px;
	padding: 20px 20px 20px 0px;
	background: black;
	height: 50px;
}

.header {
	align-content: inherit;
}

h1 {
	color: white;
	padding-left: 30%;
	padding: -20px 20px 50px 100px;
	top: 0%;
}

.img1 {
	padding-left: 39%;
	transition: all 1s;
}

.awe:hover {
	transition: scale(1.1);
}

h3 {
	padding-left: 37%;
}

ul {
	position: absolute;
	top: 75%;
	left: 50%;
	transform: translate(-50%, -50%);
	margin: 0;
	padding: 0;
	display: flex;
}

ul li {
	list-style: none;
}

ul li a {
	position: relative;
	display: block;
	padding: 10px 15px;
	text-align: center;
	font-size: 16px;
	color: black;
	text-transform: uppercase;
	text-decoration: none;
	transition: 0.5s;
	font-weight: bold;
}

ul li a:hover {
	color: #F1EBEB;
}

ul li a:before {
	content: '';
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 2px;
	background: black;
	z-index: -1;
	transform: scaleX(0);
	transform-origin: right;
	transition: transform .9s;
}

ul li a:hover:before {
	transform: scaleX(1);
	transform-origin: left;
}

ul li a:after {
	content: '';
	position: absolute;
	bottom: 0;
	right: 0;
	width: 100%;
	height: 2px;
	background: black;
	z-index: -1;
	transform: scaleX(0);
	transform-origin: left;
	transition: transform .9s;
}

ul li a:hover:after {
	transform: scaleX(1);
	transform-origin: right;
}

.btt input[type="submit"] {
	border: none;
	outline: none;
	background: blue;
	height: 50px;
	width: 300px;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
}

.logout {
	padding-top: 10px;
	align-self: right;
}
</style>
<title>Dashboard</title>
</head>

<body style="background-image: url(man.jpg)">
	<header class="header">
	<h1>ONLINE ATTENDENCE SYSTEM</h1>
	<img src="e_att.png" width="100" height="60">

	<p style="text-align: right">
		<b><%=(new java.util.Date()).toLocaleString()%></b>
	</p>

	</header>

	<div class="img1">
		<img class="awe" src="admin.png" alt="Admin logo" width="25%"
			height="25%">
	</div>
	<h2></h2>
	<h3>
		<%
			out.println("Name : " + request.getParameter("un"));
		%>
	</h3>
	<h3><% out.println("ID : " + request.getAttribute("id")); %> </h3> 
	<h3><%out.println("Attendance is : " + request.getAttribute("att")+"%"); %> </h3>
	<p></p>
	<form onsubmit="return myfun()">
		<ul>
			<br>
			<li><a class="btnacc" href="checkclass.jsp">Check Class</a></li>
			<br>
			<li><a class="btnacc" href="timetable.jsp">Check Time Table</a></li>
			<br>
			<li><a class="btnacc" href="myaccount.jsp"><span
					class="glyphicon glyphicon-wrench"></span>My Account</a></li>
			<br>
			<br>
			<li><a class="btnacc" href="index.jsp"><b>Logout</b></a></li>
			<br>
		</ul>
	</form>



</body>
</html>