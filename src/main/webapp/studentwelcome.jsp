<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="SchoolManagmentTool.model.Books"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"  href="style.css" type="text/css">
</head>
<body>
	<h1>Welcome Student</h1>
	<div>
		<h3>Search for a book</h3>
		<form action="getBook" method="get">
			<label>Book Title: </label> <input type="text" name="bookname" /><br>
			<button type="submit">Search</button>
		</form>
		<%
			Books book = (Books) request.getAttribute("bookNameForStudent");
			if (book != null) {
				if (book.getBookName().equals("No book found")){
					%>
					<h2>No book found</h2>
					<%
					return;
				}
		%>
		<table id="bookDisplay">
			<tr>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Author</th>
				<th>Category</th>
			</tr>
			<%
				//Books book = (Books) request.getAttribute("bookNameForStudent");
			%>
			<tr>
				<td>
					<%
						out.print(book.getBookID());
					%>
				</td>
				<td>
					<%
						out.print(book.getBookName());
					%>
				</td>
				<td>
					<%
						out.print(book.getAthourName());
					%>
				</td>
				<td>
					<%
						out.print(book.getCategory());
					%>
				</td>
			</tr>

		</table>
		<%
			}
		%>
	</div>
</body>
</html>