package Java8.Practice;


interface Obj{
    default int hashCod(){
        return 10;
    }
}
interface A extends Obj{
    default int hashCod() {
        return 20;
    }
}

public class OverrideObjectMethods implements Obj,A,B{



    public static void main(String[] args) {
        Obj obj = new OverrideObjectMethods();
        int a = obj.hashCod();
        System.out.println(a);

    }

}

/*

The problem with the given code is that the hashCode method cannot be overridden as a default method in an interface.
In Java, the hashCode method is one of the methods defined in the java.lang.Object class, and methods from Object cannot
be overridden as default methods in interfaces.

Why This is a Problem
Methods from Object Are Special: All classes in Java implicitly extend Object, and methods like hashCode, toString,
and equals are inherited from Object. Since these methods are implicitly part of all Java objects, interfaces are not
allowed to provide default implementations for them.

Java Language Restriction: The Java Language Specification (JLS) explicitly prohibits interfaces from providing
default methods for methods in Object. This restriction ensures there is no ambiguity about which hashCode, equals,
or toString method to use when working with objects that implement the interface.
 */
interface B {
    /*default int hashCode(){
        return 15;
    }
    */
    @Override
    int hashCode();

}
