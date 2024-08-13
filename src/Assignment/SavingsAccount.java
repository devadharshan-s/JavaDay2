package Assignment;

import java.util.Scanner;

public class SavingsAccount extends Account{
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        savingsAccount.setAccountNumber(accountNumber);
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}
