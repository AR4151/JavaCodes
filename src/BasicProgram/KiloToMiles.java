package BasicProgram;
import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometer value");
        double a = sc.nextDouble();
        double b = a*0.621371;
        System.out.println(a+" Kilometers is equals to "+b+" Miles");
    }
}
