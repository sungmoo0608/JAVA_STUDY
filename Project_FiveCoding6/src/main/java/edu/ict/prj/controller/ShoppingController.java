package edu.ict.prj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.command.ShoppingAddCommand;
import edu.ict.prj.command.ShoppingCommand;
import edu.ict.prj.command.ShoppingDeleteCommand;
import edu.ict.prj.command.ShoppingListCommand;
import edu.ict.prj.command.ShoppingModifyCommand;
import edu.ict.prj.dao.ShoppingDao;

@WebServlet("/shopping/*.do")
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShoppingController() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet..");
		actionDo(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost..");
		actionDo(request, response);

	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("actionDo..");

		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		ShoppingCommand command = null;

		String uri = request.getRequestURI(); 
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());

		System.out.println(uri + ":" + contextPath + ":" + com);

		if(com.equals("/list.do")) {
			command = new  ShoppingListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";

		}else if(com.equals("/delete.do")) {
			command = new ShoppingDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";

		}else if(com.equals("/modify.do")) {
			command = new ShoppingModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";   
			
		}else if(com.equals("/add.do")) {
			command = new ShoppingAddCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}



		//서블릿에서 forwarding 하기 위해 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);


	}

}
