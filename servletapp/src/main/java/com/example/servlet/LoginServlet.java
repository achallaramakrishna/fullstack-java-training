package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String userPwd = request.getParameter("password");
		if(userName.equals("rama") && userPwd.equals("rama123")) {
			out.println("<h1> Welcome to Broadridge !!!</h1>");
				
		} else {
			response.sendRedirect("login.jsp");
		}
				
	}
	

}
