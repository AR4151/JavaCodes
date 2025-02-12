package ExceptionHandling;


import java.util.Scanner;

class NotAllowed extends RuntimeException {
    NotAllowed(String s){
        super(s);
    }
}
public class OwnExp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if(age<21){
            throw new NotAllowed("Your are allowed to Marry,Have Patience!");
        }
        else{
            throw new RuntimeException("Allowed to Marry!");
            //System.out.println("Hello");
        }
    }
}
