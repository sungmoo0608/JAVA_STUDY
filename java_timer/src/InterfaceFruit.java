interface IFruit{
	public void print();
}

class Grape implements IFruit{
	@Override
	public void print() {
		System.out.println("나는 포도라니까");
	}
}

class Apple implements IFruit{
	@Override
	public void print() {
		System.out.println("나는 사과라니까");
	}
}

class Pear implements IFruit{
	@Override
	public void print() {
		System.out.println("나는 배라니까");
	}
}

public class InterfaceFruit {

	public static void main(String[] args) {
        IFruit fAry[] = {new Grape(), new Apple(), new Pear()};
        for(IFruit f : fAry)
        f.print();
	}

}
