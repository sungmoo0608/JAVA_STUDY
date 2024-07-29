package day_2024_07_26;

public class ArrayEx {

	public static void main(String[] args) {
		int[] ar = new int[5];
		
		ar[0] =1;
		ar[1] =2;
		ar[2] =3;
		ar[3] =4;
		ar[4] =5;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		System.out.println("==================");
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = i+1;
			System.out.println(ar[i]);
		}
	}

}
