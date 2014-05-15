import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ab extends JFrame{
	public ac panel;

	public ab() {
		panel = new ac(this);
		setLayout(new GridLayout(1, 1, 0, 0));
		add(panel);
	}
}


