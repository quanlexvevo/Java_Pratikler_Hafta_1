package bankaccountclasspractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            BankAccount account = new BankAccount("Cem", 3);
            System.out.println("What would you like to do?\n1) Show Balance \n2) Deposit \n3) Withdraw\n");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Current balance: " + account.getBalance() + " TL");
            }
            if (choice == 2) {
                System.out.println("How much would you like to deposit? : ");
                int depositAmount = scanner.nextInt();
                account.deposit(depositAmount);
            }
            if (choice == 3) {
                System.out.println("How much would you like to withdraw? : ");
                int withdrawAmount = scanner.nextInt();
                account.withdraw(withdrawAmount);
            }
        }





    }
