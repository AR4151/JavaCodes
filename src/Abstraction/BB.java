package Abstraction;

abstract class Abs {
    abstract void aa();
    abstract int bb(int a,int b);
}
class AA extends Abs{


    @Override
    void aa() {
        System.out.println("Hello");
        System.out.println("This is Abstract Method 1");
    }

    @Override
    int bb(int a,int b) {
        System.out.println(a+b);
        return 0;
    }
}
public class BB extends Abs{

    @Override
    void aa() {
        System.out.println("Hello 1");
        System.out.println("This is Abstract Method 2");

    }

    @Override
    int bb(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        AA a = new AA();
        a.aa();
        a.bb(5,5);
        System.out.println(a.bb(15,10));
        BB b = new BB();
        b.aa();
        System.out.println(b.bb(10,10));



    }
}