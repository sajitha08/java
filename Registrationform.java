import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class RegistrationForm extends JFrame implements ActionListener {
private Container c;
private JLabel title, name, age, qualification, add, res;
private JTextField tname, tage, tqualification;
private JTextArea tadd, resadd, tout;
private JCheckBox term;
private JButton sub, reset;

public RegistrationForm () {
setTitle("Registration Form");
setBounds(300, 90, 900, 600);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);
c = getContentPane();
c.setLayout(null);
title = new JLabel("Registration Form");
title.setFont(new Font("Arial", Font.PLAIN, 30));
title.setSize(300, 30);
title.setLocation(300, 30);
c.add(title);
name = new JLabel("Name");
name.setFont(new Font("Arial", Font.PLAIN, 20));
name.setSize(100, 20);
name.setLocation(100, 100);
c.add(name);
tname = new JTextField();
tname.setFont(new Font("Arial", Font.PLAIN, 15));
tname.setSize(190, 20);
tname.setLocation(200, 100);
c.add(tname);
age = new JLabel("Age");
age.setFont(new Font("Arial", Font.PLAIN, 20));
age.setSize(100, 20);
age.setLocation(100, 150);
c.add(age);

tage = new JTextField();
tage.setFont(new Font("Arial", Font.PLAIN, 15));
tage.setSize(150, 20);
tage.setLocation(200, 150);
c.add(tage);
qualification = new JLabel("Qualification");
qualification.setFont(new Font("Arial", Font.PLAIN, 18));
qualification.setSize(100, 20);
qualification.setLocation(100, 200);
c.add(qualification);
tqualification = new JTextField();
tqualification.setFont(new Font("Arial", Font.PLAIN, 15));
tqualification.setSize(200, 60);
tqualification.setLocation(200, 200);
c.add(tqualification);
add = new JLabel("Address");
add.setFont(new Font("Arial", Font.PLAIN, 20));
add.setSize(100, 20);
add.setLocation(100, 300);
c.add(add);
tadd = new JTextArea();
tadd.setFont(new Font("Arial", Font.PLAIN, 15));
tadd.setSize(200, 75);
tadd.setLocation(200, 300);
tadd.setLineWrap(true);
c.add(tadd);
term = new JCheckBox("Accept Terms And Conditions.");
term.setFont(new Font("Arial", Font.PLAIN, 15));
term.setSize(250, 20);
term.setLocation(150, 400);
c.add(term);
sub = new JButton("Submit");
sub.setFont(new Font("Arial", Font.PLAIN, 15));
sub.setSize(100, 20);
sub.setLocation(150, 450);
sub.addActionListener(this);
c.add(sub);
reset = new JButton("Reset");
reset.setFont(new Font("Arial", Font.PLAIN, 15));
reset.setSize(100, 20);

reset.setLocation(270, 450);
reset.addActionListener(this);
c.add(reset);
tout = new JTextArea();
tout.setFont(new Font("Arial", Font.PLAIN, 15));
tout.setSize(300, 400);
tout.setLocation(500, 100);
tout.setLineWrap(true);
tout.setEditable(false);
c.add(tout);
res = new JLabel("");
res.setFont(new Font("Arial", Font.PLAIN, 20));
res.setSize(500, 25);
res.setLocation(100, 500);
c.add(res);
resadd = new JTextArea();
resadd.setFont(new Font("Arial", Font.PLAIN, 15));
resadd.setSize(200, 75);
resadd.setLocation(580, 175);
resadd.setLineWrap(true);
c.add(resadd);
setVisible(true);
}

public void actionPerformed(ActionEvent e) {
if (e.getSource() == sub) {
if (term.isSelected()) {
String data = "Name : "
+ tname.getText() + "\n"
+ "Age : "
+ tage.getText() + "\n"
+ "Qualification : "
+ tqualification.getText() + "\n";
String data3 = "Address : " + tadd.getText();
tout.setText(data + data3);
tout.setEditable(false);
res.setText("Registration Successfully..");
} else {
tout.setText("");
resadd.setText("");

res.setText("Please accept the"
+ " terms & conditions..");

}
}
else if (e.getSource() == reset) {
String def = "";
tname.setText(def);
tqualification.setText(def);
tadd.setText(def);
tage.setText(def);
res.setText(def);
tout.setText(def);
term.setSelected(false);
resadd.setText(def);
}
}

public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new RegistrationForm ();
});
}
}