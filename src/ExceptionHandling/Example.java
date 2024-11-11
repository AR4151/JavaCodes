package ExceptionHandling;

public class Example {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() throws ArithmeticException{
        doStuffMore();
        /*try{
        doStuffMore();
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }*/
    }

    public static void doStuffMore() {
        System.out.println(10/0);
    }
}
