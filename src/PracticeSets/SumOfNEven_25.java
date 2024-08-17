package PracticeSets;
import java.util.Scanner;

public class SumOfNEven_25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for(int i=0;i<=a;i++){
            sum = sum + (i*2);
//            System.out.println("The Sum is "+sum);
        }
        System.out.println("The Sum is "+sum);

    }
}
