public class AirlineSeating {
    private int fClassSeats[][];
    private int eClassSeats[][];

    private int fCounter;
    private int fCounterX;
    private int fCounterY;

    private int eCounter;

    public AirlineSeating(){
        fClassSeats = new int[5][4];
        eClassSeats = new int[15][6];
    }

    public void showSeating(){
        System.out.println("Printing seats!");
        for(int i=0; i < 5; i++){
            for(int k=0; k < 4; k++){
                if(k==2) System.out.print(" ");
                if(fClassSeats[i][k]==0){
                    System.out.print(" []");
                }
                else{
                    System.out.print(" X");
                }
            }
            System.out.println();
        }

        System.out.println("------------");
        for(int i=0; i < 15; i++){
            for(int k=0; k < 6; k++){
                if(k==3) System.out.print(" ");
                if(eClassSeats[i][k]==0){
                    System.out.print("[]");
                }
                else{
                    System.out.print(" X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    /*Takes in a class c, number of passengers and seating pref */
    public void addPassengers(char c, int numPass, char p){
        if(c == 'f'){
            if(numPass == 1){
                if(p == 'a'){ // 1 passenger and isle
                    for(int i=0; i < 5; i++){
                        if(fClassSeats[i][1] != 0 || fClassSeats[i][2] != 0){ // Aisle seats are occupado
                            if(i==4){
                                System.out.println("No match exists.");
                            }
                            continue;
                        }
                        else{
                            if(fClassSeats[i][1]==0){
                                fClassSeats[i][1] = 1;
                                return;
                            }
                            else {
                                fClassSeats[i][2] = 1;
                                return;
                            }
                        }
                    }

                }
                else{ // 1 Passenger and window
                    for(int i=0; i < 5; i++){
                        if(fClassSeats[i][0] != 0 || fClassSeats[i][3] != 0){ // Window seats are occupado
                            if(i==4){
                                System.out.println("No match exists.");
                            }
                            continue;
                        }
                        else{
                            if(fClassSeats[i][0]==0){
                                fClassSeats[i][0] = 1;
                                return;
                            }
                            else {
                                fClassSeats[i][3] = 1;
                                return;
                            }
                        }
                    }
                }
            }
            else{ // 2 passengers
                for(int k=0; k<5; k++){
                    for(int i=0; i < 4; i++){
                        if(fClassSeats[i][i]==0 &&fClassSeats[i][i+1]==0){
                            fClassSeats[i][i]=1;
                            fClassSeats[i][i+1]=1;
                            return;
                        }
                        else{
                            continue;
                        }
                    }
                    if(k == 4){
                        System.out.println("No match exists.");
                    }
                }
            }
        }

        /* Economy class */
        else{
            if(numPass == 1){
                if(p == 'a'){ // 1 passenger and isle
                    for(int i=0; i < 15; i++){
                        if(eClassSeats[i][2] != 0 || eClassSeats[i][3] != 0){ // Aisle seats are occupado
                            if(i==14){
                                System.out.println("No match exists.");
                            }
                            continue;
                        }
                        else{
                            if(eClassSeats[i][2]==0){
                                eClassSeats[i][2] = 1;
                                return;
                            }
                            else {
                                eClassSeats[i][3] = 1;
                                return;
                            }
                        }
                    }

                }
                else if(p =='w'){ // 1 Passenger and window
                    for(int i=0; i < 15; i++){
                        if(eClassSeats[i][0] != 0 || eClassSeats[i][5] != 0){ // Window seats are occupado
                            if(i==14){
                                System.out.println("No match exists.");
                            }
                            continue;
                        }
                        else{
                            if(eClassSeats[i][0]==0){
                                eClassSeats[i][0] = 1;
                                return;
                            }
                            else {
                                eClassSeats[i][5] = 1;
                                return;
                            }
                        }
                    }
                }

                else{// 1 Passenger and center
                    for(int i=0; i < 15; i++){
                        if(eClassSeats[i][1] != 0 || eClassSeats[i][4] != 0){ // Window seats are occupado
                            if(i==14){
                                System.out.println("No match exists.");
                            }
                            continue;
                        }
                        else{
                            if(eClassSeats[i][1]==0){
                                eClassSeats[i][1] = 1;
                                return;
                            }
                            else {
                                eClassSeats[i][4] = 1;
                                return;
                            }
                        }
                    }
                }
            }
            if(numPass == 2){ // 2 passengers
                for(int k=0; k<15; k++){
                    for(int i=0; i < 5; i++){
                        if(eClassSeats[i][i]==0 &&eClassSeats[i][i+1]==0){
                            eClassSeats[i][i]=1;
                            eClassSeats[i][i+1]=1;
                            return;
                        }
                        else{
                            continue;
                        }
                    }
                    if(k == 14){
                        System.out.println("No match exists.");
                    }
                }
            }
            else{ // 3 passengers
                for(int k=0; k<15; k++){
                    for(int i=0; i < 3; i++){
                        if(eClassSeats[i][0]==0 &&eClassSeats[i][1]==0&&eClassSeats[i][2]==0){
                            eClassSeats[i][0]=1;
                            eClassSeats[i][1]=1;
                            eClassSeats[i][2]=1;
                            return;
                        }
                        if(eClassSeats[i][3]==0 &&eClassSeats[i][4]==0&&eClassSeats[i][5]==0){
                            eClassSeats[i][3]=1;
                            eClassSeats[i][4]=1;
                            eClassSeats[i][5]=1;
                            return;
                        }
                        else{
                            continue;
                        }
                    }
                    if(k == 14){
                        System.out.println("No match exists.");
                    }
                }
            }
        }
    }
}
