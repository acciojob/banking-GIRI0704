package com.driver;

public class BankAccount {

    private String name;
    public double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        // Each digit of an account number can lie between 0 and 9 (both inclusive).
        // Generate an account number having the given number of 'digits' such that the sum of digits is equal to 'sum'.
        // If it is not possible, throw "Account Number cannot be generated" exception

        if (digits < 1 || digits > 9 * digits || sum < 0) {
            throw new Exception("Account Number cannot be generated");
        }

        StringBuilder accountNumber = new StringBuilder();
        int remainingSum = sum;

        for (int i = 0; i < digits - 1; i++) {
            int maxDigit = Math.min(9, remainingSum);
            int digit = (int) (Math.random() * (maxDigit + 1));
            accountNumber.append(digit);
            remainingSum -= digit;
        }

        accountNumber.append(remainingSum);

        return accountNumber.toString();
    }

    public void deposit(double amount) {
        // Add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception if the remaining amount would be less than the minimum balance
        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }

}
