package ExceptionHandling;

public class Example {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {
        doStuffMore();

    }

    public static void doStuffMore() {
        System.out.println(10/0);
    }
}
