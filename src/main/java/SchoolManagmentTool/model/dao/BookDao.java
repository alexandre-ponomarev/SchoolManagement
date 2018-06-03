package SchoolManagmentTool.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
			String query = "update books set bookname='"+title+"', authorname='"+author+"', category='"+category+"' where bookid='"+bookId+"'";
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
			String query = "delete from books where bookid='"+bookId+"' or bookname='"+title+"'";
			Statement st = con.createStatement();			
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
