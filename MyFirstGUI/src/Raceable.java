import java.awt.Color;
import java.awt.Graphics;

interface Raceable {
	int getxPos();
	void setxPos(int xPos);
	int getyPos();
	void setyPos(int yPos);
	int getDirection();
	void setDirection(int direction);
	int getHeight();
	void setHeight(int height);
	int getWidth();
	void setWidth(int width);
	Color getColor();
	void setColor(Color color);
	void translate(int deltax, int deltay);
	abstract void draw(Graphics g);

//	static int getInitialWidth();
//
//	static int getInitialHeight();
//	

}
