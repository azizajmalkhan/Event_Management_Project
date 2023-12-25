function signup()
{
	var firstname=document.getElementById("fn").value
	var lastname=document.getElementById("ln").value
	var emails=document.getElementById("em").value
	var pass1=document.getElementById("pa1").value
	var pass2=document.getElementById("pass2").value
	var phoneNumber=document.getElementById("mob").value
	if(firstname=="")
	{
		alert("First Name should not be Empty")
	}
	if(lastname=="")
	{
		alert("Last Name should not be empty")
	}
	if(emails=="")
	{
		alert("Email should not be empty")
	}
	if(pass1=="")
	{
		alert("Password should not be empty")
	}
	if(pass2=="")
	{
		alert("Conform password should not be empty")
	}
	if(phoneNumber=="")
	{
		alert("phone Number should not be empty")
	}
}
	
	
	/**
 * 
 */