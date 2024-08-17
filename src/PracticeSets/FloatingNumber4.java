package PracticeSets;
import java.util.Scanner;

public class FloatingNumber4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Floating Number");
        float a = sc.nextFloat();

        if (a==0){
            System.out.println("Input Number: "+a);
            System.out.println("Zero");
        }
        if (a>0){
            System.out.println("Input Number: "+a);
            System.out.println("Positive");
        }
        if (a<0){
            System.out.println("Input Number: "+a);
            System.out.println("Negative");
        }
        if (a>0){
            if (a<1){
                System.out.println("Input Number: "+a);
                System.out.println("Small");
            }
        }
        if (a>100000){
            System.out.println("Input Number: "+a);
            System.out.println("Large");
        }
    }
}
