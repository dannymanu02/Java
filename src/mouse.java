import java.applet.*;
import  java.awt.*;
import java.awt.event.*;

public class mouse extends Applet implements MouseListener {
    String t;
    int x,y;

    public void init(){
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        t = "mouse clicked";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        t = "mouse pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        t = "mouse released";
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        t = "mouse entered";
        repaint();

    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        t = "mouse exited";
        repaint();

    }

    public void paint(Graphics g){
        g.drawString(t,200,100);
        g.drawRect(200,500,300,450);
        System.out.println(""+x+" " +y);
    }
}
