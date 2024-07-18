
public class TimesTable2 {

	public static void main(String[] args){

		for(int i=1;i<10;i++) {
			if(i%3==0) {
				System.out.println(i+"단 입니다.");
				for(int j=1;j<10;j++){
					System.out.println(i+"x"+j+"="+i*j);
				}
				System.out.println();
			}
		}
	}
}