package com.perscholas.case_study_home.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Property;
import com.perscholas.case_study_home.models.Quote;

@WebServlet("/GetQuote5_Serv")
public class GetQuote5_Serv extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		Location l = (Location) session.getAttribute("location");
		Property p = (Property) session.getAttribute("property");
		Quote q = (Quote) session.getAttribute("quote");
		RequestDispatcher rd = request.getRequestDispatcher("GetQuote5.jsp");
		rd.forward(request, response);
	}
}