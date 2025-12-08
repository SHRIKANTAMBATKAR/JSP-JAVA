<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>

<h2>All Employees</h2>

<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Degree</th>
        <th>Age</th>
        <th>Salary</th>
        <th>Action</th>
    </tr>

    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.deg}</td>
            <td>${emp.age}</td>
            <td>${emp.salary}</td>

            <td>
                <a href="employee?action=edit&id=${emp.id}">Edit</a> |
                <a href="employee?action=delete&id=${emp.id}"
                   onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

<br>
<a href="register.jsp">Add New Employee</a>

</body>
</html>
