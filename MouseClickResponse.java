import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MouseClickResponse extends JFrame {
MouseClickResponse() {
addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
Graphics g = getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX() - 15, e.getY() - 15, 30, 30);
}
});
setSize(300, 400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> new MouseClickResponse());
}
}