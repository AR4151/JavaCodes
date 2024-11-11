package Java8.LamdaFunction;

public class Lambda {
    static Runnable r = () -> System.out.println("Hello");

    public static void main(String[] args) {
        r.run();
    }
}
