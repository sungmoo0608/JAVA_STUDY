package day_2024_08_07;

import java.util.HashSet;
import java.util.Set;

class Num {
	   private int num;
	   public Num(int n) { num = n; }

	   @Override
	   public String toString() { return String.valueOf(num); }

	   @Override
	   public int hashCode() {
	      return num % 3; // num의 값이 같으면 부류도 같다.
	   }

	   @Override
	   public boolean equals(Object obj) {   // num의 값이 같으면 true 반환 
	      if(num == ((Num)obj).num)
	         return true;
	      else
	         return false;
	   }
	   
	}


public class HashSetEx {

	public static void main(String[] args) {
	      Set<Num> n1 = new HashSet<>();
	      
	      n1.add(new Num(1));
	      n1.add(new Num(2));
	      n1.add(new Num(2));
	      
	      System.out.println(n1.size());
	}

}
