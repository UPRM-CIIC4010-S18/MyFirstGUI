import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Truck extends Vehicle {	
	
	public Truck(int xPos, int yPos) {
		super(xPos, yPos);
	}

	public static int getInitialWidth() {
		return 60;
	}

	public static int getInitialHeight() {
		return 30;
	}
	
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Line2D.Double rearWindow = new Line2D.Double(getxPos()+10,getyPos()+10,getxPos()+20,getyPos()+0);
		Line2D.Double frontWindow = new Line2D.Double(getxPos()+40,getyPos()+0,getxPos()+50,getyPos()+10);
		Line2D.Double roof = new Line2D.Double(getxPos()+20,getyPos()+0,getxPos()+40,getyPos()+0);
		Rectangle body = new Rectangle(getxPos()+0,getyPos()+10,60,10);
		Ellipse2D.Double rearTire= new Ellipse2D.Double(getxPos()+10, getyPos()+20, 10, 10);
		Ellipse2D.Double frontTire= new Ellipse2D.Double(getxPos()+40, getyPos()+20, 10, 10);
		Rectangle cargo = new Rectangle(getxPos()+0,getyPos()-10,40,20);
		
		g2.setColor(Color.BLACK);
		g2.fill(cargo);
		g2.draw(frontWindow);
		g2.fill(frontTire);
		g2.fill(rearTire);
		g2.setColor(this.getColor());
		//g2.draw(roof);
		g2.draw(body);
		
	}

}
