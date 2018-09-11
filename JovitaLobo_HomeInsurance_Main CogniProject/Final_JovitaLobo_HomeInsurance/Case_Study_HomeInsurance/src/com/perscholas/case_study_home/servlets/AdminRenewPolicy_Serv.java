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

import com.perscholas.case_study_home.bo.AdminBO;
import com.perscholas.case_study_home.models.AdminViewPolicy;

@WebServlet("/AdminRenewPolicy_Serv")
public class AdminRenewPolicy_Serv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userid = (String) session.getAttribute("UserId");
		int policy_number = Integer.parseInt(request.getParameter("policynum"));
		List<AdminViewPolicy> adminRenewedPolList = null;
		ArrayList<AdminViewPolicy> adminViewPolList = (ArrayList<AdminViewPolicy>) session
				.getAttribute("adminViewPolicy");
		for (AdminViewPolicy adminViewPolListitem : adminViewPolList) {
			if (adminViewPolListitem.getPolicy_number() == policy_number) {
				AdminBO adminrenewsUserBO = new AdminBO();
				try {
					adminRenewedPolList = adminrenewsUserBO.UpdatebyAdmintoRenewUserPolicy(adminViewPolListitem);

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				session.setAttribute("policyRenew", adminRenewedPolList);
				RequestDispatcher rd = request.getRequestDispatcher("AdminRenewPolicy.jsp");
				rd.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
