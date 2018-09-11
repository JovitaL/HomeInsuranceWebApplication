package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.HomeOwnerBO;
import com.perscholas.case_study_home.bo.PolicyBO;
import com.perscholas.case_study_home.models.Homeowner;
import com.perscholas.case_study_home.models.Policy;
import com.perscholas.case_study_home.models.Quote;

@WebServlet("/BuyPolicy1_Serv")
public class BuyPolicy1_Serv extends HttpServlet {

	java.util.Date d;
	java.sql.Date date;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		Quote q = (Quote) session.getAttribute("quote");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String checkboxValue = request.getParameter("TermsRead");

		try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("PolicyStartDate"));
			date = new java.sql.Date(d.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		PolicyBO policyBO = new PolicyBO();
		if (checkboxValue == null) {
			session.setAttribute("errorMessage1", "Please e-sign to buy policy");
			RequestDispatcher rd = request.getRequestDispatcher("BuyPolicy1.jsp");
			rd.forward(request, response);
		} else {

			Policy poli = policyBO.insertPolicyByStartDate(date, d, q);
			if (poli != null && poli.getPolicy_number() != -1) {
				session.setAttribute("policy", poli);
				RequestDispatcher rd = request.getRequestDispatcher("BuyPolicy2.jsp");
				rd.forward(request, response);
			} else {
				session.setAttribute("errorMessage2", "Your start date should be within 60 days from today");
				RequestDispatcher rd = request.getRequestDispatcher("BuyPolicy1.jsp");
				rd.forward(request, response);
			}
		}
	}
}
