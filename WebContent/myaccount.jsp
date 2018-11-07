<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <style>
 body{
    box-sizing: border-box;
    margin: 0;
    background-color: #ffff56;
    
}

header{
    background: black;
    color:white;
    height: 50px;
    padding: 20px 30px 30px 300px;
    
}
form{
    padding:0px;
    margin:0;
}

 
 
ul{
    position: absolute;
    top: 75%;
    left:50%;
    transform:translate(-50%,-50%);
    margin: 0;
    padding:0 ;
    display: flex;
    
}
ul li{
    list-style: none;
    padding: 20px 20px 150px 20px;
}
ul li a{
    position: relative;
    display: block;
    padding: 10px 30px;
    text-align: center;
    font-size: 16px;
    color: black;
    text-transform: uppercase;
    text-decoration: none;
    transition: 0.5s;
    font-weight: bold;
}
ul li a:hover{
    color: #5C5555;

}
ul li a:before{
    content: '';
    position: absolute;
    top: 0;
    left:0;
    width: 100%;
    height: 2px;
    background: black;
    z-index: -1;
    transform: scaleX(0);
    transform-origin: right;
    transition:transform .9s;
}
ul li a:hover:before{
    transform: scaleX(1);
    transform-origin: left;


}
ul li a:after{
    content: '';
    position: absolute;
    bottom: 0;
    right:0;
    width: 100%;
    height: 2px;
    background: black;
    z-index: -1;
    transform: scaleX(0);
    transform-origin: left;
    transition:transform .9s;
}
ul li a:hover:after{
    transform: scaleX(1);
    transform-origin: right;


}
 </style>
<title>MY Account</title>
</head>
<header>
    <h1><a href="Dashboard.jsp" style="text-decoration: none; color: white; padding-left: 20%;">ONLINE ATTENDENCE
            SYSTEM </a></h1>
</header>


<body>
<div class="btt">
        <form>
            <input type="submit" formaction="Dashboard.jsp" name="" value="HOME">
        </form>
    </div>


    <form>
        <ul>
            <li>
                <a href="password.jsp">Change<br> Password</a>
            </li>
            <br><br>
            <li>

                <a href="email.jsp">Update <br>E-mail Address </a>
            </li>
            <br><br>
            <li>
                <a href="mobnumb.jsp">Update<br> Contact Number</a>
            </li>
        </ul>

    </form>

</body>
</html>