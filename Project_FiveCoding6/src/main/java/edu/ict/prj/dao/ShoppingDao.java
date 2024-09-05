package edu.ict.prj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.ict.prj.vo.ShoppingMemberVO;

public class ShoppingDao {

	private DataSource dataSource = null;

	public ShoppingDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Tomsboy");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ShoppingMemberVO> list(){

		ArrayList<ShoppingMemberVO> shoppingList = new ArrayList<ShoppingMemberVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String sql = "SELECT * FROM SHOPPING_MEMBER ORDER BY custno";   

		try{

			connection = dataSource.getConnection();
			preparedStatement =  connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {

				int custno = resultSet.getInt("custno");
				String custname =  resultSet.getString("custname");
				String phone =  resultSet.getString("phone");
				String address =  resultSet.getString("address");
				String joindate =  resultSet.getString("joindate");
				String grade = resultSet.getString("grade");
				String city  = resultSet.getString("city");

				ShoppingMemberVO shoppingMember = new ShoppingMemberVO(custno,custname,phone,address,joindate,grade,city);

				shoppingList.add(shoppingMember);
			}


		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if (resultSet != null)   resultSet.close();
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null)   connection.close();
			} catch (Exception e2) {

			}         
		}

		return shoppingList;

	}
	
	
	public ShoppingMemberVO getShoppingMember(String id) {
		
		//upHit(id);

		ShoppingMemberVO shoppingMember = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String sql = "select * from SHOPPING_MEMBER where custno = ?";   

		try{

			connection = dataSource.getConnection();
			preparedStatement =  connection.prepareStatement(sql);

			preparedStatement.setInt(1, Integer.valueOf(id));
			resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {

				int custno = resultSet.getInt("custno");
				String custname =  resultSet.getString("custname");
				String phone =  resultSet.getString("phone");
				String address =  resultSet.getString("address");
				String joindate =  resultSet.getString("joindate");
				String grade = resultSet.getString("grade");
				String city  = resultSet.getString("city");

				shoppingMember = new ShoppingMemberVO(custno,custname,phone,address,joindate,grade,city);

			}


		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if (resultSet != null)   resultSet.close();
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null)   connection.close();
			} catch (Exception e2) {

			}         
		}


		return shoppingMember;
	}



	public int delete(String id) { 

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "DELETE FROM SHOPPING_MEMBER WHERE custno = ?";   

		int rn = 0 ;

		try{

			connection = dataSource.getConnection();
			preparedStatement =  connection.prepareStatement(sql);

			preparedStatement.setInt(1, Integer.valueOf(id));
			//delete update insert
			rn  = preparedStatement.executeUpdate();         


		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null)   connection.close();
			} catch (Exception e2) {

			}         
		}

		return rn;
	}

	public int modify(String custno, String custname, String phone, String address, String joindate, String grade, String city) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "update SHOPPING_MEMBER set custname = ? , phone = ? , address = ?, joindate = ?, grade =?, city=? where custno = ?";   

		int rn = 0;

		try{

			connection = dataSource.getConnection();
			preparedStatement =  connection.prepareStatement(sql);

			preparedStatement.setString(1, custname);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, joindate);
			preparedStatement.setString(5, grade);
			preparedStatement.setString(6, city);
			preparedStatement.setInt(7, Integer.parseInt(custno));
			rn = preparedStatement.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null)   connection.close();
			} catch (Exception e2) {

			}         
		}

		return rn;
	}
	
	public int add(String custno, String custname, String phone, String address, String joindate, String grade, String city) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "insert into SHOPPING_MEMBER (custno, custname, phone, address, joindate, grade, city) values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";   

		int rn = 0;

		try{

			connection = dataSource.getConnection();
			preparedStatement =  connection.prepareStatement(sql);

			preparedStatement.setString(1, custname);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, joindate);
			preparedStatement.setString(5, grade);
			preparedStatement.setString(6, city);
			rn = preparedStatement.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null)   connection.close();
			} catch (Exception e2) {

			}         
		}

		return rn;
	}

	
	
	
}
