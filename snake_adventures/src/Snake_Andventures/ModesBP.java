package Snake_Andventures;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ModesBP extends JPanel implements ActionListener{
	public static ModesBP MBP;
	public static Snake1 snake;
	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;
	public int FPS;
	public JButton Easy;
	public JButton Medium;
	public JButton Hard;
	public JButton Deadly;
	
		public ModesBP() {
			
			Easy = new JButton("Easy");
			Medium = new JButton("Medium");
			Hard = new JButton("Hard");
			Deadly = new JButton("Deadly");

			Easy.addActionListener(this);
			Medium.addActionListener(this);
			Hard.addActionListener(this);
			Deadly.addActionListener(this);

			setLayout(new FlowLayout());
			setPreferredSize(new Dimension(WIDTH, HEIGHT));
			setLocation(50,50);
			setLayout(new GridLayout(2, 6));

			Easy.setFont (Easy.getFont ().deriveFont (64.0f));
			
			add(Easy);
			
			Medium.setFont (Medium.getFont ().deriveFont (64.0f));
			
			add(Medium);
			
			Hard.setFont (Hard.getFont ().deriveFont (54.0f));
			
			add(Hard);
			
			Deadly.setFont (Deadly.getFont ().deriveFont (64.0f));
			
			add(Deadly);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == Easy) {
				snake = new Snake1();
				Modes.jframeM.setVisible(false);
				
		    }

			else if(source == Medium) {
				snake = new Snake1();
				Modes.jframeM.setVisible(false);
			
			}
			else if(source == Hard) {
				snake = new Snake1();
				Modes.jframeM.setVisible(false);
	
			}
			else if(source == Deadly) {
				snake = new Snake1();
				Modes.jframeM.setVisible(false);

			}
		}

}
