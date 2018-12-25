import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class hello extends JApplet {
    public void paint(Graphics g){
        //g.drawString("hello world!!", 200, 100);
        JOptionPane.showMessageDialog(null,"Hello World!!");
    }
}
