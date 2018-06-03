package SchoolManagmentTool.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import SchoolManagmentTool.model.Books;
import SchoolManagmentTool.utility.DBConnection;

public class BookListDAO {
	public ArrayList<Books> getBooks() {
		ArrayList<Books>bookList = new ArrayList<Books>();
		try {
			Connection con = DBConnection.getConnection();

			String query = "select * from books";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("BookID");
				String name= rs.getString("BookName");
				String author= rs.getString("AuthorName");
				String category= rs.getString("Category");
				
				Books book = new Books();
				book.setBookID(id);
				book.setBookName(name);
				book.setAthourName(author);
				book.setCategory(category);
				bookList.add(book);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return bookList;
	}
}
