/**
 * 		PADDLE CLASS
 * 
 * 	Has a private int for lives left for the player
 * 			Move Left, Move Right methods	
 * 					-Moves our collision rectangle as the player is moved across the screen
 * Over loaded constructor used for the images
 * 
 * has getter/setter for the lives so Game Manager can interact with this when the ball is beyond the reach of the paddle object
 * 
 * @author Chris
 * 
 * 
 */


import java.awt.Image;


public class Paddle extends GameObject{

	private int lives = 3;
	

	
	//default no argument constructor
	public Paddle()
	{
		super();
		xPos = 0;
		yPos = GameManager.HEIGHT - 100;
		
	}
	
	//overloaded constructor
	public Paddle(Image pImage)
	{
		super (pImage);
		xPos = 0;
		yPos = GameManager.HEIGHT - 100;
		
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
		
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	
}