/* Teo Mastronardi
   104203268
   Question 2
*/
import javax.swing.*;
import java.net.URL;
import javax.swing.ImageIcon;

public class Main {
// Question 2
    public static void main(String[] args) throws Exception{
        URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/commons/2/2c/Rotating_earth_%28large%29.gif");
        JOptionPane.showMessageDialog(null,"Howdy!", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
