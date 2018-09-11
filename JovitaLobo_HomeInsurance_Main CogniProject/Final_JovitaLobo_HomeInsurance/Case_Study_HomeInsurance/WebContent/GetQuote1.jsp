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
function validateComponent(event)
{
    //event.preventDefault();
    var addLine1 = document.getQuote1Form.AddressLine1.value;
   	if(addLine1.length > 50)
    {
      alert("Addrss Line 1 can not be more than 50 chars");
      document.getQuote1Form.AddressLine1.value;
      return false;
    }
   	var addLine2 = document.getQuote1Form.AddressLine2.value;
   	if(addLine2.length > 100)
    {
      alert("Addrss Line 2 can not be more than 100 chars");
      document.getQuote1Form.AddressLine2.value;
      return false;
    }
   	var state = document.getQuote1Form.State.value;
   	if(state.length > 15)
    {
      alert("State can not be more than 15 chars");
      document.getQuote1Form.State.value;
      return false;
    }
   	var city = document.getQuote1Form.City.value;
   	if(city.length > 15)
    {
      alert("City can not be more than 15 chars");
      document.getQuote1Form.City.value;
      return false;
    }
   	var zip = document.getQuote1Form.Zip.value;
   	if(zip.length > 10)
    {
      alert("Zip can not be more than 10 chars");
      document.getQuote1Form.zip.value;
      return false;
    }
    var addr = /^[0-9a-zA-Z\s.,/'- ]+$/;
    var letters = /^[0-9a-zA-Z ]+$/;
    var nums =  /^[0-9]+$/;
    if(!addLine1.match(addr))
    {
    	alert('input alphanumeric Address Line 1 characters only');
    	return false;
    }
    if(!addLine2.match(addr))
    {
    	alert('input alphanumeric Address Line 2 characters only');
    	return false;
    }
    if(!state.match(letters))
    {
    	alert('Please input alphanumeric state characters only');
    	return false;
    }
    
    if(!city.match(letters))
    {
    	alert('Please input alphanumeric city characters only');
    	return false;
    }
    if(!zip.match(nums))
    {
    	alert('Please input numeric zip characters only');
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

		<form name="getQuote1Form" action="GetQuote1_Serv" method="post"
			onSubmit="return validateComponent(event);">

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
				<h3 style="color: Black;" style="text-align:center;">Get Quote</h3>
				<br> Residence Type*: <select name="Residence Type" required>
					<option value="SingleFamilyHome">SingleFamilyHome</option>
					<option value="Condo">Condo</option>
					<option value="Townhouse">Townhouse</option>
					<option value="Rowhouse">Rowhouse</option>
					<option value="Duplex">Duplex</option>
					<option value="Apartment">Apartment</option>
				</select> <br> <br>
				<td>Address Line 1*</td>
				<td><input type="text" name="AddressLine1" required /> <br>
					<br>
				<td>Address line 2</td>
				<td><input type="text" name="AddressLine2" /> <br> <br>
				<td>State*</td>
				<td><input type="text" name="State" required /> <br> <br>
				<td>City*</td>
				<td><input type="text" name="City" required /> <br> <br>
				<td>Zip*</td>
				<td><input type="text" name="Zip" required /> <br> <br>
					Residence Use*: <select name="Residence Use" required>
						<option value="Primary">Primary</option>
						<option value="Secondary">Secondary</option>
						<option value="RentalProperty">RentalProperty</option>
				</select> <br> <br> <input type="submit" value="Continue" />
			</center>

		</form>
</body>
</html>