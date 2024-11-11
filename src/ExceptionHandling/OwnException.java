package ExceptionHandling;

import java.util.Scanner;

//class CanWithdraw extends RuntimeException {
//    CanWithdraw(String s) {
//        super(s);
//
//    }
//}
class CantWithdraw extends RuntimeException{
    CantWithdraw(String s){
        super(s);
    }
}

public class OwnException {
    public static void main(String[] args) {
        float Account_Balance = 10000.0f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount you wants to Withdraw - ");
        float Withdraw = sc.nextFloat();
        if(Withdraw != 0 && Withdraw<=Account_Balance){
            System.out.println("Yes you can Withdraw the Money.");
        }
        else if (Withdraw>Account_Balance) {
            throw new CantWithdraw("You can't Withdraw, Because Withdrawal amount is Greater than the Account Balance");

        }
        else{
            System.out.println("Please, Enter the Valid Amount");
        }

    }
}
