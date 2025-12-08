<!DOCTYPE html>
<html>
<head>
    <title>Register Employee</title>
</head>
<body>

<h2>Add Employee</h2>

<form action="EmployeeServlet" method="post">
    <input type="hidden" name="action" value="add">

    Name: <input type="text" name="name" required><br><br>
    Degree: <input type="text" name="deg" required><br><br>
    Age: <input type="number" name="age" required><br><br>
    Salary: <input type="number" name="salary" required><br><br>

    <input type="submit" value="Add Employee">
</form>

<br>
<a href="EmployeeServlet?action=view">View Employees</a>

</body>
</html>
