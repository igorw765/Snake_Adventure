package Snake_Andventures;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Modes extends JPanel{
	Snake1 snake = Snake1.snake;
public static Modes modes;
	public static JFrame jframeM;
	ModesBP MBP = new ModesBP() ;
	public Modes() {
		ModesScreen();
		MBP = new ModesBP();
	}
	
	public void ModesScreen(){
		jframeM = new JFrame("Snake Adventures");
	     snake.dim = new Dimension();
	     jframeM.setVisible(true);
	     snake.dim = Toolkit.getDefaultToolkit().getScreenSize();
	     jframeM.setSize(805, 700);
	     jframeM.setResizable(false);
	     jframeM.add(MBP = new ModesBP());
	     jframeM.setLocation(snake.dim.width / 2 - jframeM.getWidth() / 2, snake.dim.height / 2 - jframeM.getHeight() / 2);
	     jframeM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
