import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class PoliceCar extends Car {
	
	public PoliceCar(int xPos, int yPos) {
		super(xPos,yPos);
	}
	
	// All getters and setters inherited from Car
	
	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		super.draw(g);
		
		Ellipse2D.Double biombo= new Ellipse2D.Double(getxPos()+27, getyPos()-5, 5, 5);
		
		g2.setColor(Color.BLUE);
		g2.fill(biombo);
		
	}
}