class Car {
	private String carName;

	Car(String carName) {
		this.carName = carName;
	}

	Car() {
		this("");
	}

	public void putAccel() {
		System.out.println("밟아요");
	}
}

class Wheel extends Car {

	Wheel(String carName) {
		super(carName);
	}

	@Override
	public void putAccel() {
		super.putAccel();
		System.out.println("구른다");
	}

	
}

public class CarExtends {
	public static void main(String[] args) {
		Wheel wheel = new Wheel("카니발");
		wheel.putAccel();
	}
}
