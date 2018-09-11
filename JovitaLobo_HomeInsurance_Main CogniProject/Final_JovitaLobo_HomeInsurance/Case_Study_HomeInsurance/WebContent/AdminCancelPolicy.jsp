<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.perscholas.case_study_home.models.AdminViewPolicy"%>
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
		<br> <br> <a href="AdminHome_Page.jsp">Home|</a> <a
			href="./LogOut">Logout|</a>
		<!-- done -->
	</center>
	<center>
		<h3 style="color: Black;" style="text-align:center;">Policy
			Details</h3>
		<br>

		<pre>
     
 		
 		 <%AdminViewPolicy adminViewPolListitem =(AdminViewPolicy)session.getAttribute("policy"); 
 	if(adminViewPolListitem !=null){%>
     
     Policy cancelled successfully.
     </pre>
		<br> <br>

		<td>Policy Key :<%=adminViewPolListitem.getPolicy_number()%></td> <br>
		<br>

		<td>Quote Id :<%=adminViewPolListitem.getQuote_id_Policy()%></td> <br>
		<br>
		<td>Policy Effective Date(yyyy-mm-dd) : <%=adminViewPolListitem.getPolicy_start_date()%></td>
		<br> <br>
		<td>Policy End Date(yyyy-mm-dd) :<%=adminViewPolListitem.getPolicy_start_date()%></td>
		<br> <br>
		<td>Policy Term :<%=adminViewPolListitem.getPolicy_term()%></td> <br>
		<br>
		<td>Policy Status :CANCELLED</td> <br> <br> <br> <br>
		<br>

		<%}%>

	</center>
</body>
</html>