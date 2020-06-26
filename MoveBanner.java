import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

//write a program to move banner between two borders. 
public class MoveBanner extends Applet implements Runnable
{
	Thread th;
	
	Font f;
	int c;
	
	public void init()
	{
		th=new Thread(this);
		c=1;
		f=new Font("Arial",Font.BOLD,30);
		setFont(f);
		th.start();
	}
	
	public void run()
	{
		while(c<=900)
		{
			c++;
			try { Thread.sleep(5); }
		
			catch(Exception e) {}
			if(c>=900)
			{
				c=-200;
			}
			repaint();
		}	
	}
	public void paint(Graphics g)
	{
		g.drawString("Compact",c, 200);
	}
	
}
