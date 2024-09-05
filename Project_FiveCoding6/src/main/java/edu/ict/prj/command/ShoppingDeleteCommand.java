package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ShoppingDao;

public class ShoppingDeleteCommand implements ShoppingCommand{

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      
      String custno = request.getParameter("custno");
      ShoppingDao dao = new ShoppingDao();
      int rn = dao.delete(custno);
      System.out.println("삭제된 갯수:" +rn);
      
   }
   
}
