
import javax.swing.JFrame;

public class Window {
	public static int width = 800;
	public static int height = 600;	

	public static void main(String[] args) {

		Loader loader = new Loader();

		JFrame f = new JFrame("Angels");
		f.setContentPane(new Angels(f));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setIconImage(loader.loadImage("vy.png"));
	}
}
