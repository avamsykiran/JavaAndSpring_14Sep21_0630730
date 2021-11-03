package com.cts.dwa1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dwa1.service.GreetService;

@WebServlet("/greet")
public class GreetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private GreetService service = new GreetService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("unm");
		
		String message = service.greetUser(userName);
		
		request.setAttribute("msg", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("greet-page.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
