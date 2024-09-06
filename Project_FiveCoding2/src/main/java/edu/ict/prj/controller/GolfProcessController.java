package edu.ict.prj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.command.GolfProcessCommand;
import edu.ict.prj.command.InstructorDeungrokCommand;
import edu.ict.prj.command.InstructorJohoiAllAftCommand;
import edu.ict.prj.command.InstructorJohoiAllCommand;
import edu.ict.prj.command.LectureJohoiAllCommand;
import edu.ict.prj.command.MemberDeungrokCommand;
import edu.ict.prj.command.MemberJohoiAllAftCommand;
import edu.ict.prj.command.MemberJohoiAllCommand;
import edu.ict.prj.command.ReqLectureCommand;
import edu.ict.prj.command.ReqLectureJohoiAllCommand;

//~*.golfdo로 끝나는 요청은 아래 콘트롤러가 받음
@WebServlet("*.golfdo")
public class GolfProcessController  extends HttpServlet {
	   private static final long serialVersionUID = 1L;

	    public GolfProcessController() {
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
		      GolfProcessCommand command = null;
		      
		      // http://localhost:8282/jsp_hjs_board   /list.do
		      // /jsp_hjs_board/list.do:/jsp_hjs_board:/list.do
		      String uri = request.getRequestURI(); // /jsp_hjs_board/list.do
		      String contextPath = request.getContextPath();// /jsp_hjs_board
		      String com = uri.substring(contextPath.length());
		      
		      System.out.println("URI:" + uri + " contextPath :" + contextPath + "  com:" + com);
		      
		      // 강사관리 > 강사진 조회
		      if(com.equals("/golf/InstructorJohoiAll.golfdo")) {
		         command = new  InstructorJohoiAllCommand();
		         command.execute(request, response);
		         viewPage = "Instructor_Johoi_All.jsp";	// 강사진 전체 조회
		      // 회원관리 > 회원 조회
			  }else if(com.equals("/golf/MemberJohoiAll.golfdo")) {
			     command = new  MemberJohoiAllCommand();
			     command.execute(request, response);
			     viewPage = "Member_Johoi_All.jsp";	// 
			  // 강의관리 > 강의현황 조회
			  }else if(com.equals("/golf/LectureJohoiAll.golfdo")) {
			     command = new  LectureJohoiAllCommand();
			     command.execute(request, response);
			     viewPage = "Lecture_Johoi_All.jsp";	// 강사 등록/변경후 강사진 전체 조회(교육용)
		      // 회원관리 > 회원 등록/변경
			  }else if(com.equals("/golf/MemberDeungrok.golfdo")) {
			     command = new  MemberDeungrokCommand();
			     command.execute(request, response);
			     viewPage = "/golf/MemberJohoiAllAft.golfdo";	// 회원 등록후 강사진 전체 조회(교육용)
			  // 강사관리 >  강사 등록
			  }else if(com.equals("/golf/InstructorDeungrok.golfdo")) {
			     command = new  InstructorDeungrokCommand();
			     command.execute(request, response);
			     viewPage = "/golf/InstructorJohoiAllAft.golfdo";	// 강사 등록/변경후 강사진 전체 조회(교육용)
			  }else if(com.equals("/golf/MemberJohoiAllAft.golfdo")) {
				     command = new  MemberJohoiAllAftCommand();
				     command.execute(request, response);
				     viewPage = "Member_Johoi_All.jsp";	// 강사 등록/변경후 강사진 전체 조회(교육용)
			  }else if(com.equals("/golf/InstructorJohoiAllAft.golfdo")) {
				     command = new  InstructorJohoiAllAftCommand();
				     command.execute(request, response);
				     viewPage = "Instructor_Johoi_All.jsp";	// 강사 등록/변경후 강사진 전체 조회(교육용)
			  }else if(com.equals("/golf/ReqLectureJohoiAll.golfdo")) {  // 강의신청내역조회
				     command = new  ReqLectureJohoiAllCommand();
				     command.execute(request, response);
				     viewPage = "ReqLecture_Johoi_All.jsp";	// 강사 등록/변경후 강사진 전체 조회(교육용)
			  }else if(com.equals("/golf/ReqLecture.golfdo")) {  // 강의신청내역조회
				     command = new  ReqLectureCommand();
				     command.execute(request, response);
				     viewPage = "ReqLecture_Johoi_All.jsp";	// 강사 등록/변경후 강사진 전체 조회(교육용)
			  }else {//ReqLectureJohoiAll.golfdo
				  
		    	  
		      }        

		   
		   // 서블릿에서 forwarding 하는 과정
		   RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		   dispatcher.forward(request,response);
		   
	   }	    
	    
}
