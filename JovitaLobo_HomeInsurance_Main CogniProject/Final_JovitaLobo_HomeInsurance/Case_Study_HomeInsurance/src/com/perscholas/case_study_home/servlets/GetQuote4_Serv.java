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
import com.perscholas.case_study_home.bo.QuoteBO;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Property;
import com.perscholas.case_study_home.models.Quote;

@WebServlet("/GetQuote4_Serv")
public class GetQuote4_Serv extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		Location l = (Location) session.getAttribute("location");
		Property p = (Property) session.getAttribute("property");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		QuoteBO quoteBO = new QuoteBO();
		int location_id_Property = l.getLocation_id();
		try {
			Quote q = quoteBO.calcinsertQuote(userid, l, p);
			if (q.getQuote_id() != -1) {
				session.setAttribute("quote", q);
				RequestDispatcher rd = request.getRequestDispatcher("GetQuote4.jsp");
				rd.forward(request, response);
			} else {
				out.print("Not able to fetch Coverage details please try again");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
