import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;


public class Enemy extends GameObject{

	private Random generator;
	
	public Enemy()
	{
		
		
	}
	
	public Enemy(Image pImage)
	{
		
		
		
	}
	
	public void move()
	{
		
		
	}
	
	public boolean offscreen()
	{
		if (yPos>SimpleGame.HEIGHT+100)
		{
			this.setShouldDraw(false);
			return true;
		}
		return false;
	}
	
	public int getPoints()
	{
		return 0;
	}
	
	
	
}
