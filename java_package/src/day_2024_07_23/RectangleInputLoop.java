package day_2024_07_23;

import java.util.Scanner;

class Rectangle10{

	private int width,height ; 

	public Rectangle10(int width,int height) {
		this.width=width;
		this.height=height;
	}

	public int getArea() {
		return width*height;
	}
}

public class RectangleInputLoop {

	public static void main(String[] args) {

		while(true) {
			int width,height ; 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로를 입력하시오 :");
			width = sc.nextInt(); 
			
			System.out.print("세로를 입력하시오 :");
			height = sc.nextInt(); 
			
			Rectangle10 rec = new Rectangle10(width,height);
			System.out.println("사각형의 넓이는 " + rec.getArea());
			
			System.out.println("계속하시겠습니까? y,n");
			
			String yesOrNo = sc.next();
			
			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
					
		}
		
		System.out.println("사각형 넓이 구하기 프로그램을 종료합니다.");


	} 
}
