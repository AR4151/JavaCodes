package ExceptionHandling.Top10Exceptions;

/* NullPointerException is Child class of RunTimeException.Hence,it is Unchecked Exception.
*  When we try to perform any operation on null obj then JVM will automatically give this Exception*/

public class NullPointerExp {
    static String ss = "java";
    public static void main(String[] args) {
        String s = "Java";
        //ss= null;
        s = null;
        System.out.println(ss);
        //System.out.println(s.length());
        try
        {
            System.out.println(s.length());
        }
        catch(RuntimeException e)
        {
            System.out.println(e);
        }

    }
}
