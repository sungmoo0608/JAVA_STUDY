package day_2024_07_30;

/*
 * 다형성, 함수오버라이딩 응용
 */

class Employee {
	private int age;
	protected int salary;
	private String name,address,department;

	public Employee(String name, int age, String address, String department) {
		this.age = age;
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public void printInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.address);
		System.out.println("부서: "+this.department);
	}

}

class Regular extends Employee {

	public Regular(String name, int age, String address, String department, int salary) {
		super(name,age,address,department);
		setSalary(salary);
	}
	
	public void setSalary(int salary) {
		super.salary = salary;
	}

	public void printInfo() {
		System.out.println("정규직");
		super.printInfo();
		System.out.println("월급 :" + super.salary );
	}
}


public class PolymorphizmTr1 {

	public static void main(String[] args) {

		Employee employee = new Employee("홍길동", 27, "서울시", "디자인");
		employee.printInfo();

		employee= new Regular("김철수", 26, "서울시", "마케팅", 2_500_000);
		employee.printInfo();

	}

}
