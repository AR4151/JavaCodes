package Abstraction;

public class Stat {
    int a=10;
    static int b = 20;

    public static void main(String[] args) {
        Stat AA = new Stat();
        AA.a=100;
        System.out.println(b);
        System.out.println(AA.a);
        AA.b=40;
        System.out.println(b);

    }
}
