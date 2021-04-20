package Snake_Andventures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
 
import javax.swing.JPanel;
 
@SuppressWarnings("serial")

public class RenderForAchievements extends JPanel{
	Snake1 snake = Snake1.snake;
    public static final Color BLACK = new Color(000);
    public static final Color WHITE = new Color(255255255);
    public RenderForAchievements RFA;
	@Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        
        g.fillRect(0, 0, 800, 700);
        g.setColor(BLACK);
        
        String Messeges = Achievements.NameOfAchievement;
        
        g.setColor(Color.white);
       
        g.drawString(Messeges, (int) (getWidth() / 2 - Messeges.length() * 2.5f), 10);
  
    }
	

}
