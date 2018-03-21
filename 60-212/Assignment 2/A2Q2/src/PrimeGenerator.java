public class PrimeGenerator {
    private int current;

    public PrimeGenerator(){
        current = 1;
    }

    /*
     Calculates the next prime number.
     @return the next prime number
     */
    public int nextPrime() {
        do{
            current++;
        } while (!isPrime(current));
        return current;
    }


    /*
     Check if n is a prime number.
     @param n to check whether it is prime or not
     @return true if n is prime
     */
    public static boolean isPrime(int n){
        //if(n < 2) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
