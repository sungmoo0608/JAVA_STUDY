package edu.ict.prj.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ReqLectureDao;
import edu.ict.prj.vo.ReqLectureVO;

public class ReqLectureJohoiAllCommand  implements GolfProcessCommand{
	   @Override
	   public void execute(HttpServletRequest request, HttpServletResponse response) {

			// 주의 : request.getParameter("v_confirm")에서 v_confirm 에 null값이 들어오면 에러남
		   int v_lecture_code = Integer.parseInt(request.getParameter("v_lecture_code"));
		   ReqLectureDao dao = new ReqLectureDao();
		   ArrayList<ReqLectureVO> ReqLectureList = dao.list(v_lecture_code);
		   request.setAttribute("ReqLectureList", ReqLectureList);   
	      
	   }
}