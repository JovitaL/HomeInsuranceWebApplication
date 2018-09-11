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

		<form action="GetQuote3_Serv" method="post">

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
				<h3 style="color: Black;" style="text-align:center;">Property
					Details</h3>
				<br> <br>
				<td>What is the market value of your home?*</td>
				<td>$<input type="text" name="market value" required /> <br>
					<br>
				<td>What year was your home originally built?*</td>
				<td><input type="text" name="built year" required /> <br>
					<br>
				<td>Square footage*</td>
				<td><input type="text" name="home square foot" required />sq ft
					<br> <br> Dwelling style* <select name="Home Style"
					required>
						<option value="oneStory">1 story</option>
						<option value="oneHalfStory">1.5 story</option>
						<option value="twoStory">2 story</option>
						<option value="twohalfStory">2.5 story</option>
						<option value="threeStory">3 story</option>
				</select> <br> <br> Roof Material* <select
					name="Home Roof Material" required>
						<option value="Concrete">Concrete</option>
						<option value="Clay">Clay</option>
						<option value="Rubber">Rubber</option>
						<option value="Steel">Steel</option>
						<option value="Tin">Tin</option>
						<option value="Wood">Wood</option>
				</select> <br> <br> Type of Garage* <select name="Garage Type"
					required>
						<option value="Attached">Attached</option>
						<option value="Detached">Detached</option>
						<option value="Basement">Basement</option>
						<option value="BuiltIn">BuiltIn</option>
						<option value="None">None</option>
				</select> <br> <br> Number of full baths* <select
					name="NumFullBath" required>
						<option value="oneBath">1</option>
						<option value="twoBath">2</option>
						<option value="threeBath">3</option>
						<option value="moreBath">more</option>
				</select> <br> <br> Number half baths* <select name="NumHalfBath"
					required>
						<option value="oneHalfBath">1</option>
						<option value="twoHalfBath">2</option>
						<option value="threeHalfBath">3</option>
						<option value="moreHalfBath">more</option>
				</select> <br> <br>
				<td>Does your home have a swimming pool?</td> <input type="radio"
					name="swimming pool" value="Yes"> Yes <input type="radio"
					name="swimming pool" value="No" checked> No <br> <br>
				<input type="submit" value="Continue" />
			</center>

		</form>
</body>
</html>