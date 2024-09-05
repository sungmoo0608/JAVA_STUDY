package edu.ict.prj.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ShoppingDao;
import edu.ict.prj.vo.ShoppingMemberVO;

public class ShoppingListCommand implements ShoppingCommand {

	@Override
	public void execute(HttpServletRequest request,HttpServletResponse response) {

		ShoppingDao dao = new ShoppingDao();
		ArrayList<ShoppingMemberVO> shoppingList = dao.list();
		request.setAttribute("shoppingList", shoppingList);  

	}

}
