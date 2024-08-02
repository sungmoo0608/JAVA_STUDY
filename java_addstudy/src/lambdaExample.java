@FunctionalInterface
interface lambda {
    void lambdaExampleMethod();
}


public class lambdaExample {
    public static void main(String[] args) {
        lambda methodEx = () -> System.out.println("hello world");
        methodEx.lambdaExampleMethod();
    }
}
