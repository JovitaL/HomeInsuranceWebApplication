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

import com.perscholas.case_study_home.bo.PropertyBO;

import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Property;

@WebServlet("/GetQuote3_Serv")
public class GetQuote3_Serv extends HttpServlet {

	private String home_Style;
	private String home_Roof_Material;
	private String garage_Type;
	private String numFullBath;
	private String numHalfBath;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		Location l = (Location) session.getAttribute("location");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		double a = Double.parseDouble(request.getParameter("market value"));
		int b = Integer.parseInt(request.getParameter("built year"));
		double c = Double.parseDouble(request.getParameter("home square foot"));
		String home_Style = null;
		if (request.getParameter("Home Style") != null) {
			home_Style = request.getParameter("Home Style");
			this.home_Style = home_Style;
		}
		String home_Roof_Material = null;
		if (request.getParameter("Home Roof Material") != null) {
			home_Roof_Material = request.getParameter("Home Roof Material");
			this.home_Roof_Material = home_Roof_Material;
		}
		String garage_Type = null;
		if (request.getParameter("Garage Type") != null) {
			garage_Type = request.getParameter("Garage Type");
			this.garage_Type = garage_Type;
		}
		String numFullBath = null;
		if (request.getParameter("NumFullBath") != null) {
			numFullBath = request.getParameter("NumFullBath");
			this.numFullBath = numFullBath;
		}
		String numHalfBath = null;
		if (request.getParameter("NumHalfBath") != null) {
			numHalfBath = request.getParameter("NumHalfBath");
			this.numHalfBath = numHalfBath;
		}
		String d = request.getParameter("swimming pool");

		PropertyBO ownerBO = new PropertyBO();

		int location_id_Property = l.getLocation_id();
		Property p = new Property(a, b, c, home_Style, home_Roof_Material, garage_Type, numFullBath, numHalfBath, d,
				location_id_Property);

		try {
			int PropertyID = ownerBO.insertProperty(p);

			if (PropertyID != -1) {
				out.print("Property details inserted");
				p.setProperty_id(PropertyID);
				session.setAttribute("property", p);
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote4_Serv");
				rd.forward(request, response);

			}

			else {
				out.print("Not able to insert Property details");
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote3.jsp");
				rd.include(request, response);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
