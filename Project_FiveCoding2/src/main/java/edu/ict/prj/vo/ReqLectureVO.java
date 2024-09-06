package edu.ict.prj.vo;

import java.sql.Timestamp;

public class ReqLectureVO {
	
	/*
    lecture_code  NUMBER(5,0) not null,
    seq_no  NUMBER(10,0) not null,
    memb_code  NUMBER(5,0) not null,
    lect_req_dt date,
    lect_cncl_dt  date,
    lect_exit_dt date,
    lect_fee NUMBER(12,0) not null,
    lect_repay_fee NUMBER(12,0) not null
	 */
	private int seq_no;
	private int lecture_code;
	private int seqno;
	private String lecture_name;
	private int lect_grade;
	private String ins_name;
	private int memb_code;
	private String memb_name;
	private int grade;

	public ReqLectureVO() {}

	public ReqLectureVO(int seq_no,int lecture_code, int seqno,String lecture_name,int lect_grade,String ins_name,int memb_code,String memb_name,int grade) {
		this.seq_no 		= seq_no;
		this.lecture_code 	= lecture_code;
		this.seqno 		= seqno;
		this.lecture_name 		= lecture_name;
		this.lect_grade 		= lect_grade;
		this.ins_name 		= ins_name;
		this.memb_code 		= memb_code;
		this.memb_name 		= memb_name;
		this.grade 		= grade;
	}

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}

	public int getLecture_code() {
		return lecture_code;
	}

	public void setLecture_code(int lecture_code) {
		this.lecture_code = lecture_code;
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public String getLecture_name() {
		return lecture_name;
	}

	public void setLecture_name(String lecture_name) {
		this.lecture_name = lecture_name;
	}

	public int getLect_grade() {
		return lect_grade;
	}

	public void setLect_grade(int lect_grade) {
		this.lect_grade = lect_grade;
	}

	public String getIns_name() {
		return ins_name;
	}

	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}

	public int getMemb_code() {
		return memb_code;
	}

	public void setMemb_code(int memb_code) {
		this.memb_code = memb_code;
	}

	public String getMemb_name() {
		return memb_name;
	}

	public void setMemb_name(String memb_name) {
		this.memb_name = memb_name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
