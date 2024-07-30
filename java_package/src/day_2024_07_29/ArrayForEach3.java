package day_2024_07_29;

class Box {
	private int num;
	private String contents;
	
	public Box(int num,String contents){
		this.num = num;
		this.contents = contents;
	}
	
	public int getBoxNum(){
		return num;
	}
	
	@Override
	public String toString() {
		return contents;
	}
	
	
}


public class ArrayForEach3 {

	public static void main(String[] args) {
		
		Box[] ar = new Box[5];
		
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		for(Box e : ar) {
			if(e.getBoxNum()==505){
				System.out.println(e);
			}
		}
	}

}
