package BasicProgram;
import java.util.Scanner;
public class Marks {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Code for the Percentage got in SSC");
        System.out.println("Marks in Marathi");
        float a = sc.nextInt();
        System.out.println("Marks in Sanskrit");
        float b = sc.nextInt();
        System.out.println("Marks in English");
        float c = sc.nextInt();
        System.out.println("Marks in Mathematics");
        float d = sc.nextInt();
        System.out.println("Marks in Science");
        float e = sc.nextInt();
        System.out.println("Marks in Social Science");
        float f = sc.nextInt();
        float g = ((a+b+c+d+e+f)/600)*100;
        System.out.println("The Students got Percentage in SSC: "+g);

    }

}
