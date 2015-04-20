import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 
 * Class: GameManager
 * Author: Travis Caro (TBC)
 * Purpose: 
 * 		- Run as applet and manage the overall game
 * 		
 *		- Will need ScorePanel, GamePanel, ControlPanel
 * 
 */

public class GameManager extends Applet implements Runnable{
	
	private final int WIDTH = 800;
	private final int HEIGHT = 500;
	
	private ScorePanel scorePanel;
	private GamePanel gamePanel;
	private ControlPanel controlPanel;
	
	private Timer timer;
	
	private Player thePlayer;  //Player objects
			
	private Toolkit tk; //toolkit used to load images
	private URL url;  //URL used to load images
	
	private int score;  //Score of the game
	
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		
		this.setLocation(200, 200);
		this.setSize(WIDTH, HEIGHT);
		this.setName("Final App");
		this.setFocusable(true);
		
		this.setLayout(new BorderLayout());
		
		
	}
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
		
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}
	
//	public GameManager()
//	{
//		tk = Toolkit.getDefaultToolkit();
//	
//		//Load the an image to represent the player 
//		
//		
//		//Instantiate a player and pass the image
//		thePlayer= new Player(tk.getImage(url));
//		//Instantiate an "enemy object" or arrays of falling objects
//		
//		
//		//Instantiate timer
//
//
//		//Set focusable to be true so the user doesn't have to click on the screen
//		this.setFocusable(true);
//		//Add the keyboard listener to the class
//		
//		
//		this.setBackground(Color.BLACK);
//	
//		
//	
//	}
	
	//Start the timer object
	public void startTimer()
	{
		timer.start();
	}
	
	
	
	
	//Draw the background, all of the falling objects in the list
	//and all of the bullets that are active in the list
	
	
	
	//Because this is only one thread, I needed the timer to run faster
	//to check for collisions, but I didn't want the objects to move 
	//as fast a second time check was placed in the code
	private class TimerListener implements ActionListener
	{
	
		private int time;
		
		//The listener that triggered when the timer goes off
		public void actionPerformed(ActionEvent arg0) {
		
		
		
		}
	
		
		//Check each falling object against each live bullet
		private void checkCollisions()
		{
	
			

				
				
			
		}
		
		
		//Go through the removeList and remove each object from
		//the falling object array list and the bullet list respectively
		private void removeObjects()
		{
			
		}
		
		//Move all of the falling objects.  Called from the 
		//action listener
		private void moveFallingObjects()
		{
			
		}
		
		//Move the bullets
		private void moveBullets()
		{
			
			
		}
	}

	private class MyKeyListener implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
	
	
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
	
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public void run()
	{
		
	}


}
