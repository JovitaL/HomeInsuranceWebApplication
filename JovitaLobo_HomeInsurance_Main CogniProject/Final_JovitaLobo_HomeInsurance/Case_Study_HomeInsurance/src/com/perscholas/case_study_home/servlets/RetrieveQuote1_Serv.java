package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.RetrieveQuoteBO;
import com.perscholas.case_study_home.models.Policy;
import com.perscholas.case_study_home.models.Quote;
import com.perscholas.case_study_home.models.RetrieveQuote;

@WebServlet("/RetrieveQuote1_Serv")
public class RetrieveQuote1_Serv extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String userid = (String) session.getAttribute("UserId");
		RetrieveQuoteBO retquoBO = new RetrieveQuoteBO();
		try {
			List<RetrieveQuote> retquoList = retquoBO.RetrieveAllQuoteByUser(userid);
			if (retquoList != null) {
				session.setAttribute("retrieveQuote", retquoList);
				RequestDispatcher rd = request.getRequestDispatcher("RetrieveQuote1.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
