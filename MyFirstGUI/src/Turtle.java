import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Turtle implements Raceable {

	private int xPos;
	private int yPos;
	private int height;
	private int width;
	private Color color;
	private int direction;
	
	private Image turtleImage;
	
	public Turtle(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.direction = 1; // Cars initially move right
		this.height = 30;
		this.width = 30;
		
		File turtleFile = new File("images/Turtle.jpg");
		
		try {
			turtleImage = ImageIO.read(turtleFile);
		}
		catch (IOException e) {
			System.out.println("Fatal error loading image");
			System.exit(1);
		}
		
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

	public void translate(int deltax, int deltay) {
		xPos += deltax + 50;
		yPos += deltay;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.drawImage(turtleImage, getxPos(), getyPos(), null);
	}

}
