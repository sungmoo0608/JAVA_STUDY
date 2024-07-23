package com.wxfs.smart;	//물리적 폴더

//A회사에서 만들어준 클래스
public class Circle {
	double rad;
	final double PI;
	
	public Circle(double r){
		this.rad = r;
		PI = 3.14;
	}
	
	public double getArea() {
		return rad*rad*PI;
	}
}
