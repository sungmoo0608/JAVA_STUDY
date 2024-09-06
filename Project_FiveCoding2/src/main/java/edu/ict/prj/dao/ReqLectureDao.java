package edu.ict.prj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.ict.prj.vo.ReqLectureVO;

public class ReqLectureDao {

	private DataSource dataSource = null;

	public ReqLectureDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Tomsboy");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public ArrayList<ReqLectureVO> list(int v_lecture_code) {
		ArrayList<ReqLectureVO> ReqLectureList = new ArrayList<ReqLectureVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String sql = "";
		int sel_cnt = 0;
		System.out.println("v_lecture_code [" + v_lecture_code + "]");
		
		sql = "select rownum as seqno,a.lecture_code,a.seq_no,b.lecture_name,  (select ins_name from infoinstructor where ins_code = b.ins_code) ins_name, "
				+ " b.lect_grade,b.lect_place,b.lect_fee,c.memb_code,c.memb_name,c.grade " + 
	      " from reqlecture a,infolecture b,infomember c where a.lecture_code = ? and a.lecture_code = b.lecture_code and a.memb_code = c.memb_code ";
		System.out.println("KKKKKKKK sql1 [" + sql + "]");
		

		
		try {

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
			resultSet = preparedStatement.executeQuery();
			
			System.out.println("AAA" + resultSet.getFetchSize());
			
			
			while (resultSet.next()) {
				
				System.out.println("AAA========================================");
				
				int seq_no 				= resultSet.getInt("seq_no");
				int lecture_code 		= resultSet.getInt("lecture_code");
				int seqno 				= resultSet.getInt("seqno");
				String lecture_name 	= resultSet.getString("lecture_name");
				int lect_grade 			= resultSet.getInt("lect_grade");
				String ins_name 		= resultSet.getString("ins_name");
				int memb_code 			= resultSet.getInt("memb_code");
				String memb_name 		= resultSet.getString("memb_name");
				int grade 				= resultSet.getInt("grade");

				ReqLectureVO ReqLecture = new ReqLectureVO(seq_no,lecture_code, seqno,lecture_name,lect_grade,ins_name,memb_code,memb_name,grade);

				ReqLectureList.add(ReqLecture);
				sel_cnt += 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			  try {
		            if (resultSet != null)   resultSet.close();
		            if (preparedStatement != null) preparedStatement.close();
		            if (connection != null)   connection.close();
		         } catch (Exception e2) {


			}
		}
		System.out.println("조회건수 [" + sel_cnt + "]");
		return ReqLectureList;

	}
	
	public ReqLectureVO getReqLecture(int ilecture_code,int iseq_no) {

		ReqLectureVO ReqLecture = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String sql = "select * from ReqLecture where lecture_code = ? and seq_no = ?";

		try {

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, Integer.valueOf(ilecture_code));
			preparedStatement.setInt(2, Integer.valueOf(iseq_no));
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				
				int lecture_code 		= resultSet.getInt("lecture_code");
				int seqno 				= resultSet.getInt("seqno");
				int memb_code 			= resultSet.getInt("memb_code");
				Timestamp lect_req_dt 	= resultSet.getTimestamp("lect_req_dt");
				Timestamp lect_cncl_dt 	= resultSet.getTimestamp("lect_cncl_dt");
				Timestamp lect_exit_dt 	= resultSet.getTimestamp("lect_exit_dt");
				int lect_fee 			= resultSet.getInt("lect_fee");
				int lect_repay_fee 		= resultSet.getInt("lect_repay_fee");

				//ReqLecture = new ReqLectureVO( lecture_code,seqno,  memb_code, lect_req_dt, lect_cncl_dt, lect_exit_dt, lect_fee,lect_repay_fee);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			  try {
		            if (resultSet != null)   resultSet.close();
		            if (preparedStatement != null) preparedStatement.close();
		            if (connection != null)   connection.close();
		         } catch (Exception e2) {


			}
		}

		return ReqLecture;

	}
	
	public int ReqLectureInsert(int lecture_code,int  memb_code) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "insert into ReqLecture (lecture_code,seq_no,memb_code,lect_req_dt,lect_cncl_dt,lect_exit_dt,lect_fee,lect_repay_fee)"
				+ " values (?,(select (nvl(max(seq_no),0)+1) from ReqLecture where lecture_code = ? ),?, sysdate , null, null,  "
				+ " (select lect_fee from infolecture where lecture_code = ?) , 0 )";
		System.out.println("INSERT sql = [" + sql + "]");		
		int rn = 0;
		
		try {
		    System.out.println("Insert  111111 ");
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, 		lecture_code);
			preparedStatement.setInt(2, 		lecture_code);	// max(seq_no)를 가져오기 위해 추가
			preparedStatement.setInt(3, 		memb_code);	
			preparedStatement.setInt(4, 		lecture_code);
		    System.out.println("Insert  2222222 ");
	        
	        //write update insert
	        rn  = preparedStatement.executeUpdate();    
	        System.out.println("입력건수 " + rn);
			if (rn != 1) {

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("확인");
		} finally {

			  try {
		            if (preparedStatement != null) preparedStatement.close();
		            if (connection != null)   connection.close();
		         } catch (Exception e2) {


			}
		}

		return rn;
	}
	
	public int ReqLectureModify(int lecture_code,int seq_no, int  memb_code,Timestamp lect_req_dt,Timestamp lect_cncl_dt,Timestamp lect_exit_dt,int lect_fee,int lect_repay_fee) {

		ReqLectureVO ReqLecture = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "update ReqLecture set memb_code = ?,lect_req_dt=?,lect_cncl_dt=?,lect_exit_dt=?,lect_fee=?,lect_repay_fee=? where lecture_code = ? and seq_no = ?";

		int rn = 0;
		
		try {

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, 		memb_code);
			preparedStatement.setTimestamp(2, 	lect_req_dt);
			preparedStatement.setTimestamp(3, 	lect_cncl_dt);
			preparedStatement.setTimestamp(4, 	lect_exit_dt);
			preparedStatement.setInt(5, 		lect_fee);
			preparedStatement.setInt(6, 		lect_repay_fee);
			preparedStatement.setInt(7, 		lecture_code);
			preparedStatement.setInt(8, 		seq_no);
			
			// delete update insert는 executeUpdate 로 처리
			rn = preparedStatement.executeUpdate();

			if (rn != 1) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			  try {
		            if (preparedStatement != null) preparedStatement.close();
		            if (connection != null)   connection.close();
		         } catch (Exception e2) {


			}
		}

		return rn;
	}
	
	
	
}
