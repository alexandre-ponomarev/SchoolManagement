<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Teacher Administration Page</h1><hr>
<div>
<h3>Add or Edit a Book</h3>
<form action="updateBook" method="get">
<label>BookID: </label>
<input type="text" name="bookid" /><br><br>
<label>Book Title: </label>
<input type="text" name="bookname" /><br><br>
<label>Book Author: </label>
<input type="text" name="author" /><br><br>
<label>Book Category: </label>
<input type="text" name="category" /><br><br>
<button type="submit" name="add"> Add Book</button>
<button type="submit" name="edit">Edit Book</button>
<button type="submit" name="delete">Delete Book</button> 
</form>
<br>
		<form action="getBook" method="get">
		<button type="submit">Show All Books</button>
	</form>
</div>
</body>
</html>