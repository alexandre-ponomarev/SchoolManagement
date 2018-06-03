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
}
