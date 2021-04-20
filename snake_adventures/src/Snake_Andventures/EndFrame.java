package Snake_Andventures;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EndFrame extends JPanel{
	Snake1 snake = Snake1.snake;
	public static EndFrame EF;
EndFramePanel EFP = EndFramePanel.EFP;
	public static JFrame jframeEnd;

	
	public EndFrame() {
		EndFrameWindow();
		EFP.EndFramePanel();	
	}
	public void EndFrameWindow() {
		jframeEnd = new JFrame("DO YOU WANT TO QUIT ?");
	     snake.dim = new Dimension();
	     jframeEnd.setVisible(true);
	     snake.dim = Toolkit.getDefaultToolkit().getScreenSize();
	     jframeEnd.setSize(400, 200);
	     jframeEnd.setResizable(false);
	     jframeEnd.add(EFP = new EndFramePanel());
	     jframeEnd.setLocation(snake.dim.width / 2 - jframeEnd.getWidth() / 2, snake.dim.height / 2 - jframeEnd.getHeight() / 2);
	     jframeEnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}