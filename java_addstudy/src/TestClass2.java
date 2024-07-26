// class 3개를 사용해서
// int, double, String의 값을 가지는 변수를 만들것
// ex) class A는 int만, class B는 double만
// 그리고 각각의 객체를 만들고 ABC를 혼합해서 출력하세요.
// ex) A Int=10, B Double=1.234, String C = "객체지향"
// 마지막으로,
// A와 B의 정수형과 실수형을 형변환을 이용해서 값을 더해 출력하세요.
// ex) A.A + B.A = 1510 출력값은 정수로 부탁드립니다.


// 각각의 변수의 private 처리를 하고 값을 저장하는 메서드를 작성하세요.
// 그리고 그 값을 출력해주는 메서드를 작성하세요.
class MyClass1{
    private int myClassInt;

    public void setMyClassInt(int myClassInt){
        this.myClassInt = myClassInt;
    }

    public void printData(){
        System.out.println(myClassInt);
    }
}
class MyClass2{
    private double myClassDble;

    public void setMyClassDouble(double myClassDble){
        this.myClassDble = myClassDble;
    }

    public void printData(){
        System.out.println(myClassDble);
    }
}
class MyClass3{
    private String myClassStr;

    public void setMyClassStr(String myClassStr){
        this.myClassStr = myClassStr;
    }

    public void printData(){
        System.out.println(myClassStr);
    }
}
public class TestClass2 {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        MyClass3 mc3 = new MyClass3();

        mc1.setMyClassInt(10);
        mc2.setMyClassDouble(15.5);
        mc3.setMyClassStr("객체지향");
        
        mc1.printData();
        mc2.printData();
        mc3.printData();

    }
}