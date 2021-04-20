package Snake_Andventures;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class NickWriter extends JFrame implements KeyListener{

	public JFrame jframeNW;
	
	Snake1 snake = Snake1.snake;
	Snake1 S = new Snake1();


		private int counter = 0;
		private String userInput = "";
		private final String DiffultNick = "Megawonsz9";

		public NickWriter() {
			
			EndNick();
			
		}
		public void EndNick() {
			jframeNW = new JFrame("Snake Adventures");
		     snake.dim = new Dimension();
		     jframeNW.setVisible(true);
		     snake.dim = Toolkit.getDefaultToolkit().getScreenSize();
		     jframeNW.setSize(805, 700);
		     jframeNW.setResizable(false);
		     jframeNW.setLocation(snake.dim.width / 2 - jframeNW.getWidth() / 2, snake.dim.height / 2 - jframeNW.getHeight() / 2);
		     jframeNW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void TextField() {
			JTextField nickField = new JTextField("Enter your Nick name");
			
			String nick = nickField.getText();
		}
		

		@Override
		public void keyPressed(KeyEvent evt) {
		}
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			
		}

}
