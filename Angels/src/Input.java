import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Input implements KeyListener,MouseListener{

	Player player;
	int swing = 0;
	int maxSwing = 1;


	public Input(Player p){
		player = p;
	}

	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();

		if(player.controllable && player.isAlive() == true){
			if(k == KeyEvent.VK_SPACE){
				player.setAttacking(true);
				swing++;
				if(swing > maxSwing){
					player.setAttacking(false);
				}
				//System.out.println(swing);
			}
		}
		if(player.controllable && player.isAlive() == true){
			if(k == KeyEvent.VK_UP || k == KeyEvent.VK_W){
				player.setUp(true);
			}
			if(k == KeyEvent.VK_DOWN || k == KeyEvent.VK_S){
				player.setDown(true);
			}
			if(k == KeyEvent.VK_LEFT || k == KeyEvent.VK_A){
				player.setLeft(true);
			}
			if(k == KeyEvent.VK_RIGHT || k == KeyEvent.VK_D){
				player.setRight(true);
			}
			if(k == KeyEvent.VK_P && Angels.paused == false){
				Angels.paused = true;
			}
			else if(k == KeyEvent.VK_P && Angels.paused == true){
				Angels.paused = false;
			}
		}
		if(k == KeyEvent.VK_R){
			Angels.restart();
		}
		if(k == KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
		if(k == KeyEvent.VK_H){
			if(!Angels.hitbox){
				Angels.hitbox = true;
			}
			else if(Angels.hitbox){
				Angels.hitbox = false;
			}
		}

	}

	public void keyReleased(KeyEvent e) {
		int k = e.getKeyCode();

		if(k == KeyEvent.VK_UP || k == KeyEvent.VK_W){
			player.setUp(false);
		}
		if(k == KeyEvent.VK_LEFT || k == KeyEvent.VK_A){
			player.setLeft(false);
		}
		if(k == KeyEvent.VK_RIGHT || k == KeyEvent.VK_D){
			player.setRight(false);
		}
		if(k == KeyEvent.VK_DOWN || k == KeyEvent.VK_S){
			player.setDown(false);
		}
		if(k == KeyEvent.VK_SPACE){
			swing = 0;
			player.setAttacking(false);
		}
	}

	public void keyTyped(KeyEvent e) {

	}


	public void mouseClicked(MouseEvent e) {
		/*System.out.println(e.getX() + "," + e.getY());

		if((e.getX() <= 64) && (e.getY() <= 64) && Angels.inMenu == false){
			System.out.println("0");
			System.out.println(Angels.paused);

			if(Angels.paused = true){
				Angels.paused = false;
				System.out.println("1");
				System.out.println(Angels.paused);
			}
		}
		if((e.getX() <= 64) && (e.getY() <= 64) && player.isAlive() == true){
			if(Angels.paused = true){
				Angels.paused = false;
				System.out.println("2");
				System.out.println(Angels.paused);
			}
		}*/
		if(Angels.inMenu){

			//Play Button
			if((e.getX() <= Window.width/3 + Menu.pb.getWidth()) && (e.getX() >= Window.width/3)
					&& ((e.getY() <= Window.height/3 + Menu.pb.getHeight()) && (e.getY() >= Window.height/3))){
				//System.out.println("Play button clicked");
				Angels.inMenu = false;
				Angels.ghosts.clear();
			}
			//Quit Button
			if((e.getX() <= Window.width/3 + Menu.pb.getWidth()) && (e.getX() >= Window.width/3)
					&& ((e.getY() <= Window.height/2 + Menu.pb.getHeight()) && (e.getY() >= Window.height/2))){	
				//System.out.println("Quit button clicked");
				System.exit(0);
			}
			//How To Play Button
			if((e.getX() <= Window.width/3 + Menu.pb.getWidth()) && (e.getX() >= Window.width/3)
					&& ((e.getY() <= (Window.height - (Window.height/4) + Menu.hb.getHeight())) && (e.getY() >= Window.height - (Window.height/4)))){
				Angels.inHowto = true;
			}
		}
		//Menu Button
		if(Angels.inHowto){
			if((e.getX() <= Window.width/3 + Menu.pb.getWidth()) && (e.getX() >= Window.width/3)
					&& ((e.getY() <= (Window.height - (Window.height/3) + Menu.mb.getHeight())) && (e.getY() >= Window.height - (Window.height/3)))){
				Angels.ghosts.clear();
				Angels.inHowto = false;
				Angels.inMenu = true;
				player.setPosition(Window.width/4 - player.width, Window.height/2 - player.height/2);
				player.setAlive(true);
				player.setGravity(false);
				player.setControllable(false);
			}
		}
		//Restart Button
		else if(Angels.inMenu == false && player.isAlive() == false){
			if((e.getX() <= Window.width/3 + Menu.rb.getWidth()) && (e.getX() >= Window.width/3)
					&& ((e.getY() <= Window.height/2 + Menu.rb.getHeight()) && (e.getY() >= Window.height/3))){	
				//System.out.println("Restart button clicked");

				Angels.restart();
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton () == MouseEvent.BUTTON1){
			//System.out.println("You left clicked!");
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

}
