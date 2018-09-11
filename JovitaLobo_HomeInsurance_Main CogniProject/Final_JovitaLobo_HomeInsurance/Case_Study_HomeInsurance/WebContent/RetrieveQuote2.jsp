<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.perscholas.case_study_home.models.RetrieveQuote"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	background-color: #b3ffff;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quote Summary</title>
</head>
<body>
	<h1>Quote Summary</h1>

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
	<tr>
		<%RetrieveQuote retquoListitem =(RetrieveQuote)session.getAttribute("quote"); 
 	if(retquoListitem !=null){%>

		<th>Monthly Premium :<%=retquoListitem.getMonthly_premimum()%></th>
	</tr>
	<br>
	<br>
	<!--  <input type="submit" value="Buy Quote" />  -->
	<!--    <input type="button" onclick="window.location.href='./RetrieveQuote3.jsp'" value="Buy Quote" /> -->
	<button name=""
		onclick="window.location.href='./RetrieveQuote3.jsp?quote=<%=retquoListitem.getQuote_id()%>'">Buy
		Quote</button>

	<br>
	<br>
	<table>
		<tr>
			<th>Location Details</th>
			<th>Homeowner Details</th>
		</tr>

		<tr>
			<td>QuoteId :<%=retquoListitem.getQuote_id() %></td>
			<td>First Name :<%=retquoListitem.getFirst_name() %></td>
		</tr>
		<tr>
			<td>Residence Type :<%=retquoListitem.getResidence_type()%></td>
			<td>Last Name :<%=retquoListitem.getLast_name()%></td>
		</tr>
		<tr>
			<td>Address Line 1 :<%=retquoListitem.getAddress_line_1()%></td>
			<td>Date of Birth(yyyy-mm-dd):<%=retquoListitem.getBirth_date()%></td>
		</tr>
		<tr>
			<td>Address Line 2:<%=retquoListitem.getAddress_line_2()%></td>
			<td>Is retired:<%=retquoListitem.getRetired()%></td>
		</tr>
		<tr>
			<td>City :<%=retquoListitem.getCity()%></td>
			<td>Social Security Number:<%=retquoListitem.getSSN()%></td>
		</tr>
		<tr>
			<td>State:<%=retquoListitem.getState()%></td>
			<td>Email Address:<%=retquoListitem.getEmail_id()%></td>
		</tr>
		<tr>
			<td>Zip :<%=retquoListitem.getZip()%></td>
		</tr>
		<tr>
			<td>Residence Use :<%=retquoListitem.getResidence_use()%></td>
	</table>

	<br>
	<table>
		<tr>
			<th>Property Details</th>
			<th>Coverage Details</th>

		</tr>
		<tr>
			<td>Market Value :<%=retquoListitem.getMarket_value()%></td>
			<td>Monthly Premium :<%=retquoListitem.getMonthly_premimum()%></td>

		</tr>
		<tr>
			<td>Year Built :<%=retquoListitem.getBuilt_year()%></td>
			<td>Dwelling coverage :<%=retquoListitem.getDwelling_coverage()%></td>

		</tr>
		<tr>
			<td>Square footage :<%=retquoListitem.getHome_square_foot()%></td>
			<td>Detached Structures :<%=retquoListitem.getDetatched_structure()%></td>
		</tr>
		<tr>
			<td>Dwelling Style :<%=retquoListitem.getHome_style()%></td>
			<td>Personal Property :<%=retquoListitem.getPersonal_property()%></td>
		</tr>
		<tr>
			<td>Roof material:<%=retquoListitem.getHome_roof_material()%></td>
			<td>Additional Living Expense:<%=retquoListitem.getAdditional_living_exp()%></td>
		</tr>
		<tr>
			<td>Garage Type :<%=retquoListitem.getGarage_type()%></td>
			<td>Medical Expense:<%=retquoListitem.getMedical_expenses()%></td>
		</tr>
		<tr>
			<td>No of Full Baths:<%=retquoListitem.getNum_full_bath()%></td>
			<td>Deductible:<%=retquoListitem.getDeductible()%></td>
		</tr>
		<tr>
			<td>No of Half Baths :<%=retquoListitem.getNum_half_bath()%></td>
		</tr>
		<tr>
			<td>Has Swimming Pool? :<%=retquoListitem.getSwimming_pool()%></td>
			<br>
			<br>
	</table>
	<br>
	<br>
	<button name=""
		onclick="window.location.href='./RetrieveQuote3.jsp?quote=<%=retquoListitem.getQuote_id()%>'">Buy
		Quote</button>
	<%}%>
</body>
</html>

