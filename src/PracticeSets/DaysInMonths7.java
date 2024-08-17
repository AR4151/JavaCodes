package PracticeSets;
import java.util.Scanner;


//7. Write a Java program to find the number of days in a month.
//
//        Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days

public class DaysInMonths7 {
    public static void main(String[]args){
        Scanner One = new Scanner(System.in);
        Scanner Two = new Scanner(System.in);

        System.out.println("Enter the Month Number");
        int month = One.nextInt();
        System.out.println("Enter the Year");
        int year = Two.nextInt();

        if (month==1){
            System.out.println("January "+year+" has 31 days.");
        }
        else if (month==2){
            System.out.println("February "+year+" has 29 days.");
        }
        else if (month==3){
            System.out.println("March "+year+" has 31 days.");
        }
        else if (month==4){
            System.out.println("April "+year+" has 30 days.");
        }
        else if (month==5){
            System.out.println("May "+year+" has 31 days.");
        }
        else if (month==6){
            System.out.println("June "+year+" has 30 days.");
        }
        else if (month==7){
            System.out.println("July "+year+" has 31 days.");
        }
        else if (month==8){
            System.out.println("August "+year+" has 31 days.");
        }
        else if (month==9){
            System.out.println("September "+year+" has 30 days.");
        }
        else if (month==10){
            System.out.println("October "+year+" has 31 days.");
        }
        else if (month==11){
            System.out.println("November "+year+" has 30 days.");
        }
        else if (month==12){
            System.out.println("December "+year+" has 31 days.");
        }
        else{
            System.out.println("Please,Enter a valid Month Number");
        }
    }

}
