package SchoolManagmentTool.model;

public class Students {
	private int studentId;
	private String userName;
	private String studentPass;
	private String firstName;
	private String lastName;
	private String city;
	private String postalCode;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStudentPass() {
		return studentPass;
	}
	public void setStudentPass(String studentPass) {
		this.studentPass = studentPass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", userName=" + userName + ", studentPass=" + studentPass
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", postalCode="
				+ postalCode + "]";
	}

}
