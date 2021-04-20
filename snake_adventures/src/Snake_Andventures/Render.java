package Snake_Andventures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
 
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class Render extends JPanel
{
 
    public static final Color GREEN = new Color(1666073);
    public static final Color BLACK = new Color(000);
    public static final Color DARKGREEN = new Color(01000);
    public static final Color PURPLE = new Color(1280128);
    public static final Color MEDIUMSLATEBLUE = new Color(123104238);
    public static final Color GOLD = new Color(2552150);
    public static final Color OLIVE = new Color(1281280);
    public static final Color SILVER = new Color(192192192);
    public static final Color BLUE = new Color(00255);
    public static final Color CYAN = new Color(0255255);
    public static final Color WHITE = new Color(255255255);
 
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       
        Snake1 snake = Snake1.snake;
        
        if(Snake1.level>0 && Snake1.level<5) {
        	g.setColor(GREEN);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>4 && Snake1.level<10) {
        	g.setColor(SILVER);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>9 && Snake1.level<15) {
        	g.setColor(BLACK);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>14 && Snake1.level<20) {
        	g.setColor(PURPLE);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>19 && Snake1.level<25) {
        	g.setColor(GREEN);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>24 && Snake1.level<30){
        	g.setColor(SILVER);
        	g.fillRect(0, 0, 800, 700);
        } else if(Snake1.level>29 && Snake1.level<35){
        	g.setColor(BLACK);
        	g.fillRect(0, 0, 800, 700);
        } else if(Snake1.level>34 && Snake1.level<40){
        	g.setColor(PURPLE);
        	g.fillRect(0, 0, 800, 700);
        }else if(Snake1.level>39){
        	g.setColor(GREEN);
        	g.fillRect(0, 0, 800, 700);
        }
        
        if(Snake1.level>0 && Snake1.level<5) {
        	g.setColor(BLUE);
        
        }else if(Snake1.level>4 && Snake1.level<10) {
        	g.setColor(GREEN);
        	
        }else if(Snake1.level>9 && Snake1.level<15) {
        	g.setColor(SILVER);
        	
        }else if(Snake1.level>14 && Snake1.level<20) {
        	g.setColor(BLACK);
        	
        }else if(Snake1.level>19 && Snake1.level<25) {
        	g.setColor(BLUE);
        	
        }else if(Snake1.level>24 && Snake1.level<30){
        	g.setColor(GREEN);
        	
        }else if(Snake1.level>29 && Snake1.level<35) {
        	g.setColor(SILVER);
        	
        }else if(Snake1.level>34 && Snake1.level<40) {
        	g.setColor(BLACK);
        	
        }else if(Snake1.level>39) {
        	g.setColor(BLUE);
        }
        
        for (Point point : Snake1.snakeParts)
        {
            g.fillRect(point.x * Snake1.SCALE, point.y * Snake1.SCALE, Snake1.SCALE, Snake1.SCALE);
        }
        
        
       
        if(Snake1.score == 110 && Snake1.level == 4 || Snake1.score == 260 && Snake1.level == 9 || Snake1.score == 410 && Snake1.level == 14 || Snake1.score == 560 && Snake1.level == 19 || Snake1.score == 710 && Snake1.level == 24 || Snake1.score == 860 && Snake1.level == 29    ) {
        	g.fillRect(snake.cherry.x * Snake1.SCALE, snake.cherry.y * Snake1.SCALE, Snake1.SCALE, Snake1.SCALE);
        g.setColor(Color.BLUE);
  
        }else {
        	g.fillRect(Snake1.cherry.x * Snake1.SCALE, Snake1.cherry.y * Snake1.SCALE, Snake1.SCALE, Snake1.SCALE);
             g.setColor(Color.RED);
 
        }
        g.fillRect(Snake1.cherry.x * Snake1.SCALE, Snake1.cherry.y * Snake1.SCALE, Snake1.SCALE, Snake1.SCALE);
       
        String Label = "Score: " + Snake1.score + ", Length: " + Snake1.tailLength +", LEVEL: " +Snake1.level +"   , Hours: " +Snake1.timeh+ ", Minutes: "+Snake1.timem+", Secounds: " + Snake1.time/27;
       
        g.setColor(Color.white);
       
        g.drawString(Label, (int) (getWidth() / 2 - Label.length() * 2.5f), 10);
 
        Label = "Game Over!         Press space";
 
        if (Snake1.over)
        {
          g.drawString(Label, (int) (getWidth() / 2 - Label.length() * 2.5f), (int) Snake1.dim.getHeight() / 4);
        }
 
        Label= "Paused!";
 
        if (Snake1.paused && !Snake1.over)
        {
            g.drawString(Label, (int) (getWidth() / 2 - Label.length() * 2.5f), (int) Snake1.dim.getHeight() / 4);
        }
    }
}