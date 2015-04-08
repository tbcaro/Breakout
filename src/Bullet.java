import java.awt.Image;


public class Bullet extends GameObject{

	public Bullet(Image pImage)
	{
		super(pImage);
		this.getCollisionRect().x=xPos;
		this.getCollisionRect().y=yPos;
	}
	
	public void move()
	{
		yPos -=2;
		this.getCollisionRect().x=xPos;
		this.getCollisionRect().y=yPos;
		this.getCollisionRect().height = getHeight();
		this.getCollisionRect().width = this.getWidth();
		
	}
	
	public boolean offscreen()
	{
		if (yPos<-5)
		{
			setShouldDraw(false);
			return true;
		}
		return false;
	}
}
