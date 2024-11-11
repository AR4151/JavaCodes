package ExceptionHandling;

public class Try_CatchInCatchBlock {
    public static void main(String[] args)
    {
        System.out.println("111");
        try
        {
            System.out.println("222");
            //double y = 1.0/0;
            //int y = 1/0;
            double y = 1/0;
        }
        catch(ArithmeticException e)
        {
            try
            {
                System.out.println("Hello");
                int x = 20/0;
            }
            catch(NullPointerException np)
            {
                System.out.println("333");
            }
        }
        System.out.println("444");
    }
}
/*In Java, implicit type promotion only occurs under specific conditions. Here are the key points regarding type promotion:

Type Promotion Rules:
In an expression involving mixed types, Java promotes the operands to a common type based on the hierarchy of types.
 However, if both operands are of the same type (in this case, int), no promotion occurs.
If either operand was a floating-point type (e.g., float or double), the other would be promoted to that type.
 For example, 1.0 / 0 would involve promoting 1 to double, resulting in 1.0 / 0 which yields Infinity.

 Summary
Integer Division: 1 / 0 is treated as integer division, leading to an exception.
Floating-Point Division: 1.0 / 0 is treated as floating-point division, resulting in Infinity.
The promotion to double occurs only when at least one operand is a floating-point number, which is not the case in 1 / 0.*/