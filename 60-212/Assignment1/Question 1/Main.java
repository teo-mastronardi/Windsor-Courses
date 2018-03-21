/* Teo Mastronardi
   104203268
   Question 1
*/
package com.company;

public class Main {

    public static void main(String[] args) {
	// Computes the amount of money a person would make yearly on $1000 gaining 5% interest per year
        double balance = 1000;
        double interest = .05;
        balance += balance * interest;
        System.out.print("Balance after first year: $"+balance);
        balance += balance * interest;
        System.out.print("Balance after second year: $"+balance);
        balance += balance * interest;
        System.out.print("Balance after third year: $"+balance);
    }
}
