package day_2024_08_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(7/2);
			// System.out.println(7/0);
			System.out.println("숫자를 넣으세요.");
			int a = sc.nextInt();
			
		} catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
			System.out.println("에러입니다.");
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("에러입니다.");
		} finally {
			System.out.println("바이바이");
		}
		System.out.println("종료합니다.");
	}

}
