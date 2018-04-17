import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		JFrame mainFrame = new JFrame();

		mainFrame.setSize(800, 600);

		mainFrame.setTitle("My First GUI!!!");

		RaceStage raceStage = new RaceStage();
		
		mainFrame.add(raceStage);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainFrame.setVisible(true);
		
		raceStage.initStage();

		while(!raceStage.someCarWon()) {

			mainFrame.repaint();

			Thread.sleep(50);

		}

	}

}
