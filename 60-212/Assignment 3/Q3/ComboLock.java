public class ComboLock {
    private int rightTurn;
    private int leftTurn;
    private int secondRight;

    private boolean leftTurnBool;
    private boolean secondRightBool;


    private int correctCounter;


    public ComboLock(int secret1, int secret2, int secret3) {
        rightTurn = secret1;
        leftTurn = secret2;
        secondRight = secret3;

        correctCounter = 0;

        leftTurnBool = false;
        secondRightBool = false;
    }

    public void reset() {
        correctCounter = 0;
        leftTurnBool = false;
        secondRightBool = false;
    }

    public void turnLeft(int ticks) {
        leftTurnBool = true;
        if(ticks == leftTurn){
            correctCounter++;
        }

    }

    public void turnRight(int ticks) {
        if(secondRightBool && leftTurnBool){ // This is the second right turn so we have to check the other right
            if(ticks == secondRight){
                correctCounter++;
            }
        }
        else{
            if(ticks == rightTurn && !leftTurnBool){ // Left hasn't been turned before first right
                correctCounter++;
            }
            secondRightBool = true;
        }
    }

    public boolean open() {
        if(correctCounter == 3) return true;
        return false;
    }
}