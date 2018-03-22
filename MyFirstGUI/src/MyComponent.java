import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	private Random rand;

	private Car topLeftCar;
	private Car bottomRightCar;
	private Car randomCar;	

	public MyComponent() {
		rand = new Random();
		topLeftCar = new Car(0,0);
		//randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));	
	}
	
	public boolean reachedRightEdge(Car c) {
		return(c.getxPos()+60 > this.getWidth());
	}

	public void paintComponent(Graphics g) {
		if (!this.reachedRightEdge(topLeftCar)) {
			topLeftCar.translate(5, 0);
		}
		randomCar = new Car(rand.nextInt(this.getWidth()-60), rand.nextInt(this.getHeight()-30));
		bottomRightCar = new Car(this.getWidth()-60, this.getHeight()-30);

		//randomCar.draw(g);
		topLeftCar.draw(g);
		bottomRightCar.draw(g);

	}

}
