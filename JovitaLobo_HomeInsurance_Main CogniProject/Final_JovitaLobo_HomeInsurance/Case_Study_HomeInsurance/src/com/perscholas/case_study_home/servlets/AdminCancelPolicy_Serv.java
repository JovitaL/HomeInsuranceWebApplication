package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.AdminBO;
import com.perscholas.case_study_home.models.AdminViewPolicy;
import com.perscholas.case_study_home.models.RetrieveQuote;

@WebServlet("/AdminCancelPolicy_Serv")
public class AdminCancelPolicy_Serv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		int policy_number = Integer.parseInt(request.getParameter("policynum"));
		ArrayList<AdminViewPolicy> adminViewPolList = (ArrayList<AdminViewPolicy>) session
				.getAttribute("adminViewPolicy");

		for (AdminViewPolicy adminViewPolListitem : adminViewPolList) {
			if (adminViewPolListitem.getPolicy_number() == policy_number) {
				AdminBO admincancelsUserBO = new AdminBO();
				session.setAttribute("policy", adminViewPolListitem);
				RequestDispatcher rd = request.getRequestDispatcher("AdminCancelPolicy.jsp");
				rd.forward(request, response);
				try {
					boolean rowUpdated = admincancelsUserBO.UpdatebyAdmintoCancelUserPolicy(adminViewPolListitem);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}