<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="registration.css">
<style src="signup.js"></style>
</head>
<body>
	<center>
            <div class = signup>
                <h1>Signup Form</h1>
                <form action=RegisterServlet  method="get">
                    <input type="text" placeholder="Enter your first name" name="firstName" id="fn" /><br><br>
                    <input type="text" placeholder="Enter your last name" name="lastName" id="ln" /><br><br>
                    <input type="email" placeholder="Enter your username" name ="email1" id="em"  /><br><br>
                    <input type="password" placeholder="Enter your password" name="pass1" id="pa1" /><br><br>
                    <input type="password" placeholder="Enter your conform password" name="pass2" id="pa2"/><br><br>
                    <input type="number" placeholder="Enter your mobile number" name="mobile" id="mob" /><br><br>
                    <input type="submit" value="submit" onclick="signup()">
                    <input type="reset" value="clear">
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