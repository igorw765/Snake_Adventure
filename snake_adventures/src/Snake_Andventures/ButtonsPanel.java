package Snake_Andventures;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel implements ActionListener{
	Snake1 snake = Snake1.snake;
	
	Modes modes = Modes.modes;
	
	EndFramePanel EFP = EndFramePanel.EFP;
	
	EndFrame EF = EndFrame.EF;
	
	public static final int HEIGHT = 100;
	
	public static final int WIDTH = 300;
	
	public JButton Start;
	
	public JButton Options;
	
	public JButton Quit;
	
	public JButton Achievements;
	
	public JButton Schop;
	
	public void ButtonsPanel() {
		Start = new JButton("Start");
		
		Options = new JButton("Options");
		
		Quit = new JButton("Quit");
		
		Achievements = new JButton("Achievements");
		
//		Schop = new JButton("Schop");
		
		

		Start.addActionListener(this);
		
		Options.addActionListener(this);
		
		Quit.addActionListener(this);
		
		Achievements.addActionListener(this);
		
//		Schop.addActionListener(this);
		
		

		setLayout(new FlowLayout());
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		setLocation(50,50);
		
		setLayout(new GridLayout(2, 6));
		
		
		

Start.setFont (Start.getFont ().deriveFont (64.0f));

		add(Start);
		
		
		Options.setFont (Options.getFont ().deriveFont (64.0f));
		
		add(Options);
		
		
		Achievements.setFont (Achievements.getFont ().deriveFont (54.0f));
		
		add(Achievements);
		
		
		Quit.setFont (Quit.getFont ().deriveFont (64.0f));
		
		add(Quit);
		
//		Schop.setFont (Schop.getFont ().deriveFont (64.0f));
//		
//		add(Schop);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == Start) {
			modes = new Modes();
			StartScreenB.jframeS.setVisible(false);
	    }

		else if(source == Options) {
			setBackground(Color.BLUE);
		}
		else if(source == Quit) {
			EF = new EndFrame();

		}
		else if(source == Achievements) {
			setBackground(Color.GREEN);
			
		}
//			else if(source == Schop) {
//			setBackground(Color.GREEN);
//		}
	}
}
