package DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Shopping_Dao {
	
	private DataSource dataSource = null;

	public Shopping_Dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
