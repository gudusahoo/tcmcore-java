import java.awt.*;
public class LabelTest extends java.applet.Applet
{
public void init()
{
setFont(new Font("roman",Font.BOLD,14));
Label lblLeft=new Label("alingned left",Label.LEFT);
add(lblLeft);
Label lblCenter=new Label("aligned center",Label.CENTER);
add(lblCenter);
Label lblRight=new Label("aligned Right",Label.RIGHT);
add(lblRight);
}
public static void main(String args[])
{
LabelTest lt=new LabelTest();
}
}
