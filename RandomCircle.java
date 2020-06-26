import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomCircle extends Applet implements Runnable
{
	Random ra;
	int c,r,rr,gg,bb;
	Thread th;
	public void init()
	{
		th=new Thread(this);
		
		ra=new Random();
		c=ra.nextInt(1100);
		r=ra.nextInt(750);
		th.start();
		setBackground(Color.black);
	}
	public void run()
	{
		while(true)
		{
			c=ra.nextInt(1100);
			r=ra.nextInt(750);
			rr=ra.nextInt(255);
			gg=ra.nextInt(255);
			bb=ra.nextInt(255);
			repaint();
			try { Thread.sleep(1); }
			catch(Exception e) {}
		}
	}
	
	public void update(Graphics g)
	{
		Color col=new Color(rr,gg,bb);
		g.setColor(col);
		g.fillOval(c,r,10,10);
	}

}
