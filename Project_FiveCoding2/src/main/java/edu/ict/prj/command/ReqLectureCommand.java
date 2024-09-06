package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ReqLectureDao;

public class ReqLectureCommand  implements GolfProcessCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int lecture_code 	= Integer.parseInt(request.getParameter("lecture_code"));
		int memb_code 		= Integer.parseInt(request.getParameter("memb_code"));

		ReqLectureDao dao 	= new ReqLectureDao();

		int rn = dao.ReqLectureInsert(lecture_code, memb_code);

		System.out.println("등록 건수 : " + rn);

	}
}