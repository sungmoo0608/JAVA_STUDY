package day_2024_08_02;

import java.util.ArrayList;

public class WrapperMain {
	
	public static void main(String[] args){
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		for (Integer num:arrList) {
			System.out.println(num);
		}
		
		int num = 10;
		
		Integer iObj = 10;	// 박싱 = 기본형을 객체로
		Integer iObj2 = new Integer(10);
		Integer iObj3 = Integer.valueOf(30);
		
		int num1 = iObj;	//객체를 기본형으로 = 언박싱
		System.out.println(num1);
		
		System.out.println(iObj);
		System.out.println(iObj2);
		System.out.println(iObj3);
	}

}
