package Polymophism;

public class Conversion {
    void m1(int a){
        System.out.println(a);

    }
    void m1(float a){
        System.out.println(a);

    }

    public static void main(String[] args) {
        Conversion cs = new Conversion();
        cs.m1(15);  // 15
        cs.m1('b'); // 98
        cs.m1(10.5f); // 10.5
        cs.m1(10); // 10
        //cs.m1(10.5);
    }
}
