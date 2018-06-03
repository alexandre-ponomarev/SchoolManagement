package schoolmanagementtool.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SchoolManagmentTool.model.Books;
import SchoolManagmentTool.model.dao.BookListDAO;


public class GetBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookListDAO bookListDAO = new BookListDAO();
		ArrayList<Books> bookList = bookListDAO.getBooks();
		request.setAttribute("bookList", bookList);
		
		RequestDispatcher rd= request.getRequestDispatcher("books.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
