
public class ForTimeTable2 {

	public static void main(String[] args) {
		// 짝수단 출력 하기

		for(int i=2;i<=9;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i+"단 입니다.");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}


	}

}
