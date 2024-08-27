package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.BoardDao;

public class BoardDeleteCommand implements BoardCommand{

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      
       //http://localhost:8282/jsp_hjs_board/delete.do?bid=3
      
      String bid = request.getParameter("bid");
      BoardDao dao = new BoardDao();
      int rn = dao.delete(bid);
      System.out.println("삭제된 갯수:" +rn);
      
   }
   
}
