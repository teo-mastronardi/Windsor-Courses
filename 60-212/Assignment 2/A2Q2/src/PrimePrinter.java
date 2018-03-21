import java.util.Scanner;

public class PrimePrinter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int limit = in.nextInt();
        PrimeGenerator p1 = new PrimeGenerator();

        int _tempPrime;

        for(int i=0; i <limit; i++){
            _tempPrime = p1.nextPrime();
            if(_tempPrime > limit) break;
            System.out.println(_tempPrime);
        }
    }
}
