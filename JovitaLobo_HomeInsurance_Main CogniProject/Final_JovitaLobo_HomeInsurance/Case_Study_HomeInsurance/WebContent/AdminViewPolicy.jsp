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

		<pre>
     
    <%   String userid = (String)session.getAttribute("UserId");%>
    
      
       <h3 style="color: Black;" style="text-align:center;"><%=userid %>'s Policies</h3>   
     
    <table>
  <tr>
    <th>Policy Key</th>
    <th>Quote Id</th>
    <th>Policy Effective Date</th>
    <th>Policy End Date</th>
    <th>Policy Term</th>   
    <th>Policy Status</th>
    <th>Cancel Policy</th> 
     <th>Renew Policy</th> 
  </tr>
  
   <%ArrayList<AdminViewPolicy>  adminViewPolList =(ArrayList<AdminViewPolicy>)session.getAttribute("adminViewPolicy"); 
     
       	if( adminViewPolList !=null){
       		for(AdminViewPolicy  adminViewPolListitem:  adminViewPolList){ %>
    
  <tr>
 
    <td><%=adminViewPolListitem.getPolicy_number()%></td>
    <td><%=adminViewPolListitem.getQuote_id_Policy()%></td>
    <td> <%=adminViewPolListitem.getPolicy_start_date()%></td>
    <td><%=adminViewPolListitem.getPolicy_end_date()%></td>
    <td><%=adminViewPolListitem.getPolicy_term()%></td>
   
    <td>Active</td> 
  
<td>
 <button name="Cancel"
							onclick="window.location.href='AdminCancelPolicy_Serv?policynum=<%=adminViewPolListitem.getPolicy_number()%>'">Cancel</button>
 </td>
 <td>
 <button name="Renew"
							onclick="window.location.href='AdminRenewPolicy_Serv?policynum=<%=adminViewPolListitem.getPolicy_number()%>'">Renew</button> 
 </td>
      
  <%}%>
<%} %>   
     </center>
     
			</table>

</body>
</html>