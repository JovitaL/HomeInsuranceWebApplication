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

		<form action="BuyPolicy1_Serv" method="post">
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
				<h3 style="color: Black;" style="text-align:center;">Buy Policy</h3>
			</center>
			<br> <br>
			<td>QuoteId:${quote.getQuote_id()}</td> <br> <br>
			<center>
				<pre>
 <font size="3" color="red">Note:</font>Policy start date cannot be more than 60 days from today's date.

 <br>
<span class="error">${errorMessage2}</span> 
<%
 	session.removeAttribute("errorMessage2");
 %>
 <br>
 Enter Policy Start Date:<td><input type="text"
						name="PolicyStartDate" required />dd/MM/yyyy</td>
 <br>
<a href="BuyPolicyTerms.jsp">Please click and read terms and conditions before buying policy</a> 

<br>
<span class="error">${errorMessage1}</span>
<%
	session.removeAttribute("errorMessage1");
%>
<br>
 <input type="checkbox" name="TermsRead" value="IHaveRead"> This is to acknowledge that I have read the terms and conditions of the policy.<br>
 <input type="submit" value="Submit" /> 
 
</pre>
			</center>
			<br>
		</form>
</body>
</html>