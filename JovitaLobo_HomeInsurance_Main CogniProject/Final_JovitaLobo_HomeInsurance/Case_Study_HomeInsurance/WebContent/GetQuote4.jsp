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
		<h3 style="color: Black;" style="text-align:center;">Coverage
			Details</h3>
		<br> <br> <a href="GetQuote6AdditnInfo.jsp">Additional
			Info</a> <br> <br>
		<form action="GetQuote5_Serv" method="post">

			<td>Quote Id : ${quote.getQuote_id()}</td> <br> <br>
			<td>Monthly Premium :$ ${quote.getMonthly_premimum()}</td> <br>
			<br>
			<td>Dwelling Coverage : $ ${quote.getDwelling_coverage()}</td> <br>
			<br>
			<td>Detached Structures : $ ${quote.getDetatched_structure()}</td> <br>
			<br>
			<td>Personal Property : $ ${quote.getPersonal_property()}</td> <br>
			<br>
			<td>Additional Living Expenses : $
				${quote.getAdditional_living_exp() }</td> <br> <br>
			<td>Medical expense :$ ${quote.getMedical_expenses()}</td> <br>
			<br>
			<td>Deductible :$ ${quote.getDeductible()}</td> <br> <br> <input
				type="submit" value="Proceed to buy" />
		</form>
	</center>
</body>
</html>