package Snake_Andventures;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	static Main main;
	
public static StartScreenB Start;

public static JFrame jframe;

public static Dimension dim;


public Main()
{

}

public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            StartScreenB Start = new StartScreenB();
            AchievementsFrame AF = new AchievementsFrame();
        }
    });
}
}
