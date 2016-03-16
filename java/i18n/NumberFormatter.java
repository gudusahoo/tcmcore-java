import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

class NumberFormatter extends JFrame implements ActionListener
{
JTextField txt1,txt2,txt3,txt4;
JButton btn1,btn2;
public NumberFormatter()
{
 setLayout(new FlowLayout());
  add(new JLabel("Languae code"));
  add(txt1=new JTextField(20));
  add(new JLabel("Country code"));
  add(txt2=new JTextField(20));
  add(new JLabel("Number:"));
  add(txt3=new JTextField(20));
  add(new JLabel("Formatted:"));
  add(txt4=new JTextField(20));

  add(btn1=new JButton("Number Formatting"));
  add(btn2=new JButton("Currency Formatting"));

  //current button is registered with the buttons to recive the notification of click event

  btn1.addActionListener(this);
  btn2.addActionListener(this);
  //fourth text field is disabled
  txt4.setEditable(false);
  //size and format of the title are set
  setSize(235,300);
  setTitle("Number Fomatter");
  //clode action is specified and frame is dispalyed
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
}

//to process the click of button
public void actionPerformed(ActionEvent e)
{
//locale object is created using the lang & country code
Locale loc=new Locale(txt1.getText(),txt2.getText());
//Number to be formatted is obtained from the third text field
Double d=Double.parseDouble(txt3.getText());
NumberFormat nf;
if(e.getSource()==btn1)
{
nf=NumberFormat.getNumberInstance(loc);
}
else{
nf=NumberFormat.getCurrencyInstance(loc);
}
txt4.setText(nf.format(d));
}

public static void main(String args[])
{
new NumberFormatter();
}
}
