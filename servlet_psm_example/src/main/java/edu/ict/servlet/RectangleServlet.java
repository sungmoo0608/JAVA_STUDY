package edu.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ict.shape.Rectangle;
/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/rectangle")
public class RectangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RectangleServlet() {
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
		
		double width = Integer.valueOf(request.getParameter("width"));
		double height = Integer.valueOf(request.getParameter("height"));
		
		Rectangle rect = new Rectangle(width,height);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>사각형의 넓이 출력</h1>");
		out.print("<h2>가로:"+width+"</h2>");
		out.print("<h2>세로:"+height+"</h2>");
		out.print("<h2>사각형의 넓이는 "+ rect.getArea() +"</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

}
