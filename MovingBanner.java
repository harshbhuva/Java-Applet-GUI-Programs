import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

//write a program to move banner between two borders. 
public class MovingBanner extends Applet implements Runnable
{
	Thread th;
	
	Font f;
	int c,flag;
	
	public void init()
	{
		th=new Thread(this);
		c=1;
		flag=1;
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
			if(flag==1)
			{
				if(c<=850)
				{
					c+=3;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==0)
			{
				if(c>=1)
				{
					c-=3;
				}
				else
				{
					flag=1;
				}
			}
			repaint();
		}	
	}
	public void paint(Graphics g)
	{
		g.drawString("Vikas gando thayo chhe",c, 200);
	}
	
}
