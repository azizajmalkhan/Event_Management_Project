<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="login.css" rel="stylesheet">
</head>
<body>
	<center>
            <div class ="login">
                <h1>Login Form</h1>
                <form action=LoginServlet method="get">
                    <input type ="email" placeholder="Enter the username" name=usern required /><br>
                    <input type ="password" placeholder="Enter the password" name=passw required /><br>
                    <input type ="submit" value="submit"/>
                    <input type ="reset" value="clear"/>
                </form>
            </div>
            
        </center>
        <br><br><br>
        <div class ="footer">
            <span>
                <ul>
                    <li><h5>QUICK LINKS</h5></li>
                    <li>home</li>
                    <li>about</li>
                    <li>pricing</li>
                    <li>contact</li>
                </ul>
            </span>
            <span>
                <ul>
                    <li><h5>EXTRA LINKS</h5></li>
                    <li>plan wedding</li>
                    <li>our services</li>
                    <li>terms of use</li>
                    <li>privacy policy</li>
                </ul>
            </span>
            <span>
                <ul>
                    <li><h5>CONTACT INFO</h5></li>
                    <li>+91 2222333344</li>
                    <li>+91 4444666633</li>
                    <li>eventorganizer@gmial.com</li>
                    <li>Hyderabad,India - 500074</li>
                </ul>
    
            </span>                                                                   
            <span>
                <ul>
                    <li><h5>FOLLOW US</h5></li>
                    <li>facebook</li>
                    <li>twitter</li>
                    <li>instagram</li>
                    <li>linkedin</li>
                </ul>
    
            </span>          
    </div>
</body>
</html>