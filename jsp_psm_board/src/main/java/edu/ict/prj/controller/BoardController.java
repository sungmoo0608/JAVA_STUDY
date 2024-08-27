package edu.ict.prj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.command.BoardCommand;
import edu.ict.prj.command.BoardContentCommand;
import edu.ict.prj.command.BoardDeleteCommand;
import edu.ict.prj.command.BoardListCommand;
import edu.ict.prj.command.BoardModifyCommand;
import edu.ict.prj.command.BoardReplyCommand;
import edu.ict.prj.command.BoardReplyViewCommand;
import edu.ict.prj.command.BoardWriteCommand;

//http://localhost:8282/jsp_psm_board/adfadf/list.do
//http://localhost:8282/jsp_psm_board/write.do



@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public BoardController() {
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
		BoardCommand command = null;

		// http://localhost:8282/jsp_psm_board   /list.do
		// /jsp_hjs_board/list.do:/jsp_psm_board:/list.do
		String uri = request.getRequestURI(); // /jsp_psm_board/list.do
		String contextPath = request.getContextPath();// /jsp_psm_board
		String com = uri.substring(contextPath.length());

		System.out.println(uri + ":" + contextPath + ":" + com);

		if(com.equals("/home")) {
			command = new BoardListCommand();
			command.execute(request, response);
			viewPage = "index.jsp";
			
		}else if(com.equals("/add")) { 
			command = new BoardContentCommand();
			command.execute(request, response);
			viewPage = "add.jsp";
			
		}else if(com.equals("/list")) { 
			command = new BoardDeleteCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			
		}else if(com.equals("/result")) {
			viewPage = "result.jsp";
			
		}else if(com.equals("/insert")) { 
			command = new BoardWriteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			
		}else if(com.equals("/modify")) {  
			command = new BoardReplyViewCommand();
			command.execute(request, response);
			viewPage = "reply_view.jsp";
			
		}else if(com.equals("/update")) {   
			command = new BoardReplyCommand();
			command.execute(request, response);
			viewPage = "list.do";
			
		}else if(com.equals("/delete")) {   
			command = new BoardModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}


		//서블릿에서 forwarding 하기 위해 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);


	}

}
