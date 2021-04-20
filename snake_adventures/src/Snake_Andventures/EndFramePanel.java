package Snake_Andventures;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EndFramePanel extends JPanel implements ActionListener{

	Snake1 snake = Snake1.snake;
	public static EndFramePanel EFP;
	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;
	public JButton Yes;
	public JButton No;
	public int rows;
	public int cols;
	public int hgap ;
	public int vgap;

	public void EndFramePanel() {
		Yes = new JButton("Yes");
		No = new JButton("No");
		
		Yes.addActionListener(this);
		No.addActionListener(this);
		

		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLocation(50,50);
		
		setLayout(new GridLayout(rows = 2, cols = 2, hgap = 2, vgap = 2));
		Yes.setFont (Yes.getFont ().deriveFont (20.0f));
		add(Yes);
		No.setFont (No.getFont ().deriveFont (20.0f));
		add(No);
}

	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == Yes) {
			System.exit(0);
	    }

		else if(source == No) {
			EndFrame.jframeEnd.setVisible(false);;
		}
	}
}
