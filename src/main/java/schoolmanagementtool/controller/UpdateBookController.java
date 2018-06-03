package schoolmanagementtool.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SchoolManagmentTool.model.dao.BookDao;

/**
 * Servlet implementation class UpdateBookController
 */
public class UpdateBookController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		BookDao bookdao = new BookDao();
		
		String bookid = request.getParameter("bookid");
		int id = Integer.parseInt(bookid);
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String category = request.getParameter("category");
		
		
		String add = request.getParameter("add");
		String edit = request.getParameter("edit");
		String delete = request.getParameter("delete");
		
		
		
		if(add != null) {
			bookdao.AddBook(bookname, author, category);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
		
		if(edit != null) {
			bookdao.UpdateBook(id, bookname, author, category);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
		
		if(delete != null) {
			bookdao.DeleteBook(id,bookname);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
