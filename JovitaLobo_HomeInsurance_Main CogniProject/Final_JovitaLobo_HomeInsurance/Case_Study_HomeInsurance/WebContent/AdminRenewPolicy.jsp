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
		<br> <br>

		<pre>
     
 		
 		  <%ArrayList<AdminViewPolicy>  adminRenewedPolList =(ArrayList<AdminViewPolicy>)session.getAttribute("policyRenew");
 		
     
       	if( adminRenewedPolList !=null){
       		for(AdminViewPolicy  adminRenewedPolListitem:  adminRenewedPolList){ %>
     
     Policy Renewed Successfully.
     </pre>
		<br> <br>

		<td>Policy Key :<%=adminRenewedPolListitem.getPolicy_number()%></td> <br>
		<br>

		<td>Quote Id :<%=adminRenewedPolListitem.getQuote_id_Policy()%></td> <br>
		<br>
		<td>Policy Effective Date(yyyy-mm-dd) : <%=adminRenewedPolListitem.getPolicy_start_date()%></td>
		<br> <br>
		<td>Policy End Date(yyyy-mm-dd) :<%=adminRenewedPolListitem.getPolicy_end_date()%></td>
		<br> <br>
		<td>Policy Term :2</td> <br> <br>
		<td>Policy Status :RENEWED</td> <br> <br> <br> <br>
		<br>

		<%}}%>

	</center>
</body>
</html>