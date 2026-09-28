
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class MultiSelectionListBox implements ListSelectionListener {
static JList<String> list;
static JLabel label;
public static void main(String args[]) {
JFrame frame = new JFrame("Multiple Selection List Box");
frame.setSize(500, 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.getContentPane().setBackground(Color.white);
String lang[] = { "C", "C++", "Java", "Python", "R" };
list = new JList<String>(lang);
list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
list.setBounds(150, 150, 150, 150);
frame.add(list);
label = new JLabel("Select items from list");
label.setBounds(0, 0, 500, 50);
frame.add(label);
MultiSelectionListBox obj = new MultiSelectionListBox ();
list.addListSelectionListener(obj);
frame.setVisible(true);
}
public void valueChanged(ListSelectionEvent e) {
int index[] = list.getSelectedIndices();
String str = "";
for (int i = 0; i < index.length; i++)
str = str + list.getModel().getElementAt(index[i]) + ", ";
str = str.replaceAll(", $", "");
label.setText("Items Selected : " + str);
}
}