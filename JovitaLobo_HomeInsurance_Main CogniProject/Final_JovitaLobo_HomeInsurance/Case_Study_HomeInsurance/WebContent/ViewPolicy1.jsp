<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.perscholas.case_study_home.models.ViewPolicy"%>
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
		<br> <br> <a href="Home_page.jsp">Home|</a>
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
		<h3 style="color: Black;" style="text-align:center;">Policy
			Confirmation</h3>

		<pre>
      <%ArrayList<ViewPolicy>  viewPolList =(ArrayList<ViewPolicy>)session.getAttribute("viewPolicy"); 
 	if( viewPolList !=null){
 		for(ViewPolicy  viewPolListitem: viewPolList){%>
     
   <!--   Our customer service representative will contact you shortly for premium collection arrangements.--> 
     </pre>

		<br>
		<td>Quote Id :<%=viewPolListitem.getQuote_id_Policy()%></td> <br>
		<br>
		<td>Policy Key :<%=viewPolListitem.getPolicy_number()%></td> <br>
		<br>
		<td>Policy Effective Date(yyyy-mm-dd) : <%=viewPolListitem.getPolicy_start_date()%></td>
		<br> <br>
		<td>Policy End Date(yyyy-mm-dd) :<%=viewPolListitem.getPolicy_end_date()%></td>
		<br> <br>
		<td>Policy Term :<%=viewPolListitem.getPolicy_term()%></td> <br>
		<br>
		<td>Policy Status :<%=viewPolListitem.getPolicy_status() %></td> <br>
		<br> <br> <br> <br>

		<%}%>
		<%} %>
	</center>
</body>
</html>