package BasicProgram;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ConvertToLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String-");
        String a =  sc.nextLine();
        System.out.println("Given string in the form of lowercase-");
        System.out.println(a.toLowerCase());
//        System.out.println("String in the form of Lowercase");
//        String b = a.toLowerCase();

        String name = "My Name Is Alte Roshan Deepak";
        System.out.println(name.toLowerCase());

    }
}

