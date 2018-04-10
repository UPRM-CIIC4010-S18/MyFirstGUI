import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class RaceStage extends JComponent {

	private Random rand;

	//private Car topLeftCar;

	private Car[] cars;
	//	private Car bottomRightCar;
	//	private Car randomCar;	
	private int numCars;

	public RaceStage() {
		//randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));	
	}
	public void initStage() {
		numCars = this.getHeight() / (Car.getInitialHeight() + 10);
		//numCars = 8;
		rand = new Random();
		//topLeftCar = new Car(0,0);
		cars = new Car[numCars];
		int nextY = 0;
		for(int i=0; i<numCars; i++) {
			cars[i] = new Car(0, nextY);
			nextY += 40;
		}

	}

	public boolean reachedRightEdge(Car c) {
		return(c.getxPos()+60 >= this.getWidth());
	}

	public boolean reachedLeftEdge(Car c) {
		return(c.getxPos()<=0);
	}
	
	public boolean someCarWon() {
		for(int i=0; i<numCars; i++) {
			if (this.reachedRightEdge(cars[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int checkWinner() {
		int maxIndex = 0;
		for (int i=1; i < numCars; i++) {
			if (cars[i].getxPos() > cars[maxIndex].getxPos()) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public void paintComponent(Graphics g) {

		for (int i=0; i<numCars; i++) {
			cars[i].draw(g);
			cars[i].translate(rand.nextInt(10), 0);
			cars[i].setColor(Color.MAGENTA);
		}
		
		int leadCarIndex = checkWinner();
		cars[leadCarIndex].setColor(Color.GREEN);

	}

}
