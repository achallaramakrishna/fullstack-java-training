<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.training.model.*, com.training.dao.*, com.training.dao.impl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		BRUserDao dao = new BRUserDaoImpl();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		BRUser user = dao.checkLogin(email, password);
		
		if(user!=null) {
			response.sendRedirect("dashboard.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>