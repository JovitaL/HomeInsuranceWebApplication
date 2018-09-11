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
<title>Insert title here</title>
</head>
<body>
	<img height=115px width=225px
		src="http://architectureimg.com/wp-content/uploads/2017/05/houses-merlins-cottage-charlesfrizzell-fantasy-wizard-merlin-desktop-images.jpg">

	<center>
		<h1>Homeowner Insurance</h1>

		<form action="AdminHome_Serv" method="post">

			<center>

				<a href="AdminHome_Page.jsp">Home|</a> <a href="./LogOut">Logout|</a>
				<!-- done -->
			</center>
			<center>

				<h3 style="color: Black;" style="text-align:center;">Admin
					Screen</h3>

				<br> <br>
				<td>Search User</td> <br>

				<td><input type="text" name="UserId" required /></td> <br> <br>
				<span class="error">${errorMessage1}</span>
				<%session.removeAttribute("errorMessage1"); %>
				<br> <br> <input type="submit" value="Search" />

			</center>
		</form>
</body>
</html>