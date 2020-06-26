import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class CatchMe extends Applet implements MouseListener
{
	Font f;
	Button by,bn;
	int c,r;
	Random ra;
	public void init() 
	{
		setLayout(null);
		f=new Font("Arial",Font.BOLD,30);
		setFont(f);
		
		ra=new Random();
		c=0;
		r=0;
		
		by=new Button("YES");
		bn=new Button("NO");
		
		bn.addMouseListener(this);
		
		by.setBounds(100,200,100,50);
		bn.setBounds(250,200,100,50);
		add(by);
		add(bn);
		
		
	}
	
	public void paint(Graphics g) 
	{
		g.drawString("Prashant scholar chhe ? ",50,100);
	}

	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse clicked");		
	}

	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse entered");
		//by.setLabel("NO");
				//bn.setVisible(false);
				c=ra.nextInt(800);
				r=ra.nextInt(500);
				bn.setLocation(c,r);
	}

	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse exited");	
	}

	public void mousePressed(MouseEvent me) 
	{
		System.out.println("Mouse Pressed");	
	}

	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released");
	}

}