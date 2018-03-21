/*
    Teo Mastronardi
    Assignment 2 Question 1
 */

public class Main {

    public static void main(String[] args) {
        Microwave m1 = new Microwave();
        m1.start(20, 'H');
        m1.stop();
        m1.reset();
        m1.start(10, 'M');
        m1.reset();
        m1.start(67, 'M');
    }
}
