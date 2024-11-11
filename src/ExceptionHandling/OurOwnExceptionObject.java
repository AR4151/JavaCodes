package ExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);

    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
public class OurOwnExceptionObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if(age<18){
            throw new TooYoungException("Wait some more time, Your are too Young");
        }
        else if(age>60){
            throw new TooOldException("Wait some time No need to Worry");
        }
        else{
            System.out.println("Welcome! You will find your Soulmate. Please have Patience");
        }
    }

}
