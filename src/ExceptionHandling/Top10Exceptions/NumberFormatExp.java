package ExceptionHandling.Top10Exceptions;

public class NumberFormatExp {
    public static void main(String[] args) {
        int j = Integer.parseInt("10");
        System.out.println(j);
        int i = Integer.parseInt("ten");
        System.out.println(j);
        System.out.println(i);
    }
}
