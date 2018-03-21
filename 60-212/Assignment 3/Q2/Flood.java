public class Flood {
    private int width;
    private int height;
    private int xCount;
    private int yCount;
    private int lowestP;
    private int highestP;
    private int floodMap[][];

    public Flood(int w, int h){
        width = w;
        height = h;
        xCount = 0;
        yCount = 0;
        lowestP = 10000000; // Set to large value
        highestP = 0;
        floodMap = new int[w][h];
    }

    /* Function to read in and populate or 2D array with heights*/
    public void reader(int heights){
        floodMap[xCount][yCount] = heights;
        xCount++;
        if(xCount/width==1){
            xCount = 0;
            yCount++;
        }
        if(heights <= lowestP){
            lowestP = heights;
        }
        if(heights >= highestP){
            highestP = heights;
        }
    }

    public int getLowest(){
        return lowestP;
    }


    public int getHighest(){
        return highestP;
    }

    /* Takes in a water level and prints whether or not that position will be flooded*/
    public void getFloodMap(int waterLvl){
        for(int i=0; i < height;i++){
            for(int k=0; k < width; k++){
                if(floodMap[i][k] > waterLvl){
                    System.out.print("-");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /* Debug Function to determine if array was properly populated*/
    public void printMap(){
        for(int i=0; i < height;i++){
            for(int k=0; k < width; k++){
                System.out.print(floodMap[i][k]+" ");
            }
            System.out.println();
        }
    }
}
