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
</head>
<body>

	<img height=115px width=225px
		src="http://architectureimg.com/wp-content/uploads/2017/05/houses-merlins-cottage-charlesfrizzell-fantasy-wizard-merlin-desktop-images.jpg">


	<center>
		<h1>Homeowner Insurance</h1>

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
			<h3 style="color: Black;" style="text-align:center;">Get Started
				Page</h3>
			<br> <br> <input type="button"
				onclick="window.location.href='./GetQuote1.jsp'" value="Get a Quote" />
		  	<br> <br> <input type="button"	
			  onclick="window.location.href='./RetrieveQuote1_Serv'"  
			  	value="Retrieve Quote" />


		</center>
</body>
</html>