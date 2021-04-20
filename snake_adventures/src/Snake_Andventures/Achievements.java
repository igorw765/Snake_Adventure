package Snake_Andventures;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Achievements extends JPanel implements ActionListener{
public static Achievements achiev;

Snake1 snake = Snake1.snake;

AchievementsFrame AF = AchievementsFrame.AF;

public Timer timera = new Timer(1000,this);

public static int TT = 0;

public Render renderPanel; 

public static String NameOfAchievement;



public Achievements(){
	TC();
	ATE();
}
public void ATE() {
	if(Snake1.level == 2) {
		AF = new AchievementsFrame();
		timera.start();
		NameOfAchievement = "Earn 10 level";
		AchievementsFrame.jframeA.setVisible(true);
		if(TT==1) {
		timera.restart();
		AchievementsFrame.jframeA.setVisible(false);
		}
	}
	
}
public void TC() {
	TT = 0;
}
public void actionPerformed(ActionEvent arg0){

    renderPanel.repaint();
    TT++;
    }
}
