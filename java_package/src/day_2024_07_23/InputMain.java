package day_2024_07_23;

import java.util.Scanner;

public class InputMain {

	public static void main(String[] args) {
		//키보드
		Scanner sc = new Scanner(System.in);	//입력 기능을 가진 클래스
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("double : ");
		double d = sc.nextDouble();
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
	}
}
