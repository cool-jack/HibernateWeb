package com.hibernateWeb.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HibernateDao hibDao = new HibernateDao();
		
		String getAll = request.getParameter("getAll");
		
		String id = request.getParameter("id");
		String idDelete = request.getParameter("id_delete");
		
		String studentById = request.getParameter("getStudentById");
		String deleteStudentId = request.getParameter("deleteStudentById");
		String deleteAll = request.getParameter("deleteAll");
		
		if(getAll != null)
		{
			List<StudentBean> studentList = hibDao.getAllStudent();
			
			out.print("<html></body><table><tr><td>name</td><td>email</td><td>mobile no</td></tr>");
			for(StudentBean list : studentList )
			{
				out.print("<html></body><table><tr><td>"+list.getFirstName()+" "+list.getLastName()+"</td><td>"+list.getEmail()
						+ "</td><td>"+list.getMobileNo()+"</td></tr>");
			}
			out.print("</table>");
		}
		else if(studentById != null){
			StudentBean studentBean = hibDao.getStudentById(Integer.parseInt(id));
			
			if(studentBean != null){
				out.print("<html></body>name : "+studentBean.getFirstName()+" "+studentBean.getLastName() );
				out.print("<br>email : "+studentBean.getEmail());
				out.print("<br>mobileNo : "+studentBean.getMobileNo()+"</body></html>");
			}
			else{
				out.print("<html></body> no student available by this id</body></html> ");
			}
		}
		else if(deleteStudentId != null){
			hibDao.deleteById(Integer.parseInt(idDelete));
			response.sendRedirect("delet.jsp");
		}
		else if(deleteAll !=null)
		{
			hibDao.deleteAll();
			out.println("<html><body>ALL DELETED</body></html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
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
			studentBean.setMobileNo(mobileNo);
			
			hibDao.insertStudent(studentBean);
			
			response.sendRedirect("index.jsp");
			//out.print("<html><body>inserted successfully</body><html>");
		}
		catch(Exception e){
			out.println(e);
		}
		
		
		
		
		
	}

}
