package Polymophism;


/*
In the provided classes Bbb and ABCD, the method m1 is overloaded, not overridden.
Overloading occurs when two or more methods in the same class (or subclass) have the same name but different parameters (different type, number, or both).
Overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass with the same name, return type, and parameters.
In this case:
Bbb has a method m1 with a single parameter of type int.
ABCD has a method m1 with two parameters: an int and a String.
Since the method signatures are different, this is an example of method overloading.
* */
class Bbb{
    public void m1(int a){
        System.out.println("a");
    }

}
public class ABCD extends Bbb {

    public void m1(int a,String s){
        System.out.println();

    }

}
