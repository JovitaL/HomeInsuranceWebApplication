<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	background-color: #b3ffff;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateData(event)
{
    //event.preventDefault();
    var FirstName = document.getQuote2Form.FirstName.value;
   	if(FirstName.length > 30)
    {
      alert("FirstName can not be more than 30 chars");
      document.getQuote2Form.FirstName.focus();
      return false;
    }
    var LastName = document.getQuote2Form.LastName.value;
   	if(LastName.length > 30)
    {
      alert("LastName can not be more than 30 chars");
      document.getQuote2Form.LastName.focus();
      return false;
    }	
   	
   	var DateOfBirth = document.getQuote2Form.DateOfBirth.value;
    
	if(DateOfBirth.length > 10)
    {
      alert("DateOfBirth can not be more than 10 chars");
      document.getQuote2Form.DateOfBirth.focus();
      return false;
    }
   var SSN = document.getQuote2Form.SSN.value;
    
	if(SSN.length > 9)
    {
      alert("SSN can not be more than 9 chars");
      document.getQuote2Form.SSN.focus();
      return false;
    }
	
     var email = document.getQuote2Form.email.value;
		    
	   if(email.length > 50)
		    {
		      alert("email can not be more than 50 chars");
		      document.getQuote2Form.email.focus();
		      return false;
		    }	
	
	var nums =  /^[0-9]+$/;
    var names = /^[0-9a-zA-Z ]+$/;
    if(!FirstName.match(names))
    {
    	alert('FirstName can be only alphanumeric and can have space between characters');
    	return false;
    }
    if(!LastName.match(names))
    {
    	alert('LastName can be only alphanumeric and can have space between characters');
    	return false;
    }
    if(!SSN.match(nums))
    {
    	alert('SSN can be only numeric');
    	return false;
    }
    var email = document.getQuote2Form.email.value;
	var emailRegex = /(.+)@(.+){2,}\.(.+){2,}/;
    if(!email.match(emailRegex))
    {
    	alert('input valid email please');
    	return false;
    }
    
    return true;
}
</script>
</head>
<body>

	<img height=115px width=225px
		src="http://architectureimg.com/wp-content/uploads/2017/05/houses-merlins-cottage-charlesfrizzell-fantasy-wizard-merlin-desktop-images.jpg">

	<center>
		<h1>Homeowner Insurance</h1>

		<form name="getQuote2Form" action="GetQuote2_Serv" method="post"
			onSubmit="return validateData(event);">

			<center>

				<a href="Home_page.jsp">Home|</a>
				<!-- done -->
				<a href="GetQuote1.jsp">Get Quote|</a>
				<!-- done -->
				<a href="RetrieveQuote1_Serv">Retrieve Quote|</a>
				<!-- done -->
				<a href="ViewPolicy1_Serv">My Policies|</a>
				<!-- done -->
				<a href="./LogOut">Logout|</a>
				<!-- done -->

			</center>
			<center>
				<h3 style="color: Black;" style="text-align:center;">Homeowner
					Information</h3>
				<br> <br>
				<td>First Name*</td>
				<td><input type="text" name="FirstName" required /> <br> <br>
				<td>Last Name*</td>
				<td><input type="text" name="LastName" /> <br> <br>
				<td>Date of Birth*</td>
				<td><input type="date" name="DateOfBirth" required />
				<p>dd/mm/yyyy</p> <br> <br>
				<td>Are you retired?*</td> <input type="radio" name="retired"
					value="Yes"> Yes <input type="radio" name="retired"
					value="No"> No <br> <br>
				<td>Social Security Number*</td>
				<td><input type="text" name="SSN"
					placeholder="enter 9 digits for SSN" required /> <br> <br>
				<td>Email Address*</td>
				<td><input type="text" name="email" required /> <br> <br>
					<input type="submit" value="Continue" />
			</center>

		</form>
</body>
</html>