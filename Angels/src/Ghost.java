import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Ghost extends Entity{
	//private BufferedImage ei;
	Loader loader = new Loader();
	private BufferedImage ei;
	public static int speed;

	public void init(){
		/*ghost*/
		width = 37*3;
		height = 14*3;
		collWidth = this.width - 30;
		collHeight = this.height;
		movable = true; 
		speed = 2;

		//ei = loader.loadImage("Awesome_Demon.png");
		ei = loader.loadImage("ghost.png");
	}

	public void update(){
		if(movable){
			x-=speed;
		}
	}

	public void draw(Graphics2D g){

		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		g.drawImage(ei, x, y, width, height, null);
		super.draw(g);
	}

}
