import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public abstract class Vehicle {
	
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	private Color color;
	
	private int direction;
	
	
	public Vehicle(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.direction = 1; // Cars initially move right
		this.height = 30;
		this.width = 60;
		this.color = Color.MAGENTA;
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
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static int getInitialWidth() {
		return 60;
	}

	public static int getInitialHeight() {
		return 30;
	}
	public void translate(int deltax, int deltay) {
		xPos += deltax;
		yPos += deltay;
	}
	
	public abstract void draw(Graphics g);

}
