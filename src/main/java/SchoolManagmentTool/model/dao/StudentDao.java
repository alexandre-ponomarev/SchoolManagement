package SchoolManagmentTool.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import SchoolManagmentTool.model.Students;
import SchoolManagmentTool.utility.DBConnection;

public class StudentDao {
	
	public boolean CheckStudent(String userName, String pass) {
		String userNamefromDB;
		String userPassFromDB = null;
		Students student = new Students();
		try {
			Connection con = DBConnection.getConnection();
			String query = "select * from students where username= '" + userName + "' and studentpass='" + pass + "'" ;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				userNamefromDB = rs.getString("username");
				userPassFromDB = rs.getString("studentpass");

				student.setUserName(userNamefromDB);
				student.setStudentPass(userPassFromDB);	
								
			}
			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(userPassFromDB != null) {
			return true ;
		}
		else {
			return false;
		}
		
	}
	
	public void AddStudent(String userName, String password, String fN, String lN, String city, String zip) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "insert into Students (UserName, StudentPass, FirstName, LastName, City, PostalCode) values('" + userName + "', '" + password + "', '" + fN + "', '" + lN + "', '" + city + "', '" + zip + "')";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateStudent(int studentId, String userName, String password, String fN, String lN, String city, String zip) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "update students set UserName='" + userName + "', StudentPass='" + password + "', FirstName='" + fN + "', LastName='"+ lN + "', City='"+ city +"', PostalCode='"+ zip +"' where bookid='" + studentId + "'";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DeleteStudent(int studentId) {
		try {
			Connection con = DBConnection.getConnection();
			String query = "delete from students where StudentID='" + studentId + "'";
			Statement st = con.createStatement();
			st.executeUpdate(query);

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
