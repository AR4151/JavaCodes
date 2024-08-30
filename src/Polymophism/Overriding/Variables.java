package Polymophism.Overriding;

/* Remember, Overriding can be performed on the Methods only not on Variables.
* And the Variable Resolution takes care by the Compiler based on the Reference type */


class A{
    static int x = 50;
}
class B extends A{
    int x = 100;
}
public class Variables {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A aa = new B();

        System.out.println(a.x);  // ==> 50
        System.out.println(b.x);  // ==> 100
        System.out.println(aa.x); // ==> 50

        a.x=200;
        b.x=300;

        System.out.println();
        System.out.println(a.x);  // ==> 200
        System.out.println(b.x);  // ==> 300
        System.out.println(aa.x); // ==> 200
}
}
