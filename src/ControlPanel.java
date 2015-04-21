import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ControlPanel extends JPanel {
	
	protected JButton startButton;
	protected JButton stopButton;
	
	public ControlPanel()
	{		
		this.setBackground(Color.GRAY);
		
		startButton = new JButton("Start");
		stopButton = new JButton("Exit");
		
		this.add(startButton);
		this.add(stopButton);
		
	}
	
	

}
