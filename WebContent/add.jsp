<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/vma.css">
<title>Add Attendance</title>
<style>
.mrc {color ="green";
	
}

table {
	border-collapse: collapse;
	width: 100%;
}

th,td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #4CAF50;
	color: white;
}

tr:hover {
	background-color: #f5f5f5;
}

.active,.btn:hover {
	background-color: #666;
	color: white;
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 75%;
	margin-bottom: 15px;
}

.icon {
	padding: 5px;
	background: dodgerblue;
	color: #0A0101;
	min-width: 50px;
	text-align: center;
}

input[type=text],input[type=password],input[type=email],input[type=number]
	{
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input
[
type
=
text
]
:focus
,
input
[
type
=
password
]
:focus
,
input
[
type
=
email
]
:focus
,
input
[
type
=
number
]
:focus
,
{
background-color
:
 
#ddd
;

   
outline
:
 
none
;

 
}
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.btn1 {
	background-color: dodgerblue;
	color: white;
	padding: 10px 10px;
	border: none;
	cursor: pointer;
	width: 10%;
	opacity: 0.9;
}

.btn1:hover {
	opacity: 1;
}
</style>
</head>

<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">e-Attendance System</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="add.jsp">
					<button class="active">Add Attendance</button>
			</a></li>

			<li><span class="glyphicon glyphicon-arrow-left"></span> 
			
			<form action="back">
			<input type="submit" Value="Back">
			</form>
			
			</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="index.jsp"><span
					class="glyphicon glyphicon-log-in"></span> Logout</a></li>
		</ul>
	</div>
	</nav>
	<form action="Add">
		<label for="name"><b>User Name</b></label> <input type="text"
			placeholder="Enter User Name" name="username" required autocomplete="off">
			

			
		<label for="num"><b>Add Attendance Percentage</b></label> <input
			type="number" placeholder="Enter Percentage" name="attper" 
			autocomplete="off"> <input type="submit"
			Value="Add Attendance">
	</form>









	<hr>
	<br>
	<br>
	<br>
	<footer id="footer" class="grid">
	<div>Online Attendance System</div>
	<div>&copy;NCET</div>
	<div></div>
	</footer>

</body>
</html>

