package ExceptionHandling.Top10Exceptions;

/* It is child of Error,so it is Unchecked.JVM will automatically raise if any exception occurs while executing
Static Variable assignment and Static block*/
public class ExpInInitializerError {
    static{
        String s = "Roshan";
        s = null;
        System.out.println(s.length());
    }
    //static int a = 10/0;

    public static void main(String[] args) {
        //System.out.println(a);


    }
}
/*Explanation:
Static Block Execution

A static block runs once when the class is loaded into memory.
Any error that occurs in the static block causes an ExceptionInInitializerError.
NullPointerException Occurs

The string s is initialized as "Roshan".
s is then set to null.
Calling s.length() on null results in a NullPointerException.
ExceptionInInitializerError is Thrown

Since the exception occurs in a static block during class initialization, the JVM wraps the NullPointerException inside
 an ExceptionInInitializerError.*/

/*If you are not getting an ExceptionInInitializerError in IntelliJ IDEA, but you expect one, here are a few possible
reasons why:

Possible Reasons and Solutions:
1. JVM Optimizations or Preview Features
You are running Java 22 with --enable-preview, which enables experimental features.
Some newer JDK versions might optimize or change how ExceptionInInitializerError is handled.
Try running the same code using an older, stable Java version (like Java 17 or 11).*/