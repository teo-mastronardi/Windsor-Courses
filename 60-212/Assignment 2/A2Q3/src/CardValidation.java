public class CardValidation {
    private int sum;
    private int secondSum;
    private int thirdSum;
    private int[] ccNum;

    public CardValidation(){
        sum = 0;
        secondSum = 0;
        thirdSum = 0;
        ccNum = new int[16];
    }

    // Translates string into integer array while also adding up required sums to validate card
    public void parseString(String val){
        val = val.replace("-",""); //Remove all '-' and replace with nothing
        val = val.replace(" ",""); //Remove all ' ' and replace with nothing

        for(int i=0;i<val.length();i++){
            ccNum[i] = val.charAt(i) - '0'; // Translate from char to Int to store in int array
            sum += ccNum[i];
            if(i%2==0&&ccNum[i]>4){  //If every second digit and digit is greater than 4
                secondSum+=ccNum[i];
                thirdSum++;
            }
            else if(i%2==0){  // If every second digit and not greater than 4
                secondSum+=ccNum[i];
            }
        }
    }

    // Function to take card validation
    public boolean validate(){
        int validator = sum+secondSum+thirdSum;  // Full sum
        return validator % 10 == 0;
    }
}
