package ExceptionHandling;
/*In Java, when you divide a non-zero floating-point number by zero, the result is positive or negative Infinity.
 Since 3.2 is positive, and you're dividing it by zero, the result is +Infinity.
Thus, Infinity is printed because you're dividing a positive number by zero in a floating-point context.*/

/* Remember,In Java, any decimal number is divided by zero
*       If Number is Positive output will be ==> +Infinity
*       If Number is Negative output will be ==> -Infinity
*/

public class FloatingNumDivByZero {
    public static void main(String[] args) {
        float[] n = {15,11,10,25,20};     //--> float[] n = {15.0f, 11.0f, 10.0f, 25.0f, 20.0f};
        double[] m = {-15,-11,10,25,20};  //--> double[] m = {-15.0, -11.0, 10.0, 25.0, 20.0};
        int a = 10;
        float x = n[0]/(a-n[2]);
        double o = m[0]/(a-m[2]);
        System.out.println(x);
        System.out.println(o);
        System.out.println(15/0);
    }
}

/*The array m is declared as a double[], and the values include both positive and negative numbers.
This is perfectly valid because Java allows both positive and negative values in floating-point arrays.*/
