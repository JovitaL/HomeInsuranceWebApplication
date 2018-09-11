package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.HomeOwnerBO;
import com.perscholas.case_study_home.bo.LocationBO;
import com.perscholas.case_study_home.models.Homeowner;
import com.perscholas.case_study_home.models.Location;

@WebServlet("/GetQuote2_Serv")
public class GetQuote2_Serv extends HttpServlet {

	java.util.Date d;
	java.sql.Date date;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("FirstName");
		String b = request.getParameter("LastName");

		try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("DateOfBirth"));
			date = new java.sql.Date(d.getTime());
		} catch (ParseException e) {
			try {
				d = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("DateOfBirth"));
				date = new java.sql.Date(d.getTime());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		String retired = request.getParameter("retired");
		int f = Integer.parseInt(request.getParameter("SSN"));
		String g = request.getParameter("email");
		HomeOwnerBO ownerBO = new HomeOwnerBO();
		Homeowner h = new Homeowner(a, b, date, retired, f, g, userid);
		try {
			int HomeownerID = ownerBO.insertHomeowner(h);
			if (HomeownerID != -1) {
				out.print("Homeowner details inserted");
				h.setHomeowner_id(HomeownerID);
				session.setAttribute("homeowner", h);
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote3.jsp");
				rd.forward(request, response);
			} else {
				out.print("Not able to insert Homeowner details");
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote2.jsp");
				rd.include(request, response);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
