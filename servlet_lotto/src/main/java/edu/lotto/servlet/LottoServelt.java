package edu.lotto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import edu.lotto.java.LottoNum;

/**
 * Servlet implementation class LottoServelt
 */
@WebServlet("/lotto")
public class LottoServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LottoServelt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Set<Integer> userLotto = new HashSet<>();
		Set<Integer> computerLotto = new HashSet<>();
		Set<Integer> sameLotto = new HashSet<>();
		Set<Integer> differLotto = new HashSet<>();
			
		int num1 = Integer.valueOf(request.getParameter("num1"));
		int num2 = Integer.valueOf(request.getParameter("num2"));
		int num3 = Integer.valueOf(request.getParameter("num3"));
		int num4 = Integer.valueOf(request.getParameter("num4"));
		int num5 = Integer.valueOf(request.getParameter("num5"));
		int num6 = Integer.valueOf(request.getParameter("num6"));
		
		userLotto.add(num1);
		userLotto.add(num2);
		userLotto.add(num3);
		userLotto.add(num4);
		userLotto.add(num5);
		userLotto.add(num6);
		
		while(computerLotto.size() < 6 ) {
			int num = (int)((Math.random()*45)+1);
			computerLotto.add(num);
		}
	
		for(Integer userNum:userLotto) {
			for(Integer comNum:computerLotto) {
				if(userNum == comNum) {
					sameLotto.add(userNum);
				} else {
					differLotto.add(userNum);
				}
			}
		}
		
		for (int num:sameLotto) {
			differLotto.remove(num);
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>로또 번호 출력</h1>");
		out.print("<h2>내번호"+userLotto.toString()+"</h2>");
		out.print("<h2>공식번호"+computerLotto.toString()+"</h2>");
		out.print("<h2>맞춘번호"+sameLotto.toString()+"</h2>");
		out.print("<h2>틀린번호"+differLotto.toString()+"</h2>");
		out.print("<br>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
