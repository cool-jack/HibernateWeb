package com.hibernateWeb.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernateWeb.Beans.StudentBean;
import com.hibernateWeb.Dao.HibernateDao;

/**
 * Servlet implementation class StudentRegistration
 */
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String conPassword = request.getParameter("conPassword");
		String mobileNo = request.getParameter("mobileNo");
		
		StudentBean studentBean = new StudentBean();
		HibernateDao hibDao = new HibernateDao();
		studentBean.setFirstName(firstName);
		studentBean.setLastName(lastName);
		studentBean.setEmail(email);
		studentBean.setPassword(password);
		studentBean.setConPassword(conPassword);
		
		hibDao.insertStudent(studentBean);
		
		out.print("<html><body>inserted successfully</body><html>");
		
		
		
		
		
	}

}
