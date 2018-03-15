import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Line2D.Double rearWindow = new Line2D.Double(10,10,20,0);
		Line2D.Double frontWindow = new Line2D.Double(40,0,50,10);
		Line2D.Double roof = new Line2D.Double(20,0,40,0);
		Rectangle body = new Rectangle(0,10,60,10);
		Ellipse2D.Double rearTire= new Ellipse2D.Double(10, 20, 10, 10);
		Ellipse2D.Double frontTire= new Ellipse2D.Double(40, 20, 10, 10);
		
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(body);

	}
	
}
