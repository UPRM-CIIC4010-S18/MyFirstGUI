import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setSize(800, 600);
		
		mainFrame.setTitle("My First GUI!!!");
		
		MyComponent carComponent = new MyComponent();
		
		mainFrame.add(carComponent);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.setVisible(true);
		
		while(true) {
			mainFrame.repaint();
			
			Thread.sleep(10);
			
		}
	}
	
}
