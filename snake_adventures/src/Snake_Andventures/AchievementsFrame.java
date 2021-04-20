package Snake_Andventures;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class AchievementsFrame {
	Snake1 snake = Snake1.snake;

	public static JFrame jframeA;
	
	public static AchievementsFrame AF;
	
    public static Dimension dimA;
	
	Achievements achiev = Achievements.achiev;
	
	RenderForAchievements RFA = new RenderForAchievements();
public AchievementsFrame() {
	AchievementWindow();
	RFA = new RenderForAchievements();
	
	
}
	
	
	
	public void AchievementWindow() {
		jframeA = new JFrame(Snake1.NameOfAchievement);
	     dimA = new Dimension();
	     dimA = Toolkit.getDefaultToolkit().getScreenSize();
	     jframeA.setSize(400, 200);
	     jframeA.setResizable(false);
	     jframeA.add(achiev = new Achievements());
	     jframeA.setLocation(dimA.width / 2 - jframeA.getWidth() / 2, dimA.height / 2 - jframeA.getHeight() / 2);
	     jframeA.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}