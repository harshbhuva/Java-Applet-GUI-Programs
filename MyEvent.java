import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MyEvent extends Applet implements MouseListener,MouseMotionListener
{
	String msg;
	Font f;
	int x,y;
	
	public void init()
	{
		x=0;
		y=0;
		f=new Font("Arial",Font.BOLD,25);
		setFont(f);
		addMouseListener((MouseListener) this);
		addMouseMotionListener((MouseMotionListener) this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,400,400);
	}

	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Dragged "+x+" : "+y;
		repaint();
		
	}

	public void mouseMoved(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		msg="Mouse Moved "+x+" : "+y;
		repaint();
	}

	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Clicked "+x+" : "+y;
		repaint();
	}

	public void mouseEntered(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		msg="Mouse Entered "+x+" : "+y;
		repaint();
		
	}

	public void mouseExited(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		msg="Mouse Exited "+x+" : "+y;
		repaint();
		
	}

	public void mousePressed(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		msg="Mouse Pressed "+x+" : "+y;
		repaint();
		
	}

	public void mouseReleased(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		msg="Mouse released"+x+" : "+y;
		repaint();
		
	}

}
