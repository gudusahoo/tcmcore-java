import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
class DateFormatter extends JFrame implements ActionListener
{
JTextField txt1,txt2,txt3,txt4;
JButton btn;
public DateFormatter()
{
setLayOut(new flowLayOut());
add(new JLabel("language code"));
add(txt1=new JTextField(20));
add(new JLabel("country code"));
add(txt2=new JTextField(20));
add(new JLabel("Formatted Date"));
add(txt3=new JTextField(20));
add(new JLabel("Formatted Time"));
add(txt4=new JTextField(20));
add(new JButton("Apply Formatin"));
//current object is registered with the button
//to recive the notification of click event
btn.addActionListener(this);
//third and fourth textfields are disabled
txt3.setEditable("false");
txt4.setEditable("false");
//size and title of the frame are set
setSize(235,300);
setTitle("Date Formatter");
//close action os specified &frame is displayed.
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

//to process the click button
public void actionPerformed(ActionEvent e)
{
//loacele objectis created using lang and country code
Locale loc=new Locale(txt1.getText(),txt2.getText());
//current date and time is obtained from the System
Date d=new Date();
//Date Format objects are created apply date & time formation
DateFormat df=DateFormat.getDateInstance(DateFormat,Full,loc);
DateFormat tf=DateFormat.getTimeInstance(DateFormat,Full,loc);
//Date and Time are Formatted & displayed in third and fourth text fields
txt3.setText(df.format(d));
txt4.setText(tf.format(d));
}
public static void main(String args[])
{
//frame is created
new DateFormatter();
}
}

