<%@page import="SchoolManagmentTool.model.Students"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students</title>
<link rel="stylesheet"  href="style.css" type="text/css">
</head>
<body>
<table id="studentDisplay">
	<tr>
		<th>Student ID</th>
		<th>Name</th>
		<th>City</th>
		<th>Postal Code</th>
	</tr>
<% ArrayList<Students> students = (ArrayList<Students>)request.getAttribute("studentList");
	for(int i = 0; i<students.size();i++){
		Students student = students.get(i);%>
	<tr>
	<td><%out.print(student.getStudentId()); %></td>
	<td><%out.print(student.getFirstName()+" "+student.getLastName()); %></td>
	<td><%out.print(student.getCity()); %></td>
	<td><%out.print(student.getPostalCode()); %></td>
	</tr>
	<%	} %>
</table>
<a href="/SchoolManagementTool/teacherwelcome.jsp">Back</a>
</body>
</html>	