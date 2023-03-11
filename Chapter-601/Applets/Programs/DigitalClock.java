import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  

/*
 <html>  
<body>  
<applet code="DigitalClock.class" width="300" height="300">  
</applet>  
</body>  
</html> 
  
 */
  
public class DigitalClock extends Applet implements Runnable {  
  
   Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
  
   public void init() {  
      setBackground( Color.green);  
   }  
  
   public void start() {  
        t = new Thread( this );  
        t.start();  
   }  
  
    
   public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
    
  public void paint( Graphics g ) {  
      g.setColor( Color.BLACK);
      g.setFont(new Font("Forte",Font.PLAIN,50));
      g.drawString( timeString, 800, 500 );  
   }  
}  