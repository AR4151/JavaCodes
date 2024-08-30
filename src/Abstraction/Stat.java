package Abstraction;

public class Stat {
    int a=10;
    static int b = 20;

    public static void main(String[] args) {
        Stat AA = new Stat();
        AA.a=100;
        System.out.println(b); //100
        System.out.println(AA.a); //100
        AA.b=40;
        System.out.println(b); //40

    }
}
