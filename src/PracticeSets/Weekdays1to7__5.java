package PracticeSets;
import java.util.Scanner;
public class Weekdays1to7__5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int Num = sc.nextInt();

//        if (Num==1){
//            System.out.println("Monday");
//        }
//        else if (Num==2){
//            System.out.println("Tuesday");
//        }
//        else if (Num==3){
//            System.out.println("Wednesday");
//        }
//        else if (Num==4){
//            System.out.println("Thursday");
//        }
//        else if (Num==5){
//            System.out.println("Friday");
//        }
//        else if (Num==6){
//            System.out.println("Saturday");
//        }
//        else if (Num==7){
//            System.out.println("Sunday");
//        }
//        else {
//            System.out.println("Please Enter Number between 1 to 7");
//        }
        switch(Num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }


    }
}
