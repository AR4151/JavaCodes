package ExceptionHandling.Top10Exceptions;

/* It is child of Error,so it is Unchecked.JVM will automatically raise if any exception occurs while executing
Static Variable assignment and Static block*/
public class ExpInInitializerError {
    static{
        //String s = "Roshan";
        String s = null;
        System.out.println(s.length());
    }
    //static int a = 10/0;

    public static void main(String[] args) {
        //System.out.println(a);


    }
}
