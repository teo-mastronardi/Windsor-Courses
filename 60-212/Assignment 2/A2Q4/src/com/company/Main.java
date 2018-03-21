package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        int counter = 1;

        /* Deposites $10 every day and withdraws $5 every 5 days for 99 days. (Over 3 months)
           The transaction fee is levied at the end each month so it should be printed 3 times with
           a noticable smaller balance on the bank account.
           Should lose $13.50 every month (36 transactions, 10 free, 26+1*.50)

           REMEMBER: Still deposites $10 on that day so only looks like $3.50 has been deducted
         */
        while(counter != 100){
            account1.deposit(10);
            if(counter%5==0){
                account1.withdraw(5);
            }
            account1.increaseDay();
            if(counter%31 ==0) { // If we reach the end of the month, prove that the fee has been levied
                System.out.println("End of month! Day: "+counter+". Current balance: $"+account1.getBalance());
            }
            else{
                System.out.println("Day: "+counter+". Current balance: $"+account1.getBalance());
            }
            counter++;
        }
    }
}
