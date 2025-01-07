package ExceptionHandling;

//Without try-catch --> Abnormal Termination

public class TryCatch1 {
    public static void main(String[]args){
        System.out.println("Start");
        //System.out.println(10/0);
        System.out.println("End");
        //TryCatch2.main(args);
        TryCatch3.main(args);
    }
}

//With try-catch --> Normal Termination
class TryCatch2{
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println("End");

    }
}
class TryCatch3{
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println(10/0);
        }
        catch (Throwable e){
            System.out.println(10/2);
            e.printStackTrace();
            //System.out.println(e);
        }
        System.out.println("End");

    }
}


