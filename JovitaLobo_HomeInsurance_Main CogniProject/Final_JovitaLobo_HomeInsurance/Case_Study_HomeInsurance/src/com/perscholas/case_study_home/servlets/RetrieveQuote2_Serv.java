package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.models.Homeowner;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Property;
import com.perscholas.case_study_home.models.Quote;
import com.perscholas.case_study_home.models.RetrieveQuote;

@WebServlet("/RetrieveQuote2_Serv")
public class RetrieveQuote2_Serv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		int quoteid = Integer.parseInt(request.getParameter("quote"));
		ArrayList<RetrieveQuote> retquoList = (ArrayList<RetrieveQuote>) session.getAttribute("retrieveQuote");
		for (RetrieveQuote retquoListitem : retquoList) {
			if (retquoListitem.getQuote_id() == quoteid) {
				session.setAttribute("quote", retquoListitem);
				RequestDispatcher rd = request.getRequestDispatcher("RetrieveQuote2.jsp");
				rd.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
