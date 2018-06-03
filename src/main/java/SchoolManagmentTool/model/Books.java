package SchoolManagmentTool.model;

public class Books {
	private int bookID;
	private String bookName;
	private String athourName;
	private String category;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAthourName() {
		return athourName;
	}
	public void setAthourName(String athourName) {
		this.athourName = athourName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", athourName=" + athourName + ", category="
				+ category + "]";
	}

}
