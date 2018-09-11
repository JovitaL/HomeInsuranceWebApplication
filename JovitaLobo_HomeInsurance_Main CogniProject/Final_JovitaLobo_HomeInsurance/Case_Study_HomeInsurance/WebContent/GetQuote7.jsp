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
	<h1>Quote Summary</h1>
	<form action="GetQuote7_Serv" method="post">
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
				<th>Monthly Premium : ${quote.getMonthly_premimum()}</th>
			</tr>
			<br>
			<br>
			<!--  <input type="submit" value="Buy Quote" />  -->
			<input type="button"
				onclick="window.location.href='./BuyPolicy1.jsp'" value="Buy Quote" />
			<br>
			<br>
			<table>
				<tr>
					<th>Location Details</th>
					<th>Homeowner Details</th>
				</tr>
				<tr>
					<td>QuoteId : ${quote.getQuote_id()}</td>
					<td>First Name :${homeowner.getFirst_name()}</td>
				</tr>
				<tr>
					<td>Residence Type :${location.getResidence_type()}</td>
					<td>Last Name :${homeowner.getLast_name()}</td>
				</tr>
				<tr>
					<td>Address Line 1 :${location.getAddress_line_1()}</td>
					<td>Date of Birth(yyyy-mm-dd):${homeowner.getBirth_date()}</td>
				</tr>
				<tr>
					<td>Address Line 2:${location.getAddress_line_2()}</td>
					<td>Is retired:${homeowner.getRetired()}</td>
				</tr>
				<tr>
					<td>City :${location.getCity()}</td>
					<td>Social Security Number:${homeowner.getSSN()}</td>
				</tr>
				<tr>
					<td>State:${location.getState()}</td>
					<td>Email Address:${homeowner.getEmail_id()}</td>
				</tr>
				<tr>
					<td>Zip :${location.getZip()}</td>
				</tr>
				<tr>
					<td>Residence Use :${location.getResidence_use()}</td>
			</table>

			<br>
			<table>
				<tr>
					<th>Property Details</th>
					<th>Coverage Details</th>

				</tr>
				<tr>
					<td>Market Value :${property.getMarket_value()}</td>
					<td>Monthly Premium :${quote.getMonthly_premimum()}</td>

				</tr>
				<tr>
					<td>Year Built :${property.getBuilt_year()}</td>
					<td>Dwelling coverage :${quote.getDwelling_coverage()}</td>

				</tr>
				<tr>
					<td>Square footage :${property.getHome_square_foot()}</td>
					<td>Detached Structures :${quote.getDetatched_structure()}</td>
				</tr>
				<tr>
					<td>Dwelling Style :${property.getHome_style()}</td>
					<td>Personal Property :${quote.getPersonal_property()}</td>
				</tr>
				<tr>
					<td>Roof material:${property.getHome_roof_material()}</td>
					<td>Additional Living
						Expense:${quote.getAdditional_living_exp()}</td>
				</tr>
				<tr>
					<td>Garage Type :${property.getGarage_type()}</td>
					<td>Medical Expense:${quote.getMedical_expenses()}</td>
				</tr>
				<tr>
					<td>No of Full Baths:${property.getNum_full_bath()}</td>
					<td>Deductible:${quote.getDeductible()}</td>
				</tr>
				<tr>
					<td>No of Half Baths :${property.getNum_half_bath()}</td>
				</tr>
				<tr>
					<td>Has Swimming Pool? :${property.getSwimming_pool()}</td>
					<br>
					<br>
			</table>
			<br>
			<br>
			<input type="button"
				onclick="window.location.href='./BuyPolicy1.jsp'" value="Buy Quote" />
	</form>
</body>
</html>

