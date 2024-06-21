importjava.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;
class MyCanvas extends JComponent {
public void paint(Graphics g)
    {
        // draw and display the line
g.drawLine(30, 20, 80, 90);
    }
}
public class GFG1 {
public static void main(String[] a)
    {
JFrame window = new JFrame();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setBounds(30, 30, 200, 200);
window.getContentPane().add(new MyCanvas());
window.setVisible(true);
    }
}
