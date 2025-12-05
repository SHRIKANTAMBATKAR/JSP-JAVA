<%@ page import="shrikant.student" %>

<jsp:useBean id="stud" class="shrikant.student" scope="request" />

<jsp:setProperty name="stud" property="*" />

<h2>Student Details</h2>

<p>Name: <jsp:getProperty name="stud" property="name" /></p>
<p>Age: <jsp:getProperty name="stud" property="age" /></p>
<p>Course: <jsp:getProperty name="stud" property="course" /></p>
