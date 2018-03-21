public class Grid {
    private char[][] board;
    private int moveCounter;
    private int size;
    private boolean hasWon;

    Grid(){
        board = new char[3][3];
        moveCounter = 0;
        size = 3;
        hasWon = false;
    }

    /* add value to the board for specific player.
       Check if that move has granted the player the W.
     */
    public void move(int r, int c, char p){
        board[r][c] = p;
        moveCounter++;
        if(moveCounter >= 5){ // Prevent useless calls to checkWin
            checkWin(r,c,p);
        }
    }

    public void checkWin(int r, int c, char p){

        /* Check if player has won in a row*/
        for(int i=0; i < size; i++){
            if(board[i][r] != p){
                break;
            }
            if(i == size-1){
                printWinner(p);
            }
        }

        /* Check if player has won in a column*/
        for(int i=0; i < size; i++){
            if(board[c][i] != p){
                break;
            }
            if(i == size-1){
                printWinner(p);
            }
        }

        /*Checking to see were on a diagonal downward right*/
            for(int i=0; i<size; i++){
                if(board[i][i]!=p){
                    break;
                }
                if(i == size-1){
                    printWinner(p);
                }
            }

        /*Checking to see were on a diagonal downward left*/
        for(int i = 0; i < size; i++){
            if(board[i][(size-1)-i]!=p){
                break;
            }
            if(i == size-1){
                printWinner(p);
            }
        }

        /* Have reached max moves and no one has won from prior checks, game must be draw*/
        if(moveCounter == 9 && !hasWon){
            System.out.println("Game has ended in a draw!");
            hasWon = true;  // Reset hasWon and call function to return it so we end our gameloop
            hasWon();
        }
    }

    public void printWinner(char p){
        if(p == 'x'){
            System.out.println("Player 1 has won!");
        }
        else{
            System.out.println("Player 2 has won!");
        }
        hasWon = true;
        hasWon();
    }

    public boolean hasWon(){
        return hasWon;
    }

    public void printBoard(){
        System.out.println(board[0][0]+" | " + board[0][1]+" | "+board[0][2]);
        System.out.println("-------");
        System.out.println(board[1][0]+" | " + board[1][1]+" | "+board[1][2]);
        System.out.println("-------");
        System.out.println(board[2][0]+" | " + board[2][1]+" | "+board[2][2]);
    }
}
