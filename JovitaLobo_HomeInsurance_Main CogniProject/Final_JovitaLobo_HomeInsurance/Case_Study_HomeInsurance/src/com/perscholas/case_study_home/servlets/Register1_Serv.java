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

import com.perscholas.case_study_home.bo.AdminBO;
import com.perscholas.case_study_home.bo.UserBO;

import com.perscholas.case_study_home.models.User;

@WebServlet("/Register1_Serv")
public class Register1_Serv extends HttpServlet {

	private String userRole;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		boolean match = true;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("UserId");
		String b = request.getParameter("Password");
		String c = request.getParameter("Re-enter Password");
		if (c != null && !c.equals(b)) {
			session.setAttribute("errorMessage2", "Password and reentered password dont match");
			RequestDispatcher rd = request.getRequestDispatcher("Register1.jsp");
			rd.forward(request, response);
			match = false;
		}
		String userRole = null;
		if (request.getParameter("user Role") != null) {
			userRole = request.getParameter("user Role");
			this.userRole = userRole;
		}
		UserBO userBO = new UserBO();
		User u = new User(a, b, userRole);
		String expectedRole = "user";
		boolean roleStatus = userRole.equals(expectedRole);
		if (roleStatus && match) {
			try {
				if (userBO.registerUser(u) > 0) {
					// out.print("Registration successful");
					session.setAttribute("UserId", a);
					RequestDispatcher rd = request.getRequestDispatcher("Home_page.jsp");
					rd.forward(request, response);
				} else {
					// out.print("Not able to register. Please try again");
					RequestDispatcher rd = request.getRequestDispatcher("Register1.jsp");
					rd.include(request, response);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (userRole.equals("admin") && a.equals("admin") && b.equals("admin") && c.equals("admin")) {
			/* (Assumption)Please make an entry for 'admin' in the 'user table' by giving UserId,password,Re-entered pasword and user-role as 'admin' using register page */
			AdminBO adminBO = new AdminBO();
			User adminuser = new User(a, b, userRole);
			try {
				if (adminBO.insertAdmin(adminuser) > 0) {
					session.setAttribute("UserId", a);
					session.setAttribute("Password", b);
					session.setAttribute("roleadmin", userRole);
					RequestDispatcher rd = request.getRequestDispatcher("AdminHome_Page.jsp");
					rd.include(request, response);
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
