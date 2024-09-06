package edu.ict.prj.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.InfoInstructorDao;
import edu.ict.prj.vo.InfoInstructorVO;

public class InstructorJohoiAllAftCommand  implements GolfProcessCommand{
	   @Override
	   public void execute(HttpServletRequest request, HttpServletResponse response) {
	      
		 String  v_confirm ="4";
		    
		   InfoInstructorDao dao = new InfoInstructorDao();
		   ArrayList<InfoInstructorVO> InfoInstructorList = dao.list(v_confirm);
		   request.setAttribute("InfoInstructorList", InfoInstructorList);   
	      
	   }
}
