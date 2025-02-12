package Polymophism;

/*
Yes, in the provided code, multiple inheritance is resolved for the methods but not for the variables.
In Java, when a class implements multiple interfaces that have methods with the same signature, the class must provide
an implementation for those methods, resolving the conflict.  However, for variables, Java does not resolve the conflict
 automatically. If multiple interfaces have variables with the same name, the implementing class must explicitly specify
  which interface's variable it is referring to.
 */
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

