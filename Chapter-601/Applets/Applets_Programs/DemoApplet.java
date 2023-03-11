import java.awt.*;
import java.applet.*;
public class DemoApplet extends Applet
{
	String msg="";
	public void init()
	{
		msg="Hello SaiMedha Students";
    setBackground(Color.BLACK);
    setForeground(Color.GREEN);
	}

	public void start()
	{
		msg=msg+",Welcome to Applets Session";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
	
}
/*
<applet code="DemoApplet" width=300 height=100>
</applet>
*/
