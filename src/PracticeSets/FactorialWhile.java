package PracticeSets;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();

        //int a = 5;
        int i = 1;
        int fac = 1;

    //Factorial using While Loop-
//        while( i<=a){
//            fac = i*fac;
//            i++;
//            //System.out.println(fac);
//        }
        System.out.println("The Factorial of given number is-");
        //System.out.println(fac);

     //Factorial using For Loop-
        for(i=1;i<=a;i++){
            fac = i*fac;
        }
        System.out.println(fac);
    }
}

