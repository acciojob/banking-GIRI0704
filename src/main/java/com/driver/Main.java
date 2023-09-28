package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("John Doe", 10000, 5000, 0.05);
            System.out.println("Savings Account Balance: " + savingsAccount.balance); // Access the balance field directly
            savingsAccount.withdraw(2000);
            System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.balance);

            // Creating a CurrentAccount
            CurrentAccount currentAccount = new CurrentAccount("Jane Smith", 7000, "TRADE123");
            System.out.println("Current Account Balance: " + currentAccount.balance); // Access the balance field directly
            currentAccount.deposit(2000);
            System.out.println("Current Account Balance after deposit: " + currentAccount.balance);

            // Creating a StudentAccount
            StudentAccount studentAccount = new StudentAccount("Alice Johnson", 500, "ABC University");
            System.out.println("Student Account Balance: " + studentAccount.balance); // Access the balance field directly

            // Generating an account number
            String accountNumber = studentAccount.generateAccountNumber(6, 24);
            System.out.println("Generated Account Number: " + accountNumber);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
