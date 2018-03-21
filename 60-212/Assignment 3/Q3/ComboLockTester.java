import java.util.Scanner;

public class ComboLockTester {

    public static void main(String[] args) {
        int s1,s2,s3;
        while(true){
            System.out.println("Please enter 3 values between 0-39 each");
            System.out.println("If you wish to stop at any time, enter the values 0 three times");
            Scanner scan = new Scanner(System.in);
            s1 = scan.nextInt();
            s2 = scan.nextInt();
            s3 = scan.nextInt();
            if(s1 == 0 && s2 == 0 && s3 ==0){
                break;
            }
            ComboLock myCombo = new ComboLock(s1,s2,s3);
            System.out.println("Please enter the 3 values you wish to test");
            s1 = scan.nextInt();
            s2 = scan.nextInt();
            s3 = scan.nextInt();
            myCombo.turnRight(s1);
            myCombo.turnLeft(s2);
            myCombo.turnRight(s3);
            if(myCombo.open()){
                System.out.println("You have entered the correct combination!");
            }
            else{
                System.out.println("You have entered the combination incorrectly.");
            }
            myCombo.reset();
        }
    }
}
