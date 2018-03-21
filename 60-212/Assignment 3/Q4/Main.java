public class Main {

    public static void main(String[] args)  {
        AirlineSeating plane1 = new AirlineSeating();

        plane1.showSeating();
        plane1.addPassengers('f',1, 'w');
        plane1.showSeating();
        plane1.addPassengers('e',1, 'a');
        plane1.showSeating();
        plane1.addPassengers('e',3, 'a');
        plane1.showSeating();
        plane1.addPassengers('e',2, 'a');
        plane1.showSeating();
    }
}
