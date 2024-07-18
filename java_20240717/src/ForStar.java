
public class ForStar {

	public static void main(String[] args) {
		// 세로 1열 별찍기
		System.out.println("세로 1열 별찍기");
		for(int i=1;i<=5;i++) {
			System.out.println("*");
		}

		System.out.println();

		System.out.println("가로 1열 별찍기");
		// 가로 1열 별찍기
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}

		System.out.println();
		System.out.println();

		System.out.println("가로 세로 5열 별찍기");
		// 가로 세로 5열 별찍기
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("1,2,3,4,5 증가 별찍기");
		// 1,2,3,4,5 증가 별찍기
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=1;j<=i;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("5,4,3,2,1 감소 별찍기 방법1");
		// 5,4,3,2,1 감소 별찍기 방법1
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=5;j>=i;j--) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("5,4,3,2,1 감소 별찍기 방법2");
		// 5,4,3,2,1 감소 별찍기 방법2
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=i;j<=5;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("5,4,3,2,1 감소 오른쪽 정렬 별찍기 방법1");
		// 5,4,3,2,1 감소 오른쪽 정렬 별찍기 방법1
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("5,4,3,2,1 감소 오른쪽 정렬 별찍기 방법2");
		// 5,4,3,2,1 감소 오른쪽 정렬 별찍기 방법2
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=1;j<i;j++) { // 가로 방수 결정
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("1,2,3,4,5 증가 오른쪽 정렬 별찍기");
		// 1,2,3,4,5 증가 오른쪽 정렬 별찍기
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			
			for(int j=i;j<5;j++) { // 가로 방수 결정
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println();
		
	}

}
