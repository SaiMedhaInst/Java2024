
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
 <applet code = "ScrollBarRGB" height=300 width=400> </applet> 
 */
public class ScrollBarRGB extends Applet implements AdjustmentListener{
  Scrollbar r , g , b;
  
  public void init(){
    Panel p = new Panel();
    p.setLayout(new GridLayout(3,1));
    setLayout(new BorderLayout());
     r = new Scrollbar(0,1,20,1,275);

    g= new Scrollbar(0,1,20,1,275);

     b = new Scrollbar(0,1,20,1,275);

    p.add(r);p.add(g);p.add(b);

    add(p,"North");
    r.addAdjustmentListener(this);
    g.addAdjustmentListener(this);
    b.addAdjustmentListener(this);
  }

  public void adjustmentValueChanged(AdjustmentEvent e){

    int cr,cg,cb;
    cr = r.getValue();
    cg = g.getValue();
    cb = b.getValue();

    showStatus("Color is --->r="+cr+",g="+cg+",b="+cb);
    setBackground(new Color(cr,cg,cb));

  }
  
}
