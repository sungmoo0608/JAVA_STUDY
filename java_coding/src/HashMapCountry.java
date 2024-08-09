import java.util.HashMap;
import java.util.Scanner;

public class HashMapCountry {

	public static void main(String[] args) {
		HashMap<String,Integer> country = new HashMap<>();

		// Key-Value 기반 데이터 저장
		country.put("Korea",5000);
		country.put("USA",1000000);
		country.put("Swiss",2000);
		country.put("France",3000);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
//		
//		
//		String str = sc.nextLine();

		// 데이터 탐색
		System.out.println("1 containsKey Korea : " + country.containsKey("Korea"));
		System.out.println("2 containsKey USA : " + country.containsKey("USA"));
	}

}
