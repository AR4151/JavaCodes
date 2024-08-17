package BasicProgram;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        System.out.println("Code to find give Number is Even or Odd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Given Number is Even Number");
        }
        else{System.out.println("Given Number is Odd Number");
        }
    }
}
