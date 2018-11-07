
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 
 <style>* {
    box-sizing: border-box;
    margin: 0;
    
}

header{
    background: black;
    color:white;
    height: 70px;
    padding: 30px 30px 60px 300px;
    
}
ul{
    padding: 0px 300px 300px 0px;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 25%;
    padding: 10px;
    margin: 3px 0 15px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 15px;
}

/* Set a style for the submit button */
.SUBMITbtn {
    background-color: #24AA20;
    color: #FFFFFF;
    padding: 16px 20px;
    margin: 4px 0;
    border: none;
    cursor: pointer;
    width: 25%;
    opacity: 0.9;
}

.SUBMITbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}

.btn{
    background-color: #24AA20;
    color: #FFFFFF;
    padding: 9px;
    margin: 2px 0;
    border: none;
    cursor: pointer;
    width: 25%;
    opacity: 0.9;
}
 </style>
 
 

<body>
 <header>

        <h1><a href="index.jsp" style="text-decoration: none; color: white; padding-left: 20%;">ONLINE ATTENDENCE SYSTEM </a></h1>

    </header>


    <form action="login">
        <div class="container">
            <hr>
            <center><img src="eattan.jpeg" alt="logo" width="350" height="150"></center><br>


            <center><label for="username"><b>USERNAME</b></label></center>

            <center><input type="text" placeholder="Enter UserName" name="un" required autocomplete="off"></center>


            <center><label for="psw"><b>PASSWORD</b></label></center>

            <center><input type="password" placeholder="Enter Password" name="pwd" required></center>



            <center> <button type="submit" class="SUBMITbtn"><a href="Dashboard.jsp"></a>Login</button></center>

        </div>

    </form>

    <form action="signup.jsp">
        <div class="container">
            <center><label for="sign"><b>New User</b></label></center>
            <center> <button type="submit" class="SUBMITbtn" id="sign">Signup</button></center>
        </div>
    </form>

</body>
</html>
