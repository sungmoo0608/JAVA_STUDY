public class SwitchEx2_20240723 {

	public static void main(String[] args) {
		String str = "수";
		String result;
		
		switch (str) {
		case "수":
			result = "90~100점";
			break;
		case "우":
			result = "80~89점";
			break;
		case "미":
			result = "70~79점";
			break;
		case "양":
			result = "60~69점";
			break;
		case "가":
			result = "59점 이하";
			break;	
		default:
			result = "제대로 입력하시죠?";
			break;
		}
		System.out.println(result);
	}

}
