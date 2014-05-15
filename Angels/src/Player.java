import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Player extends Entity{

	Ghost ghost;
	private BufferedImage pi;
	Loader loader = new Loader();

	public void init(){
		width = 192;
		height = 192;
		//collWidth = 112;
		collWidth = 80;
		//collHeight = 120;
		collHeight = 90;
		//collOffsetX = 25;
		collOffsetX = 50;
		//collOffsetY = 35;
		collOffsetY = 50;
		movespeed = 4;
		maxspeed = 10;
		stopspeed = 3;
		controllable = true;
		gravity = true;
		alive = true;
		score = 0;

		ghost = new Ghost();
	}

	public void jump(){

		if(!Angels.paused){
			xa++;
			ya++;
		}

		if(gravity){
			if(!(up)){
				y+=3;
			}
		}

		if(up){
			movespeed++;
			if(movespeed >= maxspeed){
				movespeed = maxspeed;
			}
		}
		else{
			movespeed-=stopspeed;
		}

		if(movespeed <= 0){
			movespeed = 0;
		}
	}

	public void update(){
		jump();

		if(alive == true && isAttacking() == false){
			pi = loader.loadImage("vy.png");
		}
		else{
			pi = loader.loadImage("vyswing.png");
		}
		if(alive == false){
			pi = loader.loadImage("vywhite.png");
			//pi = loader.loadImage("vyred.png");
			//pi = null;
		}

		if(controllable){
			if(up && (y >= -27)){
				y-=10;
				//if(movespeed >= maxspeed){
				//up = false;
				//}
			}
			if(y >= Window.height - height + 37){
				y-=3;
			}
			if(left && (x >= -22)){
				x-=5;
			}
			if(right && (x <= Window.width - width + 12)){
				x+=5;
			}
			if(down && (y <= Window.height - height + 25)){
				y+=5;
			}
		}
		/*//Bottom
		if(y >= Window.height - height + 25){
			controllable = false;
		}
		//Top
		if(y <= 0){
			controllable = false;
		}*/
	}

	public void draw(Graphics2D g){

		//g.setColor(Color.black);
		//g.fillRect(x, y, width, height);

		g.drawImage(pi, x, y, width, height, null);
		super.draw(g);
		if(Angels.inMenu == false){
			g.setColor(Color.black);
			g.setFont(new Font("Serif", Font.PLAIN, 16));
			g.drawString("Score: " + score, 10, 550);
			
			g.setColor(Color.black);
			g.setFont(new Font("Serif", Font.PLAIN, 16));
			g.drawString("Score: " + score, 10, 550);
		}
	}
}
