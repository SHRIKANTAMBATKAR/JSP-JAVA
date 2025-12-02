<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication</title>
</head>
<body>
<%@ include file="header.html" %>

<%
    String name = request.getParameter("uname");
    String pass = request.getParameter("pass");

    if(name != null && name.equals("shrikant")) {
        out.println("Hello, Welcome Mr. " + name);
    } else {
      out.println("Enter correct name");
      request.getRequestDispatcher("login.html").include(request, response);
    }
%>

</body>
</html>
