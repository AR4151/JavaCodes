package PracticeSets;
import java.util.Scanner;

//29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

//Test Data
//Input an integer number less than ten billion: 125463
//Expected Output :
//
//Number of digits in the number: 6
public class LengthOfNumber29 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        String a = sc.next();
        System.out.println("Number of digit in the number is "+a.length()+".");
    }
}
