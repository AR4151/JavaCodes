package ExceptionHandling.Top10Exceptions;

/* ArrayIndexOutOfBoundsException child class of IndexOutOfBoundsException it is child class of RunTimeException.
   So it is Unchecked Exception.It is raised by JVM automatically4
    */


public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        //System.out.println(a[4]);
        try {
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e);
            //e.printStackTrace();
        }
    }
}
