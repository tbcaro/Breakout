import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;


public class Block extends GameObject{

	private Random generator;
	
	public Block()
	{
		
		
	}
	
	public Block(Image pImage)
	{
		
		
		
	}
	
	public void move()
	{
		
		
	}
	
	public boolean offscreen()
	{
		if (yPos>GameApplet.HEIGHT+100)
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
