import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Menu extends Entity{

	Player player;
	public static BufferedImage pb;
	public static BufferedImage qb;
	public static BufferedImage rb;
	public static BufferedImage mb;
	public static BufferedImage hb;
	public static BufferedImage sb;
	public static BufferedImage ub;
	Loader loader = new Loader();

	public Menu(Player p){
		player = p;
	}
	
	public void init(){
		pb = loader.loadImage("InfinityPlayButton.png");
		qb = loader.loadImage("InfinityQuitButton.png");
		rb = loader.loadImage("InfinityRestartButton.png");
		mb = loader.loadImage("InfinityMenuButton.png");
		hb = loader.loadImage("InfinityHowToPlay.png");
		sb = loader.loadImage("AngelsPauseButton.png");
		ub = loader.loadImage("AngelsUnpauseButton.png");
	}

	public void update(){
	}

	public void draw(Graphics2D g){
		if(Angels.inMenu == true && Angels.inHowto == false){
			g.drawImage(pb, null, Window.width/3, Window.height/3);
			g.drawImage(qb, null, Window.width/3, Window.height/2);
			g.drawImage(hb, null, Window.width/3, Window.height - (Window.height/4));
		}
		else if(Angels.inMenu == false && player.isAlive() == false){
			g.drawImage(rb, null, Window.width/3, Window.height/3);

			g.setColor(Color.cyan);
			g.setFont(new Font("Serif", Font.PLAIN, 100));
			g.drawString("GAME OVER", 100, 100);
			
			g.setColor(Color.red);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Score: " + player.score, 300, 400);
		}
		/*else if(Angels.inMenu == false && player.isAlive() == true && Angels.paused == false){
			g.drawImage(ub, null, 0 - 10, 0);
		}
		else if(Angels.inMenu == false && player.isAlive() == true && Angels.paused == true){
			g.drawImage(sb, null, 0 - 12, 0 + 2);
		}*/
		else if(Angels.inHowto == true){
			g.setColor(Color.white);
			g.setFont(new Font("Serif", Font.PLAIN, 30));
			g.drawString("Use the arrow keys or wasd to move", Window.width/4, 100);
			g.drawString("Dont let the player touch the ghosts", Window.width/4, 200);
			g.drawString("Press SPACE to swing your sword", Window.width/4 + 10, 150);
			g.drawString("Swing your sword and hit a ghost to get a point", Window.width/6, 250);
			g.drawString("Press P to pause the game", Window.width/3, 300);
			g.drawImage(mb, null, Window.width/3, Window.height - (Window.height/3));
		}
	}

}
