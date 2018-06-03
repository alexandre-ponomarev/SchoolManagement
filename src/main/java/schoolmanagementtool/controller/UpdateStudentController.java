package schoolmanagementtool.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SchoolManagmentTool.model.dao.BookDao;
import SchoolManagmentTool.model.dao.StudentDao;

/**
 * Servlet implementation class UpdateBookController
 */
public class UpdateStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		StudentDao studentdao = new StudentDao();
		
		String studentid = request.getParameter("studentid");
		int id = Integer.parseInt(studentid);
		String username = request.getParameter("username");
		String password = request.getParameter("studentpass");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String city = request.getParameter("city");
		String zip = request.getParameter("postalcode");
		
		String add = request.getParameter("add");
		String edit = request.getParameter("edit");
		String delete = request.getParameter("delete");
		
		
		
		if(add != null) {
			studentdao.AddStudent(username, password, firstName, lastName, city, zip);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
		
		if(edit != null) {
			studentdao.UpdateStudent(id, username, password, firstName, lastName, city, zip);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
		
		if(delete != null) {
			studentdao.DeleteStudent(id);
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
