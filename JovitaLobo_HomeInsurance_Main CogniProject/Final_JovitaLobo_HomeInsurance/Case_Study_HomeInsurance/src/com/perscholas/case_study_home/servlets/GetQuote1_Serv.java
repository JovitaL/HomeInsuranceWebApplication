package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.LocationBO;
import com.perscholas.case_study_home.bo.UserBO;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.User;

@WebServlet("/GetQuote1_Serv")
public class GetQuote1_Serv extends HttpServlet {

	private String residenceType;
	private String residenceUse;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String residenceType = null;
		if (request.getParameter("Residence Type") != null) {
			residenceType = request.getParameter("Residence Type");
			this.residenceType = residenceType;
		}

		String a = request.getParameter("AddressLine1");
		String b = request.getParameter("AddressLine2");
		String d = request.getParameter("City");
		String c = request.getParameter("State");
		int f = Integer.parseInt(request.getParameter("Zip"));
		String residenceUse = null;
		if (request.getParameter("Residence Use") != null) {
			residenceUse = request.getParameter("Residence Use");
			this.residenceUse = residenceUse;
		}

		LocationBO locBO = new LocationBO();
		Location l = new Location(residenceType, a, b, c, d, f, residenceUse, userid);

		try {
			int locID = locBO.insertLocation(l);
			if (locID != -1) {
				out.print("Location details inserted");
				l.setLocation_id(locID);
				session.setAttribute("location", l);
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote2.jsp");
				rd.forward(request, response);
			} else {
				out.print("Not able to insert Location details");
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote1.jsp");
				rd.include(request, response);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
