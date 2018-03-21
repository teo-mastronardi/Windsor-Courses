public class Microwave {
    private int time;
    private char power;
    private boolean stop;

    public Microwave(){
        time =0;
        power = 'L';
        stop = true;
    }

    void setPower(char _val){
        power = _val;
    }

    void reset(){
        time = 0;
        stop = true;
    }

    void stop(){
        stop = true;
        System.out.println("Cooking stopped");
    }

    void start(int _val, char _power){
        time = _val;
        stop = false;
        power = _power;
        System.out.println("Cooking for " +time+" seconds at level " + power);
    }
}
