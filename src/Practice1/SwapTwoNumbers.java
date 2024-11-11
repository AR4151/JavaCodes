package Practice1;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[]args){


        /*int  a = -5+8*6;
        System.out.println(a);

        int  b = (55+9)%9;
        System.out.println(b);

        int  c = 20 + -3*5%8;
        System.out.println(c);
        int  d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(c);
        */

        //Swapping Two Numbers
        int a=15;
        int b=20;
        int temp;
        temp = b;
        b = a;
        b=temp;
        //System.out.println(a);
        //System.out.println(b);

        //Swapping Two Numbers by User Input-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Numbers:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int swap;

        System.out.println("Before Swapping-\nThe value of c is "+c+"\nThe value of d is "+d);

        swap = c;
        c = d;
        d = swap;

        //System.out.println(c);
        //System.out.println(d);
        System.out.println();
        System.out.println("After Swapping-\nThe value of c is "+c+"\nThe value of d is "+d);








    }


}


