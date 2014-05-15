import java.awt.Color;
import java.awt.Rectangle;


public class Entity {

	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	protected int width;
	protected int height;
	protected int collWidth;
	protected int collHeight;
	protected int collOffsetX;
	protected int collOffsetY;
	protected boolean up;
	protected boolean down;
	protected boolean left;
	protected boolean right;
	protected int movespeed;
	protected int maxspeed;
	protected int stopspeed;
	protected int xa;
	protected int ya;
	protected boolean controllable;
	protected boolean gravity;
	protected boolean movable;
	protected boolean alive;
	protected boolean attacking;
	protected int score;


	public boolean isMovable() {
		return movable;
	}

	public void setMovable(boolean movable) {
		this.movable = movable;
	}

	public boolean intersects(Entity o){

		Rectangle r1 = getRectangle();
		Rectangle r2 = o.getRectangle();

		return r1.intersects(r2);
	}

	public Rectangle getRectangle(){
		Rectangle playerBox = new Rectangle(getX() + collOffsetX, getY() + collOffsetY, collWidth, collHeight); 
		return playerBox;
	}

	public void draw(java.awt.Graphics2D g){
		//Hitbox
		if(Angels.hitbox){
			g.setColor(Color.gray);
			g.draw(getRectangle());
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPosition(int x, int y){
		this.setX(x);
		this.setY(y);
	}

	public void setVector(int dx, int dy){
		this.dx = dx;
		this.dy = dy;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isControllable(){
		return controllable;
	}

	public void setControllable(boolean controllable){
		this.controllable = controllable;
	}

	public boolean isGravity() {
		return gravity;
	}

	public void setGravity(boolean gravity) {
		this.gravity = gravity;
	}

	public boolean isAlive(){
		return alive;
	}

	public void setAlive(boolean alive){
		this.alive = alive;
	}

	public boolean isAttacking() {
		return attacking;
	}

	public void setAttacking(boolean attacking) {
		this.attacking = attacking;
	}
}
