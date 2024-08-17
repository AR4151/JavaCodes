package PracticeSets;
import java.util.Scanner;

public class PositiveNegative1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number = sc.nextInt();

        if(Number>0){
            System.out.println("Given Number is Positive Number");
        }
        else{
            System.out.println("Given Number is Negative Number");
        }
    }
}
