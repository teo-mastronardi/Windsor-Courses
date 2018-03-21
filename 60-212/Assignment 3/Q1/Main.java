import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grid board = new Grid();
        int currPlayer = 1;
        char p = 'x';
        board.printBoard();

        while(!board.hasWon()){
            System.out.println("Enter your move player "+ currPlayer);
            Scanner scan = new Scanner(System.in);
            int r = scan.nextInt();
            int c = scan.nextInt();
            if(r < 0 || r > 2 || c < 0 || c > 2){
                System.out.println("Please enter valid coords");
                continue;
            }
            else{
                board.move(r,c,p);
                board.printBoard();
                if(currPlayer == 1){
                    currPlayer = 2;
                    p = 'o';
                }
                else{
                    currPlayer = 1;
                    p ='x';
                }
            }

        }
    }
}
