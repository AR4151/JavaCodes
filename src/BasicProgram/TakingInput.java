package BasicProgram;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Code for Multiplication of Two Numbers");
        System.out.println("Taking User Input");
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number is :");
        int a = sc.nextInt();
        System.out.println("Second Number is :");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("The Multiplication of Two Numbers is " + mul);
    }
}
