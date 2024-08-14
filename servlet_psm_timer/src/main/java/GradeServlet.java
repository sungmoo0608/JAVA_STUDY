

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.psm.shape.Grade;


/**
 * Servlet implementation class Grade
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GradeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		int kor = Integer.valueOf(request.getParameter("kor"));
		int eng = Integer.valueOf(request.getParameter("eng"));
		int math = Integer.valueOf(request.getParameter("math"));

		Grade grade = new Grade(kor,eng,math);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>성적 구하기</h1>");
		
		out.print("<h2>국어 : "+kor+"</h2>");
		out.print("<h2>영어 : "+eng+"</h2>");
		out.print("<h2>수학 : "+math+"</h2>");
		out.print("<h2>3과목 총점은 "+(kor+eng+math)+"점 입니다.</h2>");
		out.print("<h2>평균은 "+grade.getAvg()+"점 입니다.</h2>");
		out.print("<h2>성적 등급은 "+grade.getGrade()+" 입니다.</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		

	}

}
