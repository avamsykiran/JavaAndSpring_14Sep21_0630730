package com.cts.dwa1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/friends")
public class FriendsControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ServletContext application = getServletContext();
		
		List<String> friends = (List<String>) request.getAttribute("flist");
		if(friends==null)
			friends=new ArrayList<>();
		
		List<String> friendsInSession = (List<String>) session.getAttribute("flist2");
		if(friendsInSession==null)
			friendsInSession=new ArrayList<>();
		
		List<String> friendsInApp = (List<String>) application.getAttribute("flist3");
		if(friendsInApp==null)
			friendsInApp=new ArrayList<>();
		
		String friendName = request.getParameter("fnm");
		if(friendName!=null) {
			friends.add(friendName);
			friendsInSession.add(friendName);
			friendsInApp.add(friendName);
		}
		
		request.setAttribute("flist", friends);
		session.setAttribute("flist2", friendsInSession);
		application.setAttribute("flist3", friendsInApp);
		request.getRequestDispatcher("friends-page.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
