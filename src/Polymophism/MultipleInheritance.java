package Polymophism;


interface A{
    int a = 10;
    void show();
}
interface B{
    int a = 10;
    void show();
}
public class MultipleInheritance implements A,B {

    @Override
    public void show() {

    }
    //static int a=55;
    public static void main(String[] args) {
        //System.out.println(a);
        //System.out.println(a);
        MultipleInheritance m = new MultipleInheritance();
        //System.out.println(m.a);
    }
}
