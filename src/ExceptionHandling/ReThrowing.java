package ExceptionHandling;

public class ReThrowing {
    public static void main(String[] args) {

        try{
            String s = "RE-THROWONG";
            System.out.println(s);
            System.out.println(10/0);
            System.out.println("Re-Throwing --> We can use this approach to convert ONE Exception to ANOTHER  Exception");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception --> "+ e);
            //throw new NullPointerException("Exception in Catch Block "+e.getMessage());
            //System.out.println("End of try-catch block");
            //e.printStackTrace();
        }
        //System.out.println("End of try-catch block");
        finally{
            System.out.println("finally block");
        }
    }
}
