package PracticeSets;
import java.util.Scanner;

//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
//
//        Test Data
//Input first number: 2564
//Input second number: 3526
//Input third number: 2456
//Expected Output :
//
//All numbers are different

public class SameOrDiffNum30 {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Input First Number:");
        int a = sc1.nextInt();

        System.out.println("Input Second Number:");
        int b = sc2.nextInt();

        System.out.println("Input Third NUmber:");
        int c = sc3.nextInt();

        if(a==b) {
            if (b == c) {
                System.out.println("All Numbers are Same.");
            } else {
                System.out.println("Two Numbers are Same.");
            }
        }
        else{
            System.out.println("All Numbers are Different.");

        }
    }

}
