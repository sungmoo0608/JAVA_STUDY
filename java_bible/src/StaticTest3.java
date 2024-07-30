
class StaticCount{
	
	int c;
	static int count; // 클래스변수 선언
	public StaticCount() {
		c++;
		count++;
	}
}

class StaticTest3{
	
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("sc1의 c : " + sc1.c + ", sc1의 count : " + sc1.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println("sc2의 c : " + sc2.c + ", sc2의 count : " + sc2.count);
		
		StaticCount sc3 = new StaticCount();
		System.out.println("sc3의 c : " + sc3.c + ", sc3의 count : " + sc3.count);
		
		
		
	}

}
