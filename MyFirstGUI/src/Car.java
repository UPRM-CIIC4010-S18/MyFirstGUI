import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Car {
	
	private int xPos;
	private int yPos;
	
	
	public Car(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public void translate(int deltax, int deltay) {
		xPos += deltax;
		yPos += deltay;
	}
	
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Line2D.Double rearWindow = new Line2D.Double(getxPos()+10,getyPos()+10,getxPos()+20,getyPos()+0);
		Line2D.Double frontWindow = new Line2D.Double(getxPos()+40,getyPos()+0,getxPos()+50,getyPos()+10);
		Line2D.Double roof = new Line2D.Double(getxPos()+20,getyPos()+0,getxPos()+40,getyPos()+0);
		Rectangle body = new Rectangle(getxPos()+0,getyPos()+10,60,10);
		Ellipse2D.Double rearTire= new Ellipse2D.Double(getxPos()+10, getyPos()+20, 10, 10);
		Ellipse2D.Double frontTire= new Ellipse2D.Double(getxPos()+40, getyPos()+20, 10, 10);
		
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(body);
		
	}

}
