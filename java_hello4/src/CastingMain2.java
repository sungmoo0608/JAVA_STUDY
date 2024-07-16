
public class CastingMain2 {

	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A'+'B');	
		//	131으로 출력되는 이유는
		//	연산하기 위해 형 변환때문에 일어나는 현상
		System.out.println('A'+1);
		System.out.println('A'+0.1);
	}

}
