import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=ScrollbarExample height=300 width=400> </applet> */
public class ScrollbarExample extends Applet implements AdjustmentListener
{
Scrollbar r = new Scrollbar(0, 1,20, 1,275);
Scrollbar g = new Scrollbar(0, 1,20, 1,275);
Scrollbar b = new Scrollbar(0, 1,20, 1,275);
Panel p = new Panel();
public void init(){
	p.setLayout(new GridLayout(3, 1));
	setLayout(new BorderLayout());
	p.add(r);
	p.add(g);
	p.add(b);
	add (p, "North");
	r.addAdjustmentListener(this);
	g.addAdjustmentListener(this); 
	b.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent e){
	int cr,cg, cb;
	cr =r.getValue ();
	cg =g.getValue();
	cb =b.getValue();
	showStatus("Color is --> r = "+cr+",g = "+cg+",b = "+cb);
	setBackground(new Color(cr,cg,cb));
}

}