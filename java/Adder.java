import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

class Adder extends JFrame implements ActionListener
{
 JTextField txt1,txt2,txt3;
 JButton btn;
 static ResourceBundle bundle;
 public Adder()
{
 setLayout(new FlowLayout());
 add(new JLabel(bundle.getString("lbl1")));
 add(txt1=new JTextField(20));
 add(new JLabel(bundle.getString("lbl2")));
 add(txt2=new JTextField(20));
 add(new JLabel(bundle.getString("lbl3")));
 add(txt3=new JTextField(20));
 add(btn=new JButton(bundle.getString("btn")));
 //current object is registered with the button to recive the notification of click event
 btn.addActionListener(this);
 //third textfield is disabled
 txt3.setEditable(false);
  //size and title of the frame are set
  setSize(235,300);
  setTitle("Adder");
  //close action is performed and frame is disabled.
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  }
//to process the click of button
public void actionPerformed(ActionEvent e)
{
//two nubers are obtained 
double a=Double.parseDouble(txt1.getText());
double b=Double.parseDouble(txt2.getText());
//sum is calculated
double c=a+b;
//result is displayed on the third textfield
txt3.setText(Double.toString(c));
}
public static void main(String arr[])
{
if(arr.length==0)
{
System.out.println("Usage:java adder lang code");
System.exit(0);
}
//locale object is created using the lang code
Locale locale=new Locale(arr[0]);
//resourcebundle object is obtained
 bundle=ResourceBundle.getBundle("Adder",locale);
//adder object is created
Adder frame=new Adder();
}
}

