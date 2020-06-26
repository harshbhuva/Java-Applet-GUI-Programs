import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindMill extends Applet implements Runnable , ActionListener
{
	Thread th;
	int a;
	boolean b;
	Button b1;
	public void init()
	{
		th=new Thread(this);
		b=false;
		a=60;
		b1=new Button("START");
		b1.setBounds(50,200,120,60);
		b1.addActionListener((ActionListener) this);
		add(b1);
		th.start();
	}
	
	public void run()
	{
		while(true)
		{
			if(b)
			{	
			a+=3;
			repaint();
			}
			try { Thread.sleep(10);  }
			catch(Exception e) {}
			}
		}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		
		if(s.equals("START"))
		{
			b=true;
			b1.setLabel("STOP");
		}
		else
		{
			b=false;
			b1.setLabel("START");
		}
	}
	
	public void paint(Graphics g)
	{
		g.fillRect(300,500,400,50);
		g.fillRect(475,300,50,200);
		g.setColor(Color.orange);
		g.fillArc(400,150,200,300,a,45);

		g.setColor(Color.green);
		g.fillArc(400,150,200,300,a+120,45);

		g.setColor(Color.blue);
		g.fillArc(400,150,200,300,a+240,45);

	}

}
