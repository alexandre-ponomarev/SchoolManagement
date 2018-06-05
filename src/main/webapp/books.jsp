<%@page import="SchoolManagmentTool.model.Books"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
<link rel="stylesheet"  href="style.css" type="text/css">
</head>
<body>
<table id="bookDisplay">
	<tr>
		<th>Book ID</th>
		<th>Book Name</th>
		<th>Book Author</th>
		<th>Category</th>
	</tr>
<% ArrayList<Books> books = (ArrayList<Books>)request.getAttribute("bookList");
	for(int i = 0; i<books.size();i++){
		Books book = books.get(i);%>
	<tr>
	<td><%out.print(book.getBookID()); %></td>
	<td><%out.print(book.getBookName()); %></td>
	<td><%out.print(book.getAthourName()); %></td>
	<td><%out.print(book.getCategory()); %></td>
	</tr>
	<%	} %>
</table>
<a href="/SchoolManagementTool/teacherwelcome.jsp">Back</a>
</body>
</html>