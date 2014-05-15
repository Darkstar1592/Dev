import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Angels extends JPanel implements Runnable{

	JFrame frame;
	static Thread thread;
	static Random rand;
	static BufferedImage image;
	static Graphics2D g;
	public static boolean running;
	public static boolean inMenu;
	public static boolean inHowto;
	static Background bg;
	static Background bg2;
	static Background bg3;
	static int scene;
	static ArrayList <Ghost> ghosts;
	static ArrayList <Bug> bugs;
	static int ghostMax = 3;
	static int bugMax = 1;
	static Sword s;
	static Menu m;
	public static boolean hitbox = false;
	public static boolean paused = false;

	static Player p;
	static int ticks = 0;
	static int frames = 0;
	static int tickcount = 0;

	public Angels(JFrame frame){
		this.frame = frame;
		setFocusable(true);
		requestFocus();
		frame.setSize(Window.width, Window.height);
		setPreferredSize(new Dimension(Window.width, Window.height));
	}

	public void init(){

		running = true;
		inMenu = true;

		ghosts = new ArrayList <Ghost>();
		bugs = new ArrayList <Bug>();
		image = new BufferedImage(Window.width, Window.height, BufferedImage.TYPE_INT_RGB); 
		g = (Graphics2D) image.getGraphics();

		bg = new Background();
		bg.init();
		bg.setPosition(0, 0);

		bg2 = new Background();
		bg2.init();
		bg2.setPosition(Window.width, 0);

		bg3 = new Background();
		bg3.init();
		bg3.setPosition(Window.width * 2, 0);

		p = new Player();
		p.init();
		p.setPosition(Window.width/4 - p.width, Window.height/2 - p.height/2);
		p.setGravity(false);
		p.setControllable(false);

		s = new Sword(p);
		s.init();

		m = new Menu(p);
		m.init();


		rand = new Random();

		addKeyListener(new Input(p));
		addMouseListener(new Input(p));
	}

	public void addNotify(){
		super.addNotify();
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
	}

	public void run() {
		init();

		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / 60D;

		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = true;

			while (delta >= 1) {
				ticks++;
				update();
				tickcount++;
				delta -= 1;
				shouldRender = true;
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.err.println("ERROR:Could not keep time");
				System.exit(1);
				e.printStackTrace();
			}

			if (shouldRender) {
				frames++;
			}

			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				//frame.setTitle(ticks + "ticks, " + frames + "frames");
				frames = 0;
				ticks = 0;
			}
		}
	}

	public static void populateEnemies(){

		Random rand = new Random();

		/*Ghost*/
		int gwr = (Window.width * 2) - (Window.width) + 1;
		int gwrNum =  rand.nextInt(gwr) + (Window.width);

		Point[] gcoords = new Point[] {
				new Point(gwrNum, rand.nextInt(Window.height)) 
		};

		for (int i = 0; i < gcoords.length; i++) {
			Ghost e = new Ghost();
			e.setPosition(gcoords[i].x, gcoords[i].y);
			if(ghosts.size() < ghostMax){
				ghosts.add(e);
				e.init();
			}
		}
		
		/*Bug*/
		int bwr = (Window.width * 2) - (Window.width) + 1;
		int bwrNum =  rand.nextInt(bwr) + (Window.width);

		Point[] bcoords = new Point[] {
				new Point(bwrNum, rand.nextInt(Window.height)) 
		};

		for (int i = 0; i < bcoords.length; i++) {
			Bug b = new Bug();
			b.setPosition(bcoords[i].x, bcoords[i].y);
			if(bugs.size() < bugMax){
				bugs.add(b);
				b.init();
			}
		}
	}

	public void update(){

		bg.update();
		bg2.update();
		bg3.update();

		if(!paused){
			p.update();
		}
		s.update();

		populateEnemies();

		//System.out.println(scene);
		scene = (p.xa/Window.width);

		m.draw(g);

		//Screen
		Graphics g2 = getGraphics();
		g2.drawImage(image, 0, 0, Window.width, Window.height, null);
		g2.dispose();

		//Render
		g.setColor(Color.gray);
		g.fillRect(0, 0, Window.width, Window.height);

		bg.draw(g);
		bg2.draw(g);
		bg3.draw(g);
		p.draw(g);
		s.draw(g);

		//PopulateEnemies

		/*Ghosts*/
		for(int i = 0; i < ghosts.size(); i++){
			Ghost e = ghosts.get(i);

			if(e.getX() + e.getWidth() <= 0){
				ghosts.remove(e);
			}

			e.draw(g);
			if(!inMenu && !paused){
				e.update();
			}

			//Death
			if(p.isAlive() == true){
				if(p.intersects(e)){
					//flash screen white on death
					g.setColor(Color.white);
					g.fillRect(0, 0, Window.width, Window.height);
					p.setAlive(false);
				}
			}

			if(s.intersects(e) && p.isAttacking() && p.isAlive()){
				ghosts.remove(e);
				p.score++;
			}
		}

		/*Bugs*/
		for(int i = 0; i < bugs.size(); i++){
			Bug b = bugs.get(i);

			if(b.getX() + b.getWidth() <= 0){
				bugs.remove(b);
			}

			b.draw(g);
			if(!inMenu && !paused){
				b.update();
			}

			//Death
			if(p.isAlive() == true){
				if(p.intersects(b)){
					//flash screen white on death
					g.setColor(Color.white);
					g.fillRect(0, 0, Window.width, Window.height);
					p.setAlive(false);
				}
			}

			if(s.intersects(b) && p.isAttacking() && p.isAlive()){
				bugs.remove(b);
				p.score+=2;
			}
		}

		if(p.isAlive() == false){
			p.setControllable(false);
			p.setUp(false);
			p.setDown(false);
			p.setLeft(false);
			p.setRight(false);
			p.setY(p.y+=4);
		}


		if(inHowto){
			/*Ghost e = new Ghost();
			e.setPosition(Window.width - (Window.width/4), Window.height/3);
			ghosts.add(e);
			e.init();*/

			//p.setGravity(true);
			p.setControllable(true);
		}

		if(!inMenu){
			bg.setPosition(-p.xa + (Window.width * scene), 0);
			bg2.setPosition(-p.xa + (Window.width * scene) + Window.width, 0);
			bg3.setPosition(-p.xa + (Window.width * scene) + (Window.width * 2), 0);
			p.setGravity(true);
			p.setControllable(true);
		}

	}

	public static void restart(){
		p.setAlive(true);
		p.setPosition(Window.width/4 - Angels.p.width, Window.height/2 - Angels.p.height/2);
		p.score = 0;

		bg.setPosition(0 + (Window.width * Angels.scene), 0);
		bg2.setPosition(0 + (Window.width * Angels.scene) + Window.width, 0);
		bg3.setPosition(0 + (Window.width * Angels.scene) + (Window.width * 2), 0);

		ghosts.clear();
		bugs.clear();
		populateEnemies();
	}

}
