package Snake_Andventures;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class StartScreenB extends JPanel{
	Snake1 snake = Snake1.snake;

public static JFrame jframeS;
ButtonsPanel BP = new ButtonsPanel();
EndFramePanel EFP = new EndFramePanel();



		public StartScreenB() {
			
       	 StartScreenWindow();
         BP.ButtonsPanel();	
		}
		
public void StartScreenWindow() {
	jframeS = new JFrame("Snake Adventures");
     snake.dim = new Dimension();
     jframeS.setVisible(true);
     snake.dim = Toolkit.getDefaultToolkit().getScreenSize();
     jframeS.setSize(805, 700);
     jframeS.setResizable(false);
     jframeS.add(BP = new ButtonsPanel());
     jframeS.setLocation(snake.dim.width / 2 - jframeS.getWidth() / 2, snake.dim.height / 2 - jframeS.getHeight() / 2);
     jframeS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


