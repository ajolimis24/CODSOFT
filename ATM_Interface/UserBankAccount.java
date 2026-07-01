package CODSOFT.ATM_Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserBankAccount {
    private float amount = 0;
    private float depositeAmount = 0;
    float withdraw = 0;
    Scanner s = new Scanner(System.in);

    void checkBankBalance() {
        System.out.println("Bank Balance : " + amount);
    }

    void depositeAmount() {

        System.out.println("Your current balance : " + amount);
        System.out.println("Enter the amount to deposite : ");
        try {
            depositeAmount = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter the vailed Data...");
            s.nextLine(); // Clear input buffer
            return;
        }
        if (depositeAmount < 0) {
            System.out.println("Warning ! : Invailed data entery");
        }
        System.out.println("your current bank balance : " + amount);
        System.out.println("Deposite amount : " + depositeAmount);
        amount += depositeAmount;
        checkBankBalance();
        depositeAmount = 0;
    }

    void WithdrawAount() {
        System.out.println("Your current bank balance : " + amount);
        System.out.println("Enter the amount to withdraw : ");
        try {
            withdraw = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Warning ! : Invailed data entery...");
            s.nextLine(); // Clear input buffer
            return;
        }
        if(withdraw<=amount){
            System.out.println("Amount withdraw sucessfully...");
            amount-=withdraw;
            checkBankBalance();
        }
        else{
            System.out.println("Insufficient bank balance ! ");
        }
        withdraw = 0;
    }
}