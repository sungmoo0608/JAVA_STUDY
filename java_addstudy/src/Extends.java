class Pet {
	private String name;

	Pet(String name) {
		this.name = name;
	}

	Pet() {
		this("");
	}

	public String getName() {
		return this.name;
	}

	public String setName(String name) {
		return this.name;
	}

	public void eating() {
		System.out.println(name + "가 사료를 먹는중");
	}
}

class MyDog extends Pet {
	MyDog(String name) {
		super(name);
	}
}

public class Extends {
	public static void main(String[] args) {
		Pet pet = new Pet("토리");
		MyDog dog = new MyDog("고도리");

		System.out.println(dog.getName());
		pet.eating();
	}
}
