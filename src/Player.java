//Player object inherits directly from GameObject, not falling object

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Player extends GameObject{

	private final int DEAD = 3;
	private int numPlayerHits;

	//default no argument constructor
	public Player()
	{
		super();
		xPos = 0;
		yPos = SimpleGame.HEIGHT - 100;
		numPlayerHits = 0;
	}
	
	//overloaded constructor
	public Player(Image pImage)
	{
		super (pImage);
		xPos = 0;
		yPos = SimpleGame.HEIGHT - 100;
		numPlayerHits = 0;
	}
	
	//Called from the Game Manager when the player presses the left arrow key
	public void moveLeft()
	{
		xPos-=4;
		this.getCollisionRect().x=xPos;
		this.getCollisionRect().y=yPos;
		this.getCollisionRect().height = getHeight();
		this.getCollisionRect().width = this.getWidth();
	}
	
	//Called from the Game Manger when the player presses the right arrow key
	public void moveRight()
	{
		xPos+=4;
		this.getCollisionRect().x=xPos;
		this.getCollisionRect().y=yPos;
		this.getCollisionRect().height = getHeight();
		this.getCollisionRect().width = this.getWidth();
	}
	
	//Increase the number of times the player has been hit
	public void increaseNumPlayerHits()
	{
		numPlayerHits++;
	}
	
	//Check to see if the player is dead
	public void checkPlayerDead()
	{
		if (numPlayerHits >=DEAD)
		{
			JOptionPane.showMessageDialog(null, "Game Over!");
			System.exit(0);
		}
	}
	
	
}
