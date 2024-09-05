package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ict.prj.dao.ShoppingDao;

public class ShoppingModifyCommand implements ShoppingCommand {

	@Override
	public void execute(HttpServletRequest request,HttpServletResponse response) {
		
		String custno = request.getParameter("custno");
		String custname =  request.getParameter("custname");
		String phone =  request.getParameter("phone");
		String address =  request.getParameter("address");
		String joindate =  request.getParameter("joindate");
		String grade = request.getParameter("grade");
		String city  = request.getParameter("city");
		
		ShoppingDao dao = new ShoppingDao();

		int rn = dao.modify(custno,custname,phone,address,joindate,grade,city);
		System.out.println("update된 갯수 : "+rn);

	}

}
