package com.company;

public class BankAccount {
    private double balance;
    private int month;
    private int day;
    private double fee;
    private int transactionCount;
    private int freeTransactions;


    public BankAccount(){
        balance = 1000;
        month = 1;
        day = 1;
        fee = .5;
        transactionCount = 0;
        freeTransactions = 10;
    }

    public void deposit(int val){
        balance += val;
       // balance -= fee; Commented out for part 2?
        if(day == 31) deductMonthlyCharge(); // If end of month
        transactionCount++;
    }


    public void withdraw(int val){
        balance -= val;
        // balance -= fee; Commented out for part 2?
        if(day == 31) deductMonthlyCharge(); // If end of month
        transactionCount++;
    }

    public void deductMonthlyCharge(){
        balance-= fee*(transactionCount-freeTransactions); // Didn't use Math.max
        transactionCount=0;
    }

    public void increaseDay(){
        if(day == 31) day = 0; // Assuming all months are 31 days
        day++;
    }

    public double getBalance(){
        return balance;
    }
}
