<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>

	<div id="wrapper">
	<a href="/SchoolManagementTool">Log Out</a>
		<h1>Welcome To Teacher Administration Page</h1>
		<hr>
		
		<div class="tab">
			<button class="tablinks" onclick="openTab(event, 'Books')">Books</button>
			<button class="tablinks" onclick="openTab(event, 'Students')">Students</button>
		</div>
		<div id="Books" class="tabcontent">
			<h3>Add or Edit a Book</h3>
			<form action="updateBook" method="get">
				<table>
					<tr>
						<td><label>BookID: </label></td>
						<td><input type="text" name="bookid" /></td>
					</tr>
					<tr>
						<td>Book Title:</td>
						<td><input type="text" name="bookname" /></td>
					</tr>
					<tr>
						<td>Book Author:</td>
						<td><input type="text" name="author" /></td>
					</tr>
					<tr>
						<td>Book Category:</td>
						<td><input type="text" name="category" /></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center">
							<button type="submit" name="add">Add</button>
							<button type="submit" name="edit">Edit</button>
							<button type="submit" name="delete">Delete</button>
						</td>
					</tr>
				</table>
			</form>
			<br>
			<form action="getBook" method="get">
				<button type="submit">Show All Books</button>
			</form>
		</div>
		<div id="Students" class="tabcontent">
			<h3>Add or Edit a Student</h3>
			<form action="updateStudent" method="get">
				<table>
					<tr>
						<td>StudentID:</td>
						<td><input type="text" name="studentid" /></td>
					</tr>
					<tr>
						<td>User Name:</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="text" name="studentpass" /></td>
					</tr>
					<tr>
						<td>First Name:</td>
						<td><input type="text" name="firstname" /></td>
					</tr>
					<tr>
						<td>Last Name:</td>
						<td><input type="text" name="lastname" /></td>
					</tr>
					<tr>
						<td>City:</td>
						<td><input type="text" name="city" /></td>
					</tr>
					<tr>
						<td>Postal Code:</td>
						<td><input type="text" name="postalcode" /></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center">
							<button type="submit" name="add">Add</button>
							<button type="submit" name="edit">Edit</button>
							<button type="submit" name="delete">Delete</button>
						</td>
					</tr>
				</table>
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