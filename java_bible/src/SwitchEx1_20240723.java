public class SwitchEx1_20240723 {

	public static void main(String[] args) {
		int su1 = 15;
		String res;
		
		if(su1 >= 41) {
			res = "고급";
		} else if(su1 >=11) {
			res = "중급";
		} else if(su1 >=1) {
			res = "초급";
		} else {
			res = "음수";
		}
		
		System.out.println(res+"입니다.");
	}

}
