<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% String name = request.getParameter("uname");
    String pass = request.getParameter("pass");
    response.setContentType("text/html");
    out.println("<form action='Second.jsp' >");

    String username = request.getParameter("user");
    String Password = request.getParameter("pass");
    out.println("Welcome to Mr  " + username + " your password is " + Password);
    Employee e1 = new Employee(11,"shri", 21, 20000);
    session.setAttribute("emp" ,e1);
    out.println("</form >");
    
  %>
</body>
</html>