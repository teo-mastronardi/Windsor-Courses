public class Main {

    public static void main(String[] args) {
        CardValidation card1 = new CardValidation();
        card1.parseString("4012 8888 8888 1881");
        System.out.print("Card is Valid, program should output true: ");
        System.out.println(card1.validate());

        card1.parseString("4111-1111-1111-1113");
        System.out.print("Card is Invalid, program should output false: ");
        System.out.println(card1.validate());


        card1.parseString("4111111111111111");
        System.out.print("Card is Invalid, program should output false: ");
        System.out.println(card1.validate());

        card1.parseString("3782-82-24----6310005");
        System.out.print("Card is Valid, program should output true: ");
        System.out.println(card1.validate());

        card1.parseString("51  051  0510  5105  100");
        System.out.print("Card is Valid, program should output true: ");
        System.out.println(card1.validate());
    }
}
