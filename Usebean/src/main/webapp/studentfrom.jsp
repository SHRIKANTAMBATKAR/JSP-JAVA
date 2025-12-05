<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<h2>Enter Student Details</h2>
<!-- Automatically sets bean properties from request parameters -->

<form action="showstudent.jsp" method="post">
    Name: <input type="text" name="name"><br><br>
    Age: <input type="number" name="age"><br><br>
    Course: <input type="text" name="course"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>

