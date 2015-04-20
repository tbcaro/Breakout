import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ControlPanel extends JPanel {
	
	private JButton startButton;
	private JButton exitButton;
	
	public ControlPanel()
	{		
		this.setBackground(Color.GRAY);
		
		startButton = new JButton("Start");
		exitButton = new JButton("Exit");
		
		this.add(startButton);
		this.add(exitButton);
		
	}

}
