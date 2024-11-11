package ExceptionHandling;

import java.util.Scanner;

class CanWithdraw1 extends RuntimeException {
    CanWithdraw1(String s) {
        super(s);  // Pass the message to RuntimeException's constructor
    }
}

class CantWithdraw1 extends RuntimeException {
    CantWithdraw1(String s) {
        super(s);  // Pass the message to RuntimeException's constructor
    }
}

public class OwnException1 {
    public static void main(String[] args) {
        float accountBalance = 10000.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount you want to Withdraw: ");
        float withdrawAmount = sc.nextFloat();

        try {
            if (withdrawAmount <= 0) {
                System.out.println("Please, Enter a valid Amount.");
            } else if (withdrawAmount > accountBalance) {
                // Throwing custom exception
                throw new CantWithdraw1("You can't withdraw, because the withdrawal amount is greater than the account balance.");
            } else {
                throw new CanWithdraw1("Yes, you can withdraw the money.");
            }
        } catch (CanWithdraw1 | CantWithdraw1 canWithdraw1) {
            System.out.println("Message: " + canWithdraw1.getMessage());
        }
    }
}

