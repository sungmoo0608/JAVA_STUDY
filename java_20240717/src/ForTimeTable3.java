
public class ForTimeTable3 {

	public static void main(String[] args) {
		// 결과물이 홀수만 나오는 구구단 구하기


		for(int i=1;i<=9;i++) {

			for(int j=1;j<=9;j++) {

				int result = i*j;

				if (result%2==1) {
					System.out.println(i+"x"+j+"="+result);
				}
			}

			System.out.println();
		}


	}

}
