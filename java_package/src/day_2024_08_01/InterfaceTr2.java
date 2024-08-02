package day_2024_08_01;

interface IFruit1{
	void print();
}

class Grape1 implements IFruit1 {
	@Override
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple1 implements IFruit1 {
	@Override
	public void print() {
		System.out.println("나는 사과다.");
	}
}

class Pear1 implements IFruit1 {
	@Override
	public void print() {
		System.out.println("나는 포도다.");
	}
}

public class InterfaceTr2 {

	public static void main(String[] args) {
		IFruit1 fAry[] = {new Grape1(), new Apple1(), new Pear1()};
		for(IFruit1 f : fAry) { f.print(); };
	}
}