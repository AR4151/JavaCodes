package PracticeSets;
import java.util.Scanner;

/*9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year */

public class LeapYear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year-");
        int a = sc.nextInt();

        if(a%4==0){
            if(a%400==0 || a%100!=0){
                System.out.println(a+" this is a Leap Year.");
            }
            else{
                System.out.println(a+" this not a Leap Year.");
            }
        }
        else{
            System.out.println(a+" is not a Leap Year.");
        }
    }
}
