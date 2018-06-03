package SchoolManagmentTool.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import SchoolManagmentTool.model.Books;
import SchoolManagmentTool.utility.DBConnection;

public class BookDao {
	public void AddBook(String title, String author, String category) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "insert into Books (bookname,authorname, category) values('" + title + "', '" + author
					+ "', '" + category + "')";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void UpdateBook(int bookId, String title, String author, String category) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "update books set bookname='" + title + "', authorname='" + author + "', category='"
					+ category + "' where bookid='" + bookId + "'";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DeleteBook(int bookId, String title) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "delete from books where bookid='" + bookId + "' or bookname='" + title + "'";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Books GetBookByName(String title) {
		Books book = null;
		try {
			Connection con = DBConnection.getConnection();
			String query = "select * from books where bookname='" + title + "'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.first()) {
				rs.beforeFirst();
				while (rs.next()) {
					int id = rs.getInt("BookID");
					String name = rs.getString("BookName");
					String author = rs.getString("AuthorName");
					String category = rs.getString("Category");

					book = new Books();
					book.setBookID(id);
					book.setBookName(name);
					book.setAthourName(author);
					book.setCategory(category);

				}
			} else {
				book = new Books();
				book.setBookName("No book found");
			}

			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}
}
