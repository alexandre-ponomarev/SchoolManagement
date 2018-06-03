<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Teacher Administration Page</h1>
	<hr>
	<div>
		<div class="tab">
			<button class="tablinks" onclick="openTab(event, 'Books')">Books</button>
			<button class="tablinks" onclick="openTab(event, 'Students')">Students</button>
		</div>
		<div id="Books" class="tabcontent">
			<h3>Add or Edit a Book</h3>
			<form action="updateBook" method="get">
				<label>BookID: </label> <input type="text" name="bookid" /><br>
				<br> <label>Book Title: </label> <input type="text"
					name="bookname" /><br> <br> <label>Book Author:
				</label> <input type="text" name="author" /><br> <br> <label>Book
					Category: </label> <input type="text" name="category" /><br> <br>
				<button type="submit" name="add">Add Book</button>
				<button type="submit" name="edit">Edit Book</button>
				<button type="submit" name="delete">Delete Book</button>
			</form>
			<br>
			<form action="getBook" method="get">
				<button type="submit">Show All Books</button>
			</form>
		</div>
		<div id="Students" class="tabcontent">
			<h3>Add or Edit a Student</h3>
			<form action="updateStudent" method="get">
				<label>StudentID: </label> <input type="text" name="studentid" /><br>
				<br> <label>User Name: </label> <input type="text"
					name="username" /><br> 
				<br> <label>Password: </label> <input type="text" name="studentpass" /><br>
				 <br> <label>First Name: </label> <input type="text" name="firstname" /><br> 
				 <br> <label>Last Name: </label> <input type="text" name="lastname" /><br>
				 <br> <label>City: </label> <input type="text" name="city" /><br>
				 <br> <label>Postal Code: </label> <input type="text" name="postalcode" /><br> <br>
				<button type="submit" name="add">Add Student</button>
				<button type="submit" name="edit">Edit Student</button>
				<button type="submit" name="delete">Delete Student</button>
			</form>
			<br>
			<form action="getStudent" method="get">
				<button type="submit">Show All Students</button>
			</form>
		</div>
	</div>
	<script>
		openTab(null, null);
		function openTab(evt, tabName) {
			var i, tabcontent, tablinks;

			tabcontent = document.getElementsByClassName("tabcontent");
			for (i = 0; i < tabcontent.length; i++) {
				tabcontent[i].style.display = "none";
			}

			tablinks = document.getElementsByClassName("tablinks");
			for (i = 0; i < tablinks.length; i++) {
				tablinks[i].className = tablinks[i].className.replace(
						" active", "");
			}

			document.getElementById(tabName).style.display = "block";
			evt.currentTarget.className += " active";
		}
	</script>
</body>
</html>