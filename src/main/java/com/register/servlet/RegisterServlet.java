package com.register.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    	{
    		//PrintWriter out =response.getWriter();
            RequestDispatcher dispatcher = null;
            Connection con = null;
            //PreparedStatement ps = null;
            
            try {
            	PrintWriter out =response.getWriter();
            	Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event", "root", "Khan@123");
                String firstN = request.getParameter("firstName");
                String lastN = request.getParameter("lastName");
                String username = request.getParameter("email1");
                String password = request.getParameter("pass1");
                String pasw2 = request.getParameter("pass2");
                String mNum = request.getParameter("mobile");
                PreparedStatement ps = con.prepareStatement("INSERT INTO signup VALUES (?, ?, ?, ?, ?, ?)");
                ps.setString(1, firstN);
                ps.setString(2, lastN);
                ps.setString(3, username);
                ps.setString(4, password);
                ps.setString(5, pasw2);
                ps.setString(6, mNum);
                int count = ps.executeUpdate();
                dispatcher = request.getRequestDispatcher("login.jsp");
                if (count > 0) {
                	response.setContentType("text/html");
                	out.print("<h3 style='color:green' >User registered successfully</h3>");
                    //request.setAttribute("Status", "success");
                } else {
                	response.setContentType("text/html");
                	out.print("<h3 style='color:green' >User not registered due to some error</h3>");
                    //request.setAttribute("Status", "success");
                }
                dispatcher.forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                    
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

	}

}
