package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.RetrieveQuoteBO;
import com.perscholas.case_study_home.bo.ViewPolicyBO;
import com.perscholas.case_study_home.models.RetrieveQuote;
import com.perscholas.case_study_home.models.ViewPolicy;
import com.perscholas.case_study_home.models.AdminViewPolicy;

@WebServlet("/ViewPolicy1_Serv")
public class ViewPolicy1_Serv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String userid = (String) session.getAttribute("UserId");
		ViewPolicyBO viewPolBO = new ViewPolicyBO();
		try {
			List<ViewPolicy> viewPolList = viewPolBO.ViewAllPolicyByUser(userid);
			if (viewPolList != null) {
				session.setAttribute("viewPolicy", viewPolList);
				RequestDispatcher rd = request.getRequestDispatcher("ViewPolicy1.jsp");
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
