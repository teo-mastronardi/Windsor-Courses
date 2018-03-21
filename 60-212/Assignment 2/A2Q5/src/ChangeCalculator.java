public class ChangeCalculator {
    private int amountReceived;
    private int amountDue;
    private int owed;

    public ChangeCalculator(int aReceived, int aDue){
        amountReceived = aReceived;
        amountDue = aDue;
        owed = amountReceived - amountDue;
        change();
    }

    public void change(){
        // Since the amount is stored as pennies, we can divide by 100 to get the amount of dollars (100 pennies = $1)
        int dollars = owed/100;
        System.out.println(dollars+" dollars");
        owed = owed%100; // The new owed amount is the remainder after taking out the amount of dollars

        int quarters = owed/25;
        System.out.println(quarters+" quarters");
        owed %=25;

        int dimes = owed/10;
        System.out.println(dimes+" dimes");
        owed %=10;

        int nickles = owed/5;
        System.out.println(nickles+" nickles");
        owed %=10;

        int pennies = owed/1;
        System.out.println(pennies+" pennies");
    }
}
