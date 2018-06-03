package SchoolManagmentTool.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import SchoolManagmentTool.model.Students;
import SchoolManagmentTool.utility.DBConnection;

public class StudentListDAO {
	public ArrayList<Students> getStudents() {
		ArrayList<Students>studentList = new ArrayList<Students>();
		try {
			Connection con = DBConnection.getConnection();

			String query = "select * from students";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("StudentID");
				String userName= rs.getString("UserName");
				String firstName= rs.getString("FirstName")	;
				String lastName=rs.getString("LastName");
				String city= rs.getString("City");
				String postal= rs.getString("PostalCode");
				
				Students student = new Students();
				student.setFirstName(firstName);
				student.setLastName(lastName);
				student.setUserName(userName);
				student.setCity(city);
				student.setPostalCode(postal);
				student.setStudentId(id);
				studentList.add(student);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return studentList;
	}
}
