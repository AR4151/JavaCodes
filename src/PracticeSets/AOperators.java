package PracticeSets;
import java.util.Scanner;
public class AOperators {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the 1st Number");
        int a = sc1.nextInt();
        System.out.println("Enter the 2nd Number");
        int b = sc2.nextInt();

        int sum = a + b;
        System.out.println("The Addition of  a+b: "+sum);

        int sub = a - b;
        System.out.println("The Addition of  a-b: "+sub);

        int Mul = a * b;
        System.out.println("The Addition of  a*b: "+Mul);

        int Div = a / b;
        System.out.println("The Addition of  a/b: "+Div);
    }
}
