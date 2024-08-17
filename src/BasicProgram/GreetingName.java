package BasicProgram;
import java.util.Arrays;
import java.util.Scanner;

public class GreetingName {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Name");
//        String a = sc.nextLine();
//        System.out.println("Hello "+a+",Have a Good Day!");
        int  [][] x= new int[2][];
        x[0] = new int[2];
        x[1] = new int[3];
        x[0][0] = 12;
        x[0][1] = 15;
        x[1][0] = 18;
        x[1][1] = 17;
        x[1][2] = 19;
        //System.out.print(Arrays.deepToString(x));
        //System.out.println(x[0]);
        int [] a = {1,5,8,95,7,45,78};
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
           // System.out.print(a[i]+" ");
        }
//        double [] y = {15.05,59.02,46.26,25.65};
//        System.out.println(Arrays.toString(y));
    }
}
