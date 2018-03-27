import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class RaceStage extends JComponent {

	private Random rand;

	private Car topLeftCar;
	
	private Car[] cars;
	private Car bottomRightCar;
	private Car randomCar;	
	private int numCars = 8;

	public RaceStage() {
		rand = new Random();
		topLeftCar = new Car(0,0);
		cars = new Car[numCars];
		int nextY = 0;
		for(int i=0; i<numCars; i++) {
			cars[i] = new Car(0, nextY);
			nextY += 40;
		}
		//randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));	
	}
	
	public boolean reachedRightEdge(Car c) {
		return(c.getxPos()+60 >= this.getWidth());
	}
	
	public boolean reachedLeftEdge(Car c) {
		return(c.getxPos()<=0);
	}

	public void paintComponent(Graphics g) {
		if (this.reachedRightEdge(topLeftCar)) {
			topLeftCar.setDirection(-1);
		}
		if (this.reachedLeftEdge(topLeftCar)) {
			topLeftCar.setDirection(1);
		}
		int pixelsToMove = 5;
		topLeftCar.translate(pixelsToMove*topLeftCar.getDirection(), 0);
		
		randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));
		bottomRightCar = new Car(this.getWidth()-60, this.getHeight()-30);

		for (int i=0; i<numCars; i++) {
			cars[i].draw(g);
		}
		
		//randomCar.draw(g);
		topLeftCar.draw(g);
		bottomRightCar.draw(g);

	}

}
