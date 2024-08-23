package edu.ict.prj.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.ict.prj.vo.EmpDeptVO;

public class EmpDeptDao {

	private DataSource dataSource = null; // 커넥션 풀 객체

	public EmpDeptDao() {
		try {

			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<EmpDeptVO> empDeptSelect() {

		List<EmpDeptVO> dtos = new ArrayList<>();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;


		try {
			
			String sql = "select * from emp e, dept d where e.deptno = d.deptno";

			
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {

				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				EmpDeptVO dto = new EmpDeptVO(empno,ename,job,mgr,hiredate,sal,comm,deptno,dname,loc);
				
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();

				if (statement != null)
					statement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}

		}

		return dtos;

	}

}
