package com.perscholas.case_study_home.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import com.perscholas.case_study_home.bo.UserBO;
import com.perscholas.case_study_home.models.User;

@WebServlet("/StartPage_Serv")
public class StartPage_Serv extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String i = request.getParameter("UserId");
		String j = request.getParameter("Password");
		UserBO userBO = new UserBO();
		User user = new User();
		try {
			if (userBO.checkLogin(i, j) == true) {
				session.setAttribute("UserId", i);
				/*Note: If your UserId and password are "admin" and the entry is present in the 'user table' for user-role='admin' you can login as admin.*/
				if (i.equals("admin") && j.equals("admin")) {
					RequestDispatcher rd = request.getRequestDispatcher("AdminHome_Page.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Home_page.jsp");
					rd.forward(request, response);
				}
			} else {
				session.setAttribute("errorMessage1", "Please enter valid credentials");
				RequestDispatcher rd = request.getRequestDispatcher("StartPage.jsp");
				rd.include(request, response);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		out.close();
	}
}
