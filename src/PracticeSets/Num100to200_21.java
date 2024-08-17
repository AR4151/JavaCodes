package PracticeSets;
import java.util.Scanner;

public class Num100to200_21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter First Number");
        int i = sc.nextInt();
        System.out.println("Enter Second Number");
        int n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
