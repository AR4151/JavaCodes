package PracticeSets;
import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[]args){
//        int n=10;
//        for(int i=0;i<=n;i++){
//            System.out.println(i*2+1);
//        }
        //int n=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        //int i = sc.nextInt();
        for(int i=sc.nextInt();i>0;i--){
            System.out.println(i);
        }

    }
}
