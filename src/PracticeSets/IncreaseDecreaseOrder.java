package PracticeSets;
import java.util.Scanner;

//31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
//
//        Test Data
//Input first number: 1524
//Input second number: 2345
//Input third number: 3321
//Expected Output :
//
//Increasing order

public class IncreaseDecreaseOrder {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Input First Number");
        int a = sc1.nextInt();
        System.out.println("Input Second Number");
        int b = sc2.nextInt();
        System.out.println("Input Third Number");
        int c = sc3.nextInt();

        if (a<b && b<c){
            System.out.println("Numbers are in Increasing Order");
        }





    }
}
