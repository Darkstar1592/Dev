import java.awt.Graphics2D;


public class Sword extends Entity{

	Player player;
	
	public Sword(Player p){
		player = p;
	}
	
	public void init(){
		width = player.getWidth()/3;
		height = player.getHeight();
		collWidth = player.collWidth - player.collWidth/3 + 5;
		collHeight = player.collHeight - (player.collHeight /3) + 25;
	}
	
	public void update(){
		x = player.x + (player.width/3 + player.width/3 + 10);
		y = player.y + 42;
	}
	
	public void draw(Graphics2D g){
		//g.setColor(Color.gray);
		//g.fillRect(x, y, width, height);
		super.draw(g);
	}
	
}
