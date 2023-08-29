package com.cestar.hidden_form_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success_Hidden_Form_Field
 */
@WebServlet("/Success_Hidden_Form_Field")
public class Success_Hidden_Form_Field extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success_Hidden_Form_Field() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<body style='background-color:lavender'>");
		out.print("<div style='background-color:purple;color:orange;padding:30px;border-radius:30px'>");
		String name=request.getParameter("emp_name");
		String password=request.getParameter("emp_password");
		
		out.print("<h3>Name: "+name+"</h3>");
		out.print("<h3>Password: "+password+"</h3>");
		out.print("</div>");
		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
