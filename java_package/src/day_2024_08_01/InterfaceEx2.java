package day_2024_08_01;

interface IFruit {
	public void print();
}

class Grape implements IFruit {
	@Override
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple implements IFruit {
	@Override
	public void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear implements IFruit {
	@Override
	public void print() {
		System.out.println("나는 배이다.");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		IFruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(IFruit f : fAry) { f.print(); };
	}
}