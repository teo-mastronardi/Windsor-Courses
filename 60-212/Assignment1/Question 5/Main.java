/* Teo Mastronardi
   104203268
   Question 5
*/
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Main {

    public static void main(String[] args) {
          // Problem 5, Part 1
          Rectangle rect1 = new Rectangle(20,50,15,20);
          Rectangle rect2 = new Rectangle(60,30,15,20);

          // Tests:
          System.out.println("Rectangle 1's fields:");
          System.out.println("X-value Expected: 20  Output: "+rect1.getX());
          System.out.println("Y-value Expected: 50  Output: "+rect1.getY());
          System.out.println("Width Expected: 15  Output: "+rect1.getWidth());
          System.out.println("Height Expected: 20  Output: "+rect1.getHeight());

          //Part 2: move left 10, 5 down
          rect1.translate(-10,-5);

          //Tests:
          System.out.println("Rectangle 1's expected position: (10,45)");
          System.out.println("Rectangle 1's new Outputted position: ("+rect1.getX()+","+rect1.getY()+")");


          //Part 3: change width to half, double its hight
          rect1.setRect(rect1.getX(),rect1.getY(),rect1.getWidth()/2,rect1.getHeight()*2);
          // Tests:
          System.out.println("Rectangle 1's expected width: 7.5");
          System.out.println("Rectangle 1's new Outputted width: "+rect1.getWidth());

          System.out.println("Rectangle 1's expected height: 40");
          System.out.println("Rectangle 1's new outputted height: "+rect1.getHeight());

    }
}
