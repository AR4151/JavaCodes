package PracticeSets;
import java.util.Scanner;

public class SumAvg {
    public static void main(String[]args){
        Scanner First = new Scanner(System.in);
        Scanner Second = new Scanner(System.in);
        Scanner Third = new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        float a = First.nextFloat();
        System.out.println("Enter the 2nd Number");
        float b = Second.nextFloat();
        System.out.println("Enter the 3rd Number");
        float c = Third.nextFloat();

        float d = (a+b+c);
        System.out.println("The Sum of above three numbers is "+d);
        float e = (a+b+c)/3;
        System.out.println("The Average of the above three numbers is "+e);

    }
}
