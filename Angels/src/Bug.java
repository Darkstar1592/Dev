import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Bug extends Entity{
	Loader loader = new Loader();
	private BufferedImage bi;
	public static int speed;

	public void init(){
		/*bug*/
		width = 20*4;
		height = 17*4;
		collWidth = this.width;
		collHeight = this.height - 32;
		collOffsetY = 23;
		movable = true; 
		speed = 3;
		
		bi = loader.loadImage("bug.png");
	}

	public void update(){
		if(movable){
			x-=speed;
		}
	}

	public void draw(Graphics2D g){

		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		g.drawImage(bi, x, y, width, height, null);
		super.draw(g);
	}

}
