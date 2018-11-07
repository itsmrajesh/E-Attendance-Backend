<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/vam.css">
<title>View my Attendance</title>
</head>

<body>
<nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">e-Attendance System</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="Dashboard.jsp">Home</a></li>
                <li class="active"><a href="#"> View My Attendance </a></li>
                <li><a href="Dashboard.jsp">Back</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
            </ul>
        </div>
    </nav>
   
    
      <c:forEach items="${users}" var="user">
			${user.userName}<br>
			${user.mobile}<br>
			${user.email}<br>
			<hr>
		</c:forEach>


<br> <br> <br>
    <footer id="footer" class="grid">
        <div>Online Attendance System</div>
        <div>&copy;NCET</div>
        <div> </div>
    </footer>

</body>
</html>