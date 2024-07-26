class TestClass {

    int a;
    int b;
    int c;

    public static TestClass2 createTestObject(int a, int b, int c){
        TestClass2 testClass = new TestClass2();
//        testClass.a = a;
//        testClass.b = b;
//        testClass.c = c;
        return testClass;
    }

    int setTestNumber(int a, int b, int c){

        this.a =a;
        this.b =b;
        this.c =c;

        return 1;
    }

}

public class Function {
    public static void main(String[] args) {
//        TestClass2 testClass = TestClass2.createTestObject(150,300,450);
//
//        System.out.println(testClass.a);
//        System.out.println(testClass.b);
//        System.out.println(testClass.c);
//
//        testClass.a = 500;
//        testClass.b = 1000;
//        testClass.c = 1500;
//
//        System.out.println(testClass.a);
//        System.out.println(testClass.b);
//        System.out.println(testClass.c);
//
//        System.out.println(testClass.setTestNumber(777, 999, 888));
//
//        System.out.println(testClass.a);
//        System.out.println(testClass.b);
//        System.out.println(testClass.c);
    }
}