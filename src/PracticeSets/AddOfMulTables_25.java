package PracticeSets;
import java.util.Scanner;

public class AddOfMulTables_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum =0;
        int mul;

        for (int i = 1; i <= 10; i++) {
            mul = i * n;
            sum = sum + mul;
        }
        System.out.println("The Sum of Table "+n+" is "+sum+".");
    }
}