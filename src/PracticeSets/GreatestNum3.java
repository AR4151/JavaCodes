package PracticeSets;

import java.util.Scanner;

public class GreatestNum3 {
    public static void main(String[]args){
        Scanner first = new Scanner(System.in);
        Scanner sec = new Scanner(System.in);
        Scanner third = new Scanner(System.in);

        System.out.println("Enter the 1st Number");
        int a = first.nextInt();
        System.out.println("Enter the 2nd Number");
        int b = sec.nextInt();
        System.out.println("Enter the 3rd Number");
        int c = third.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("The Greatest Number is "+a);
            }
        }

        if (b>c){
            if (b>a){
                System.out.println("The Greatest Number is "+b);
            }
        }

        if (c>a){
            if (c>b){
                System.out.println("The Greatest Number is "+c);
            }
        }


    }
}
