package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study_home.bo.AdminBO;
import com.perscholas.case_study_home.bo.UserBO;
import com.perscholas.case_study_home.models.AdminViewPolicy;
import com.perscholas.case_study_home.models.User;
import com.perscholas.case_study_home.models.ViewPolicy;

@WebServlet("/AdminHome_Serv")
public class AdminHome_Serv extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String i = request.getParameter("UserId");
		AdminBO adminViewPolBO = new AdminBO();
		User user = new User();
		try {
			if (adminViewPolBO.SearchUserforAdmin(i) == true) {

				List<AdminViewPolicy> adminViewPolList = adminViewPolBO.AdminViewAllPolicyByUser(i);
				if (adminViewPolList != null) {
					session.setAttribute("UserId", i);
					session.setAttribute("adminViewPolicy", adminViewPolList);
					RequestDispatcher rd = request.getRequestDispatcher("AdminViewPolicy.jsp");
					rd.forward(request, response);
				}
			} else {
				session.setAttribute("errorMessage1", "Invalid User");
				RequestDispatcher rd = request.getRequestDispatcher("AdminHome_Page.jsp");
				rd.forward(request, response);
			}
		}

		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		out.close();
	}
}
