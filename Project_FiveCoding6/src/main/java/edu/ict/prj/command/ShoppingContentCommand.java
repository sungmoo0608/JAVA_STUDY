package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ShoppingDao;
import edu.ict.prj.vo.ShoppingMemberVO;


public class ShoppingContentCommand implements ShoppingCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String custno = request.getParameter("custno");
		
		ShoppingDao dao = new ShoppingDao();
		ShoppingMemberVO shoppingMember = dao.getShoppingMember(custno);
		
		// dao.upHit(bid);
		
		request.setAttribute("shoppingMember", shoppingMember);
	}

}
