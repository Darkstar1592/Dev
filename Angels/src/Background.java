import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Background {

	private BufferedImage bg;
	private int x;
	private int y;
	private int movespeed;

	public void init(){
		movespeed = 1;
		
		Loader loader = new Loader();
		bg = loader.loadImage("BG1-2.png");
	}

	public void update(){	
	}

	public void draw(Graphics2D g){
		g.drawImage(bg, getX(), y, Window.width, Window.height, null);
	}

	public void setPosition(int x, int y){
		this.setX(x + movespeed);
		this.y = y + movespeed;
	}

	public void setMovespeed(int movespeed){
		this.movespeed = movespeed;
	}

	public int getMovespeed(){
		return movespeed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
