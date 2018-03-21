import java.util.Scanner;
/*
    Teo Mastronardi
    Assignment 2 Question 5
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Expected: 1 dollar, 1 quarter");
        ChangeCalculator change = new ChangeCalculator(500, 375);
        System.out.println("Expected: 51323 dollar, 2 quarter2 2 dimes 3 pennies");
        ChangeCalculator change1 = new ChangeCalculator(5132423, 50);
        System.out.println("Expected: 2 dollar, 1 quarter 1 nickle 7 pennies");
        ChangeCalculator change2 = new ChangeCalculator(999, 767);
        System.out.println("Expected: 1 penny");
        ChangeCalculator change3 = new ChangeCalculator(2, 1);
    }
}
