<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>

<h2>Edit Employee</h2>

<form action="employee" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="${emp.id}">

    Name: <input type="text" name="name" value="${emp.name}" required><br><br>
    Degree: <input type="text" name="deg" value="${emp.deg}" required><br><br>
    Age: <input type="number" name="age" value="${emp.age}" required><br><br>
    Salary: <input type="number" name="salary" value="${emp.salary}" required><br><br>

    <input type="submit" value="Update Employee">
</form>

<br>
<a href="employee?action=view">Back to Employee List</a>

</body>
</html>
