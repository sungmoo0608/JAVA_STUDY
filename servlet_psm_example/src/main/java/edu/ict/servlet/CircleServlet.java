package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ict.shape.Circle;
/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/circle")
public class CircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CircleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
		System.out.println("doGet().. 함수입니다.");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double radius = Integer.valueOf(request.getParameter("radius"));
		
		Circle circle = new Circle(radius);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>원의 넓이 출력</h1>");
		out.print("<h2>반지름 "+radius+"인 원의 넓이는 "+ circle.getArea() +"</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

}
