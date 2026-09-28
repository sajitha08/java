import java.awt.*;
import javax.swing.JFrame;
public class Shapes extends Canvas {
public void paint(Graphics g) {
setBackground(Color.WHITE);
g.drawRect(40, 40, 100, 80);
g.fillRect(150, 40, 100, 80);
g.drawOval(30, 130, 50, 60);
setForeground(Color.RED);
g.fillOval(130, 130, 50, 60);
}
public static void main(String[] args) {
Shapes m = new Shapes();
JFrame f = new JFrame();
f.add(m);
f.setSize(400, 400);
// f.setLayout(null);
f.setVisible(true);
}
}