package CODSOFT.ATM_Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMmachin {
    int opp = 0;
    boolean run = true;
    Scanner s = new Scanner(System.in);
    UserBankAccount uba = new UserBankAccount();

    void display() {
        while (run) {
            System.out.println("=====================");
            System.out.println("\n ATM Machin");
            System.out.println("=====================");
            System.out.println(" 1 . Check Bank Balance");
            System.out.println(" 2 . Deposite Amount");
            System.out.println(" 3 . Withdraw Amount");
            System.out.println(" 4 . Exit");
            System.out.println("======================");

            System.out.println("Enter the option : ");
            try {
                opp = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                s.nextLine(); // Clear input buffer
                continue;
            }
            switch (opp) {
                case 1 -> uba.checkBankBalance();

                case 2 -> uba.depositeAmount();

                case 3 -> uba.WithdrawAount();

                case 4 -> run = false;

            }
        }
    }

}
