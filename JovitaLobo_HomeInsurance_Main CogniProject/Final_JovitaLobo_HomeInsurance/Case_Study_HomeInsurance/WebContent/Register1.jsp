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
<style>
.error {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function validateRegister(event)
{
    //event.preventDefault();
    var userName = document.RegisterForm.UserId.value;
   	if(userName.length > 20)
    {
      alert("UserId can not be more than 20 chars");
      document.RegisterForm.UserId.focus();
      return false;
    }
   	var password = document.RegisterForm.Password.value;
    
	if(password.length > 20)
    {
      alert("Password can not be more than 20 chars");
      document.RegisterForm.Password.focus();
      return false;
    }
    var letters = /^[0-9a-zA-Z]+$/;
    if(!userName.match(letters))
    {
    	alert('input alphanumeric UserId characters only');
    	return false;
    }
    if(!password.match(letters))
    {
    	alert('Please input alphanumeric password characters only');
    	return false;
    }
    
    return true;
}

</script>
<title>Insert title here</title>


</head>
<body>

	<img height=115px width=225px
		src="http://architectureimg.com/wp-content/uploads/2017/05/houses-merlins-cottage-charlesfrizzell-fantasy-wizard-merlin-desktop-images.jpg">
	<center>
		<h1>Homeowner Insurance</h1>
		<br> <br>

		<form name="RegisterForm" action="Register1_Serv" method="post"
			onSubmit="return validateRegister(event);">

			<td>User id</td>
			<td><input type="text" name="UserId" required /></td> <br> <br>
			<td>Password</td>
			<td><input type="password" name="Password" required /></td> <br>
			<br> <br> <br> <span class="error">${errorMessage2}</span>
			<%session.removeAttribute("errorMessage2"); %>
			<br>
			<td>Re-enter password</td>
			<td><input type="password" name="Re-enter Password" required /></td>
			<br> <br> <br> User_Role*: <select name="user Role"
				required>
				<option value="user">user</option>
				<option value="admin">admin</option>
			</select> <br> <br> <input type="submit" value="Login" />
	</center>
	</form>
</body>

</html>