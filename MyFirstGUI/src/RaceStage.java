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

	private Raceable[] cars;
	//	private Car bottomRightCar;
	//	private Car randomCar;	
	private int numCars;
	
	private boolean isInitialized = false;

	public RaceStage() {
		//randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));	
	}
	public void initStage() {
		numCars = this.getHeight() / (Car.getInitialHeight() + 10);
		//numCars = 8;
		rand = new Random();
		//topLeftCar = new Car(0,0);
		cars = new Raceable[numCars];
		int nextY = 0;
		cars[0] = new Turtle(0, nextY);
		nextY += 50;
		for(int i=1; i<numCars; i++) {
			if (i%3 == 0) {
				cars[i] = new Car(0, nextY);
			}
			else if (i%3 == 1) {
				cars[i] = new PoliceCar(0, nextY);
			}
			else {
				cars[i] = new Truck(0, nextY);
			}
			nextY += 50;
		}
		this.isInitialized = true;

	}

	public boolean reachedRightEdge(Raceable c) {
		return(c.getxPos()+60 >= this.getWidth());
	}

	public boolean reachedLeftEdge(Raceable c) {
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

		if (!isInitialized) return;
		
		for (int i=0; i<numCars; i++) {
			if (cars[i] == null) {
				System.out.println("Nul i" + i);
				continue;
			}
			cars[i].draw(g);
			cars[i].translate(rand.nextInt(10), 0);
			cars[i].setColor(Color.MAGENTA);
		}
		
		int leadCarIndex = checkWinner();
		cars[leadCarIndex].setColor(Color.GREEN);

	}

}
