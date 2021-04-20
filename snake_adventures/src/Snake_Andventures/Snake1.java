package Snake_Andventures;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Snake1 implements ActionListener, KeyListener
{
 
	public ModesBP MBP;
	
    public static Snake1 snake;
 
    public JFrame jframe;
    
    public AchievementsFrame AF;
    
    public StartScreenB Start;
 
    public Render renderPanel;    
    
	public Timer timer= new Timer(15, this);
	
    public static ArrayList<Point> snakeParts = new ArrayList<Point>();
 
    public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;
 
    public static int ticks = 0, direction = DOWN, score, tailLength = 10, time;
 
    public static Point head, cherry;
 
    public Random random;
    
    static String NickFromK;
 
    public static boolean over = false, paused;
 
    public static Dimension dim;
    
    public static int level;
    
    public int PN;
    
    public static int timem;
    
    public static int timeh;
    
    public int LC;
    
    public int PN1;
    
    public int timeCheck;
    
    public int cherrysEated;
    
    public int frameaCounter;
    
    public int antyCheat;
    
    public static String NameOfAchievement;
    
    public void Achievements() {
    	if(level == 10 && frameaCounter == 1) {
    		NameOfAchievement = "Good for new";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(level == 20 && frameaCounter == 1) {
    		NameOfAchievement = "It's looking better";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(level == 30 && frameaCounter == 1) {
    		NameOfAchievement = "In the middle";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(level == 40 && frameaCounter == 1) {
    		NameOfAchievement = "So close";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(level == 50 && frameaCounter == 1) {
    		NameOfAchievement = "Realy Pro";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(tailLength == 100 && frameaCounter == 1) {
    		NameOfAchievement = "Realy Big !!!";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(cherrysEated == 25 && frameaCounter == 1) {
    		NameOfAchievement = "Hungry Men(eat 25 cherrys)";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}else if(cherrysEated == 50 && frameaCounter == 1) {
    		NameOfAchievement = "Oh My God. He's looking fat(eat 50 cherrys)";
    		AF = new AchievementsFrame();
    		paused = true;
    		AF.jframeA.setVisible(true);
    		frameaCounter = 0;
    	}
    		
  
    		
    }
   
    	
    public void ifNull() {
    	if(AF.jframeA != null) {
    		frameaCounter++;
    	}
    	
    }

    
    
 
    public Snake1()
    {
    	SnakeWindow();
        startGame();
    }
   
    
    public void SnakeWindow() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("Snake Adventures");
        jframe.setVisible(true);
        jframe.setSize(805, 700);
        jframe.setResizable(false);
        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
        jframe.add(renderPanel = new Render());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.addKeyListener(this);
    }
 
    public void startGame()
    {
        over = false;
        paused = false;
        time = 0;
        timem = 0;
        timeh = 0;
        score = 0;
        tailLength = 14;
        level = 1;
        LC = 1;
        PN = 30;
        PN1 = 30;
        ticks = 0;
        timeCheck = 0;
        direction = DOWN;
        head = new Point(0, -1);
        random = new Random();
        snakeParts.clear();
        cherry = new Point(random.nextInt(79), random.nextInt(66));
        cherrysEated = 0;
        antyCheat = 1;
        frameaCounter = 0;
        timer.start();
    }
		
 
    @Override
    public void actionPerformed(ActionEvent arg0)
    {

        renderPanel.repaint();
        ticks++;
        
 
        if (ticks % 2 == 0 && head != null && !over && !paused)
        {
        	timeCheck++;
            time++;
            if(time==60*27) {
            	time = 0;
            	timem++;
            }if(timem == 60 ) {
            	timem = 0;
            	timeh++;
            }
    
    timeCheck = timeCheck*27;
        
            if(score>=PN) {
            	PN=PN+30;
            	level++;
            }
            ifNull();
            Achievements();
            
 
            snakeParts.add(new Point(head.x, head.y));

            if (direction == UP)
            {
                if (head.y - 1 >= 0 && noTailAt(head.x, head.y - 1))
                {
                    head = new Point(head.x, head.y - 1);
                }
                else
                {
                    over = true;
 
                }
            }
 
            if (direction == DOWN)
            {
                if (head.y + 1 < 67 && noTailAt(head.x, head.y + 1))
                {
                    head = new Point(head.x, head.y + 1);
                }
                else
                {
                    over = true;
                }
            }
 
            if (direction == LEFT)
            {
                if (head.x - 1 >= 0 && noTailAt(head.x - 1, head.y))
                {
                    head = new Point(head.x - 1, head.y);
                }
                else
                {
                    over = true;
                }
            }
 
            if (direction == RIGHT)
            {
                if (head.x + 1 < 80 && noTailAt(head.x + 1, head.y))
                {
                    head = new Point(head.x + 1, head.y);
                }
                else
                {
                    over = true;
                }
            }
 }
 
            
            
            if (snakeParts.size() > tailLength)
            {
                snakeParts.remove(0);
 
            }
 
            if (cherry != null)
            {
                if (head.equals(cherry))
                {
                	cherrysEated ++;
                    score += 10;
                    tailLength++;
                    cherry.setLocation(random.nextInt(79), random.nextInt(66));
                }
            }
        }
    
 
    public boolean noTailAt(int x, int y)
    {
        for (Point point : snakeParts)
        {
            if (point.equals(new Point(x, y)))
            {
                return false;
            }
        }
        return true;
    }
 

    @Override
    public void keyPressed(KeyEvent e)
    {
        int i = e.getKeyCode();
        if(paused == false && over == false && timeCheck >= 1) {
        if ((i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) && direction != RIGHT)
        {
            direction = LEFT;
        }
 
        if ((i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT) && direction != LEFT)
        {
            direction = RIGHT;
        }
 
        if ((i == KeyEvent.VK_W || i == KeyEvent.VK_UP) && direction != DOWN)
        {
            direction = UP;
        }
 
        if ((i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN) && direction != UP)
        {
            direction = DOWN;
        }
        }
 
        if (i == KeyEvent.VK_SPACE)
        {
            if (over)
            {
                startGame();
            }
            else
            {
                paused = !paused;
            }
        }
    	
    }
    
    
 
    @Override
    public void keyReleased(KeyEvent e)
    {
    	
    }
    @Override
    public void keyTyped(KeyEvent e){
    	
    	
    }
    }
