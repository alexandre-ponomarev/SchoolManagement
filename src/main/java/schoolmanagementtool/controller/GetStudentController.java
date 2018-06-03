package schoolmanagementtool.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SchoolManagmentTool.model.Students;
import SchoolManagmentTool.model.dao.StudentListDAO;

public class GetStudentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			StudentListDAO studentListDAO = new StudentListDAO();
			ArrayList<Students> studentList = studentListDAO.getStudents();
			request.setAttribute("studentList", studentList);

			RequestDispatcher rd = request.getRequestDispatcher("students.jsp");
			rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
