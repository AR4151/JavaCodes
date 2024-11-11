package ExceptionHandling.Top10Exceptions;

/* JVM will automatically raise an Exception when we try to typeCast Parent object to Child class object.NullPointerException it is child class of RunTimeException.
*  Hence,it is Unchecked Exception. */

public class  ClassCastExp {

    public static void main(String[] args) {


        //This is correct,because we can typecast child ref to parent class ref.
        String s = new String("Roshan");
        Object o = (Object) s;
        System.out.println(o);
        Object oo = new Object();
        String ss = (String) oo; // String ss = (String) o --> this is valid because Obj ref is still pointing towards String obj or reference.
        System.out.println(ss);
    }

}
