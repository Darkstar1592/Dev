import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ac extends JPanel implements Runnable{
	//Rectangles
	public Rectangle character;
	public Rectangle floor;
	public Rectangle floor2;
	public Rectangle floor3;
	public Rectangle[] star;

	//Keys
	public int keyJump = KeyEvent.VK_SPACE;
	public int keyLeft = KeyEvent.VK_LEFT;
	public int keyRight = KeyEvent.VK_RIGHT;
	public int keyPause = KeyEvent.VK_P;
	public int keyStart = KeyEvent.VK_ENTER;
	public int keyQuit = KeyEvent.VK_ESCAPE;
	public int keyDifficulty = KeyEvent.VK_D;
	public int keyRestart = KeyEvent.VK_R;

	//Int Variables
	public int fallingSpeed = 1;
	public int fallingFrame = 0;
	public int floorHeight = 20;
	public int movementSpeed = 2;
	public int movementFrame = 1;
	public int movementFallingSpeed = 5;
	public int movementResetSpeed = 1;
	public int jumpingLength = 100;
	public int jumpingFrame = 0;
	public int jumpingCountFrame = 0;
	public int jumpingCountSpeed = fallingSpeed;
	public int xs = 0;
	public int ys = 0;
	public int currentStarSize;
	public int jumps = 0;

	//Platform Ints 
	public int modeSwitchInt = 1500;
	//Distance Between Platforms
	public int maxDistance = 60;
	public int minDistance = 30;
	public int randDistance = 0;
	//Height of Next Platform
	public int maxHeight = 60;
	public int minHeight = -60;
	public int randHeight = 0;
	//Length of Next Platform
	public int maxLength = 300;
	public int minLength = 100;
	public int randLength = 0;
	//Hard Mode Height of Next Platform
	public int hardMaxHeight = 100;
	public int hardMinHeight = -100;
	public int randHardHeight = 0;
	//Hard Mode Length of Next Platform
	public int hardMaxLength = 300;
	public int hardMinLength = 60;
	public int randHardLength = 0;
	//Insane Mode Height of Next Platform 
	public int insaneMaxHeight = 0;
	public int insaneMinHeight = 0;
	public int randInsaneHeight = 0;
	//insane Mode Length of Next Platform
	public int insaneMaxLength = 0;
	public int insaneMinLength = 0;
	public int randInsaneLength = 0;

	//Boolean Variables
	public boolean objectsDefined = false;
	public boolean falling = false;
	public boolean running = false;
	public boolean right = true;
	public boolean left = false;
	public boolean jumping = false;
	public boolean inGame = true;
	public boolean gameOver = false;
	public boolean hardMode = false;
	public boolean insaneMode = false;
	public boolean restarting = false;

	//Main Menu
	public boolean mainMenu = true;
	public String difficulty = "";

	//Character Variables
	//Body
	public int characterWidth = 25;
	public int characterHeight = 25;
	//Nose
	public int noseHeight = 10;
	public int noseWidth = 10;
	//Hat
	public int hatHeight = 9;
	public int hatWidth = 24;
	public int billHeight = 5;
	public int billWidth = 30;
	//Face
	public int eyeHeight = 6;
	public int eyeWidth = 6;
	public int pupilWidth = 2;
	public int pupilHeight = 2;

	public boolean leftNose = false;
	public boolean rightNose = true;

	//Game
	public Thread game; 

	//Get window f from class ab
	public ac(ab f) {
		//Window Background
		setBackground(Color.BLACK);

		defineObjects();

		//Run Game Until cmd+Q
		game = new Thread(this);
		game.start();


		//Key Scripts
		f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == keyQuit) {
					System.exit(0);
				}

				/*	//Left Arrow
				if (e.getKeyCode() == keyLeft) {
					left = true;
					rightNose = false;
					leftNose = true;
				}
				//Right Arrow
				if (e.getKeyCode() == keyRight) {
					right = true;
					leftNose = false;
					rightNose = true;
				}*/

				//SpaceBar
				if (e.getKeyCode() == keyJump && (!falling && !jumping)) {
					jumping = true;
					jumps += 1;
				}
				if (falling && !jumping) {
					jumping = false;
				}

				//Reset Jump Counter
				if (jumps == 3) {
					jumps = 0;
				}

				/*//Modes
						//Hard Mode
						if ((xs >= 10000 && xs <= 19999) || (xs >= 30000 && xs <= 39999) || (xs >= 50000)) {
							hardMode = true;
						}
						//Easy Mode
						if ((xs >= 20000 && xs <= 29999) || (xs >= 40000 && xs <= 49999)) {
							hardMode = false;
						}*/

				//Generate Platforms for EASY MODE
				if (!hardMode && !falling) {
					if (jumps == 0) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHeight = heightRand.nextInt((maxHeight - minHeight) + 1) + minHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randLength = lengthRand.nextInt((maxLength - minLength) + 1) + minLength;

						floor2 = new Rectangle(floor.x + floor.width + randDistance, floor.y - randHeight, randLength, floor.height);
						floor3 = new Rectangle(0, 0, 0, 0);
					}

					if (jumps == 1) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHeight = heightRand.nextInt((maxHeight - minHeight) + 1) + minHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randLength = lengthRand.nextInt((maxLength - minLength) + 1) + minLength;

						floor3 = new Rectangle(floor2.x + floor2.width + randDistance, floor2.y - randHeight, randLength, floor2.height);
						floor = new Rectangle(0, 0, 0, 0);
					}

					if (jumps == 2) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHeight = heightRand.nextInt((maxHeight - minHeight) + 1) + minHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randLength = lengthRand.nextInt((maxLength - minLength) + 1) + minLength;

						floor = new Rectangle(floor3.x + floor3.width + randDistance, floor3.y - randHeight, randLength, floor3.height);
						floor2 = new Rectangle(0, 0, 0, 0);
					}
				}
				//Generate Platforms for HARD MODE
				if (hardMode && !falling) {
					if (jumps == 0) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHardHeight = heightRand.nextInt((hardMaxHeight - hardMinHeight) + 1) + hardMinHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randHardLength = lengthRand.nextInt((hardMaxLength - hardMinLength) + 1) + hardMinLength;

						floor2 = new Rectangle(floor.x + floor.width + randDistance, floor.y - randHardHeight, randHardLength, floor.height);
						floor3 = new Rectangle(0, 0, 0, 0); 
					}


					if (jumps == 1) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHardHeight = heightRand.nextInt((hardMaxHeight - hardMinHeight) + 1) + hardMinHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randHardLength = lengthRand.nextInt((hardMaxLength - hardMinLength) + 1) + hardMinLength;

						floor3 = new Rectangle(floor2.x + floor2.width + randDistance, floor2.y - randHardHeight, randHardLength, floor2.height);
						floor = new Rectangle(0, 0, 0, 0);
					}

					if (jumps == 2) {

						//Random Distance Between Platforms
						Random distanceRand = new Random();
						randDistance = distanceRand.nextInt((maxDistance - minDistance) + 1) + minDistance;

						//Random Height of the Next Platform
						Random heightRand = new Random();
						randHardHeight = heightRand.nextInt((hardMaxHeight - hardMinHeight) + 1) + hardMinHeight;

						//Random Length of the Next Platform
						Random lengthRand = new Random();
						randHardLength = lengthRand.nextInt((hardMaxLength - hardMinLength) + 1) + hardMinLength;

						floor = new Rectangle(floor3.x + floor3.width + randDistance, floor3.y - randHardHeight, randHardLength, floor3.height);
						floor2 = new Rectangle(0, 0, 0, 0);
					}
				}

				//Restart
				if (e.getKeyCode() == keyRestart) {
					restarting = true;
					//Restarting...
					//Checking game status...
					if (gameOver) {
						//Resetting game status...
						gameOver = false;
						if (!gameOver) {
							//Success!
						}
						else if (gameOver) {
							//Failed!
						}
						//Allowing movement...
						right = true;
						//Turning on gravity...
						falling = true;
					}
					//Loading menu...
					mainMenu = true;
					//Resetting camera...
					xs = 0;
					ys = 0;
					//Making new character...
					character = new Rectangle((Infinity.width/2) - (characterWidth/2), (Infinity.height/2) - (characterHeight/2), characterWidth, characterHeight);
					//Generating platforms...
					floor = new Rectangle(-10, Infinity.height - floorHeight, Infinity.width + 10, floorHeight);
					floor2 = new Rectangle(floor.x + floor.width + 40, floor.y, floor.width, floor.height);
					//Resetting jump counter...
					if (jumps >= 1) {
						jumps = 0;
					}
				}

				//Start
				if ((e.getKeyCode() == keyStart) && mainMenu) {
					mainMenu = false;
					running = true;
				}
				//Do nothing if button press not at the main menu
				if ((e.getKeyCode() != keyStart) && mainMenu) {
					mainMenu = true;
					running = false;
				}

				//Pause
				if (e.getKeyCode() == keyPause) {
					if (inGame && !mainMenu) {
						inGame = false;
					}
					else {
						inGame = true;
					}
					if (e.getKeyCode() == keyPause) {
						if (!inGame && !mainMenu) {
							inGame = false;
						}
						else {
							inGame = true;
						}
					}
				}

				//Change Difficulty
				if (e.getKeyCode() == keyDifficulty) {
					if (xs <= 1260 && hardMode) {
						hardMode = false;
						difficulty = "EASY";
					}
					else if (xs <= 1260 && !hardMode) {
						hardMode = true;
						inGame = true;
						difficulty = "HARD";
					}
				}
			}
		});


		//Direction of Nose
		/*public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == keyLeft) {
					left = false;
					leftNose = true;
				}
				if (e.getKeyCode() == keyRight) {
					right = false;
					rightNose = true;
				}
			}*/
	};

	//Define Objects
	public void defineObjects() {
		character = new Rectangle((Infinity.width/2) - (characterWidth/2), (Infinity.height/2) - (characterHeight/2), characterWidth, characterHeight);
		floor = new Rectangle(-10, Infinity.height - floorHeight, Infinity.width + 10, floorHeight);
		floor2 = new Rectangle(floor.x + floor.width + 40, floor.y, floor.width, floor.height);
		floor3 = new Rectangle(floor2.x + floor2.width + 40, floor2.y, floor2.width, floor2.height);

		star = new Rectangle[200];
		Random ra = new Random();
		for(int i=0;i<star.length;i++) {
			currentStarSize = ra.nextInt(5);
			star[i] = new Rectangle(ra.nextInt(Infinity.width) * 2 - (Infinity.width / 2), ra.nextInt(Infinity.height) * 2 - (Infinity.height / 2), currentStarSize, currentStarSize);
		}

		objectsDefined = true;

		repaint();
	}

	//Create Object Sprites
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Player
		if (objectsDefined) {


			g.setColor(Color.WHITE);
			g.fillRect(character.x - xs, character.y - ys, character.width, character.height);

			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(floor.x - xs, floor.y - ys, floor.width, floor.height);
			g.fillRect(floor2.x - xs, floor2.y - ys, floor2.width, floor2.height);
			g.fillRect(floor3.x - xs, floor3.y - ys, floor3.width, floor3.height);

			/*//Nose
			g.setColor(Color.LIGHT_GRAY);
			if (leftNose) {
				g.fillRect(character.x - noseWidth - xs, character.y + (character.height / 4) - ys, noseWidth, noseHeight);
			}
			else if (rightNose) {
				g.fillRect(character.x + character.width - xs, character.y + (character.height / 4) - ys, noseWidth, noseHeight);
			}

			//Hat
			g.setColor(Color.GRAY);
			g.fillRect(character.x - xs, character.y - (hatHeight / 2) - ys, hatWidth, hatHeight);
			g.fillRect(character.x - xs, character.y - (billHeight / 10) - ys, billWidth, billHeight);

			//Eyes
			g.setColor(Color.WHITE);
			g.fillRect(character.x + (eyeWidth * 3) - xs, character.y + (eyeHeight) - ys, eyeWidth, eyeHeight);
			g.setColor(Color.BLACK);
			g.fillRect(character.x + (pupilWidth * 11) - xs, character.y + (pupilHeight * 4) - ys, pupilWidth, pupilHeight);*/

			//Stars
			if (!hardMode) {
				g.setColor(Color.WHITE);
				for(int i=0;i<star.length;i++) {
					g.fill3DRect((star[i].x ), (star[i].y), star[i].width, star[i].height, true);
				}
			}
			//Hard Mode Stars
			if (hardMode) {
				//Hard Mode Star Color 
				g.setColor(Color.WHITE);
				for(int i=0;i<star.length;i++) {
					g.fill3DRect(star[i].x , star[i].y, star[i].width, star[i].height, true);
				}
			}

			//Pause Text
			if (!inGame && !mainMenu) {
				g.setColor(Color.RED);
				g.drawString("PAUSED", 10, 20);
			}

			//Game Over
			//Game Over if Falls off Floor1 
			if ((floor.y > 0 && floor2.y > 0) && falling){
				if (gameOver || (character.y >= (floor.y))) {
					if (floor.y != 0){
						ys = floor.y / 2;
					}
					gameOver = true;
				}
			}
			//Game Over if Falls off Floor2
			if ((floor2.y > 0 && floor3.y > 0) && falling) {
				if (gameOver || (character.y >= (floor2.y))) {
					if (floor2.y != 0){
						ys = floor2.y / 2;
					}
					gameOver = true;
				}
			}
			//Game Over if Falls off Floor3
			if ((floor3.y > 0 && floor.y > 0) && falling) {
				if (gameOver || (character.y >= (floor3.y))) {
					if (floor3.y != 0){
						ys = floor3.y / 2;
					}
					gameOver = true;
				}
			}
		}

		//Restart menu text
		if (restarting && !running && !gameOver){
			g.setColor(Color.GRAY);
			g.setFont(new Font("Serif", Font.PLAIN, 100));
			g.drawString("Infinity", 250, 100);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Press Enter to Start", 175, 500);
		}

		//Game Over Text
		if (gameOver){
			right = false;
			g.setColor(Color.RED);
			g.setFont(new Font("Serif", Font.PLAIN, 100));
			g.drawString("GAME OVER", 100, 100);
			g.setColor(Color.GRAY);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Press R to Restart", 200, 170);
			g.setFont(new Font("HELVETICA", Font.PLAIN, 12));
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Score: " + xs, 250, 400);
		}

		//Main Menu Easy Mode
		if (mainMenu && !hardMode) {
			running = false;
			g.setColor(Color.GRAY);
			g.setFont(new Font("Serif", Font.PLAIN, 100));
			g.drawString("Infinity", 250, 100);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Press Enter to Start", 175, 500);
			difficulty = "EASY";
		}

		/*//Main Menu Hard Mode
		if (mainMenu && hardMode) {
			running = false;
			g.setColor(Color.GRAY);
			g.setFont(new Font("Serif", Font.PLAIN, 100));
			g.drawString("Infinity", 250, 100);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Serif", Font.PLAIN, 60));
			g.drawString("Press Enter to Start", 175, 500);
			difficulty = "HARD";
		}*/

		//Display difficulty for only the first two platforms
		if (xs <= 1260 && !mainMenu && !gameOver && !hardMode) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("Serif", Font.PLAIN, 50));
			g.drawString("Press D for Hard Mode", 160, 100);
			if (xs <= 390){
				g.setColor(Color.GRAY);
				g.setFont(new Font("Serif", Font.PLAIN, 50));
				g.drawString("Press Space to Jump", 200, 500);
			}
			difficulty = "EASY";
			g.setColor(Color.RED);
			g.setFont(new Font("HELVETICA", Font.PLAIN, 12));
			g.drawString(difficulty, 750, 550); 
			g.setColor(Color.YELLOW);
			g.drawString("Score: " + xs, 10, 550);
		}

		if (xs <= 1260 && !mainMenu && !gameOver && hardMode) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("Serif", Font.PLAIN, 50));
			g.drawString("Press D for Easy Mode", 160, 100);
			if (xs <= 390){
				g.setColor(Color.GRAY);
				g.setFont(new Font("Serif", Font.PLAIN, 50));
				g.drawString("Press Space to Jump", 200, 500);
			}
			difficulty = "HARD";
			g.setColor(Color.RED);
			g.setFont(new Font("HELVETICA", Font.PLAIN, 12));
			g.drawString(difficulty, 750, 550); 
			g.setColor(Color.YELLOW);
			g.drawString("Score: " + xs, 10, 550);
		}
		if (xs >= 1260 && !gameOver) {
			g.setFont(new Font("HELVETICA", Font.PLAIN, 12));
			g.setColor(Color.YELLOW);
			g.drawString("Score: " + xs, 10, 550);
		}
	}

	//Game Mechanics
	public void run() { 
		while (mainMenu || running) {
			if (inGame) {

				//Character bottom
				Point pt1 = new Point(character.x, character.y + character.height);
				Point pt2 = new Point(character.x + character.width, character.y + character.height);

				//Falling
				if (!jumping) {
					if (fallingFrame >= fallingSpeed) {
						if (floor.contains(pt1) || floor.contains(pt2) || floor2.contains(pt1) || floor2.contains(pt2) || floor3.contains(pt1) || floor3.contains(pt2)) {
							falling = false;
						}
						else {
							falling = true;
						}

						if (falling) {
							character.y += 1;
							ys += 1;
						}
						if (!hardMode) {
							fallingFrame = 0;
						}
						if (hardMode) {
							fallingFrame = 1;
						}
					}
					else {
						fallingFrame += 1;
					}
				}

				//Jumping
				if (jumpingCountFrame >= jumpingCountSpeed) {
					if (jumping) {
						if (jumpingFrame <= jumpingLength) {

							character.y -= 1; 
							ys -= 1;

							jumpingFrame += 1;
						}
						else {
							jumpingFrame = 0;
							jumping = false;
						}
					}
					jumpingCountSpeed += 1;
				}
				else {
					jumpingCountFrame += 1;
				}

				//Movement Speed Check
				if (falling) {
					movementSpeed = movementFallingSpeed;
				}
				else {
					movementSpeed = movementResetSpeed;
				}

				//Movement
				if (!mainMenu) {
					if (movementFrame >= movementSpeed) {
						if (right) {
							character.x += 1;
							xs += 1;
						}
						if (left) {
							character.x -= 1;
							xs -= 1;
						}
						if (!hardMode) {
							movementFrame = -1;
						}
						else {
							movementFrame = 0;
						}
					}
					else {
						movementFrame += 1;
					}

					fpsSetter();

					repaint();
				}
			}
		}
	}
	//Fps
	public void fpsSetter() {
		try {	
			Thread.sleep(1);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
