import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class menu extends JPanel implements ActionListener{
JFrame frame =  new JFrame();

//JLabel lb = new JLabel("JAVA APPLICATION WORLD");
JButton b1 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\notepad.jpg"));
JButton b2 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\calculator.jpg"));
JButton b3 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\Exam System.jpg"));
JButton b4 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\Puzzle Game.jpg"));
JButton b5 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\wct.jpg"));
JButton b6 = new JButton(new ImageIcon("C:\\Users\\mohit\\Desktop\\javamp\\Source Code Generator.jpg"));

menu(){

//lb.setBounds(100,100,70,771);
//lb.setForeground(new Color(204, 51, 51));

//b1.setBounds(100,160,200,40);
//b1.setFocusable(false);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);

frame.setBackground(new Color(204,255,204));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(800,700);
frame.setLayout(new GridLayout(2,3,20,30));
frame.setVisible(true);
frame.setTitle("JAVA APPS");
//frame.add(lb); 
frame.add(b1); frame.add(b2); frame.add(b3); 
frame.add(b4); frame.add(b5); frame.add(b6); frame.add(b6);
validate();
}


public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
editor ed = new editor();
}

if(e.getSource()==b2){
MyCalc c = new MyCalc();
}

if(e.getSource()==b3){
onlinetest ot = new onlinetest("");
}

if(e.getSource()==b4){
puzzle p = new puzzle();
}

if(e.getSource()==b5){
charcount cc = new charcount();
}

if(e.getSource()==b6){
sourcegetter sc = new sourcegetter();
}
}


public static void main(String[] args) {
menu m = new menu();

}}
