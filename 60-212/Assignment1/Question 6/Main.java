/* Teo Mastronardi
   104203268
   Question 6
*/
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Main {

    public static void main(String[] args) {
      //Problem 6
      //Part 1:
      Line line = new Line(5,10,20,35);
      line.setEndX(10);
      line.setEndY(15);
      System.out.println(line.getEndX());
      //Part 2:
      Ellipse2D.Double ellipse = new Ellipse2D.Double(5,15,50,30);
      System.out.println("Ellipse's X expected value: 5");
      System.out.println("Ellipse's Y expected value: 15" );
      System.out.println("Ellipse's X actual value: "+ellipse.getX());
      System.out.println("Ellipse's Y actual value: "+ellipse.getY());
    }
}
