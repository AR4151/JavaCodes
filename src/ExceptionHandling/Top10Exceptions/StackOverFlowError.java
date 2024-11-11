package ExceptionHandling.Top10Exceptions;

/* StackOverflowError it is Child class of Error.Hence,it is Unchecked.JVM will automatically raise the error whenever we are trying to perform Recursive Method call*/

public class StackOverFlowError {
    public static void m1() {
        m2();

    }
    public static void m2() {
        m1();

    }
    public static void main(String[] args) {
        m1();
    }
}
