public class Main {

    public static void main(String[] args) {
        Flood myFlood = new Flood(4,4);
        myFlood.reader(20);
        myFlood.reader(15);
        myFlood.reader(3);
        myFlood.reader(12);
        myFlood.reader(5);
        myFlood.reader(8);
        myFlood.reader(11);
        myFlood.reader(10);
        myFlood.reader(4);
        myFlood.reader(0);
        myFlood.reader(17);
        myFlood.reader(6);
        myFlood.reader(6);
        myFlood.reader(3);
        myFlood.reader(8);
        myFlood.reader(2);

        System.out.println(myFlood.getHighest());
        System.out.println(myFlood.getLowest());
        myFlood.getFloodMap(5);


    }
}
