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
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th {
	height: 50px;
}
</style>
</head>
<body>
	<img height=115px width=225px
		src="http://architectureimg.com/wp-content/uploads/2017/05/houses-merlins-cottage-charlesfrizzell-fantasy-wizard-merlin-desktop-images.jpg">


	<h1>Homeowner Insurance</h1>
	<br>
	<br>
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

	<h3 style="color: Black;" style="text-align:center;">Quote Details</h3>
	<br>
	<br>
	<table>
		<tr>
			<th>QuoteId</th>
			<th>Residence Type</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
			<th>Residence Use</th>
			<th>Status</th>
			<th>Rest of information</th>
		</tr>
		<tr>

			<td>${quote.getQuote_id()}</td>
			<td>${location.getResidence_type()}</td>
			<td>${location.getAddress_line_1()}</td>
			<td>${location.getCity()}</td>
			<td>${location.getState()}</td>
			<td>${location.getZip()}</td>
			<td>${location.getResidence_use()}</td>
			<td>New</td>
			<td>
				<form method="post" action="GetQuote7_Serv">
					<input type="submit" value="Click">
				</form>
			</td>

		</tr>
	</table>

</body>
</html>