package Polymophism;
import java.util.Scanner;

public class OverLoaAdd {
    int a;
    int b;
    int c;
    int Add(int a,int b){
        return a+b;
    }
    int Add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverLoaAdd aa = new OverLoaAdd();
        System.out.println("Enter the value Num1:");
        aa.a = sc.nextInt();
        System.out.println("Enter the value Num2:");
        aa.b = sc.nextInt();
        System.out.println("Enter the value Num3:");
        aa.c = sc.nextInt();

        System.out.print("The Addition of Two Numbers is: ");
        System.out.println(aa.Add(aa.a,aa.b));
        System.out.print("The Addition of Three Numbers is: ");
        System.out.println(aa.Add(aa.a,aa.b,aa.c));

    }
}
