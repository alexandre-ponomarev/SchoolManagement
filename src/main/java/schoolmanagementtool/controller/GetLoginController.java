package schoolmanagementtool.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SchoolManagmentTool.model.Students;
import SchoolManagmentTool.model.dao.StudentDao;

public class GetLoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		StudentDao studentdao = new StudentDao();		
		boolean passFromDB = studentdao.CheckStudent(user, pass);
		
		pw.write("Connected");
		
		if(user.equals("teacher") && pass.equals("teacher")) {
			
			response.sendRedirect("/SchoolManagementTool/teacherwelcome.jsp");
		}
		else if(passFromDB){			
			
			response.sendRedirect("/SchoolManagementTool/studentwelcome.jsp");
			
		}
		else {
			response.sendRedirect("/SchoolManagementTool/index.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
