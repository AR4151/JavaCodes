package PracticeSets;
import java.util.Scanner;
public class iff {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Num = sc1.nextInt();

        if (Num==1){
            System.out.println("Monday");
        }
        if (Num==2){
            System.out.println("Tuesday");
        }
        if (Num==3){
            System.out.println("Wednesday");
        }
        if (Num==4){
            System.out.println("Thursday");
        }
        if (Num==5){
            System.out.println("Friday");
        }
        if (Num==6){
            System.out.println("Saturday");
        }
        if (Num==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Please Enter Number between 1 to 7");
        }
    }
}