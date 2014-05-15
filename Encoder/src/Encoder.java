
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Encoder extends JPanel implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	private final static String newline = "\n";

	public Encoder() {
		super(new GridBagLayout());

		textField = new JTextField(20);
		textField.addActionListener(this);

		textArea = new JTextArea(5, 20);
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textArea);

		//Add Components to the panel
		GridBagConstraints g = new GridBagConstraints();
		g.gridwidth = GridBagConstraints.REMAINDER;

		g.fill = GridBagConstraints.HORIZONTAL;
		add(textField, g);

		g.fill = GridBagConstraints.BOTH;
		g.weightx = 1.0;
		g.weighty = 1.0;
		add(scrollPane, g);
	}

	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		textField.selectAll();
		String code = "";
		text = "";
		code = textField.getText(); 

		//Coder
		if (code.substring(0,1) != "0" || code.substring(0,1) != "1" || code.substring(0,1) != "2"){
			int clength = code.length();
			int encodeSubstringLocation = 0;
			int xc = 0;
			int yc = 1;
			int cycle = 0;
			String letter = "";

			//While
			while(encodeSubstringLocation < clength){
				if (code.substring(xc,yc).equals(" ")){
					letter = "--";
				}
				if (code.substring(xc,yc).equals("a")){
					letter = "01";
				}
				else if (code.substring(xc,yc).equals("b")){
					letter = "02";
				}
				else if (code.substring(xc,yc).equals("c")){
					letter = "03";
				}
				else if (code.substring(xc,yc).equals("d")){
					letter = "04";
				}
				else if (code.substring(xc,yc).equals("e")){
					letter = "05";
				}
				else if (code.substring(xc,yc).equals("f")){
					letter = "06";
				}
				else if (code.substring(xc,yc).equals("g")){
					letter = "07";
				}
				else if (code.substring(xc,yc).equals("h")){
					letter = "08";
				}
				else if (code.substring(xc,yc).equals("i")){
					letter = "09";
				}
				else if (code.substring(xc,yc).equals("j")){
					letter = "10";
				}
				else if (code.substring(xc,yc).equals("k")){
					letter = "11";
				}
				else if (code.substring(xc,yc).equals("l")){
					letter = "12";
				}
				else if (code.substring(xc,yc).equals("m")){
					letter = "13";
				}
				else if (code.substring(xc,yc).equals("n")){
					letter = "14";
				}
				else if (code.substring(xc,yc).equals("o")){
					letter = "15";
				}
				else if (code.substring(xc,yc).equals("p")){
					letter = "16";
				}
				else if (code.substring(xc,yc).equals("q")){
					letter = "17";
				}
				else if (code.substring(xc,yc).equals("r")){
					letter = "18";
				}
				else if (code.substring(xc,yc).equals("s")){
					letter = "19";
				}
				else if (code.substring(xc,yc).equals("t")){
					letter = "20";
				}
				else if (code.substring(xc,yc).equals("u")){
					letter = "21";
				}
				else if (code.substring(xc,yc).equals("v")){
					letter = "22";
				}
				else if (code.substring(xc,yc).equals("w")){
					letter = "23";
				}
				else if (code.substring(xc,yc).equals("x")){
					letter = "24";
				}
				else if (code.substring(xc,yc).equals("y")){
					letter = "25";
				}
				else if (code.substring(xc,yc).equals("z")){
					letter = "26";
				}
				encodeSubstringLocation++;
				xc++;
				yc++;
				cycle++;
				/*textArea.append("Finished cycle" + cycle);
				textArea.append(newline);*/
				textArea.append(letter);
			}
		}
		//textArea.append(newline);

		//Decoder
		code = textField.getText(); 

		if (code.substring(0,1) != "a" || code.substring(0,1) != "b" || code.substring(0,1) != "c" || code.substring(0,1) != "d" 
				|| code.substring(0,1) != "e" || code.substring(0,1) != "f" || code.substring(0,1) != "g" 
				|| code.substring(0,1) != "h" || code.substring(0,1) != "i" || code.substring(0,1) != "j" 
				|| code.substring(0,1) != "k" || code.substring(0,1) != "l" || code.substring(0,1) != "m" 
				|| code.substring(0,1) != "n" || code.substring(0,1) != "o" || code.substring(0,1) != "p" 
				|| code.substring(0,1) != "q" || code.substring(0,1) != "r" || code.substring(0,1) != "s" 
				|| code.substring(0,1) != "t" || code.substring(0,1) != "u" || code.substring(0,1) != "v" 
				|| code.substring(0,1) != "w" || code.substring(0,1) != "x" || code.substring(0,1) != "y" 
				|| code.substring(0,1) != "z") {
			int dlength = String.valueOf(code).length() / 2;
			int decodeSubstringLocation = 0;
			int xd = 0;
			int yd = 2;
			int dcycle = 0;
			String dletter = "";

			//While
			while(decodeSubstringLocation < dlength){
				if (code.substring(xd,yd).equals("--")){
					dletter = " ";
				}
				else if (code.substring(xd,yd).equals("01")){
					dletter = "a";
				}
				else if (code.substring(xd,yd).equals("02")){
					dletter = "b";
				}
				else if (code.substring(xd,yd).equals("03")){
					dletter = "c";
				}
				else if (code.substring(xd,yd).equals("04")){
					dletter = "d";
				}
				else if (code.substring(xd,yd).equals("05")){
					dletter = "e";
				}
				else if (code.substring(xd,yd).equals("06")){
					dletter = "f";
				}
				else if (code.substring(xd,yd).equals("07")){
					dletter = "g";
				}
				else if (code.substring(xd,yd).equals("08")){
					dletter = "h";
				}
				else if (code.substring(xd,yd).equals("09")){
					dletter = "i";
				}
				else if (code.substring(xd,yd).equals("10")){
					dletter = "j";
				}
				else if (code.substring(xd,yd).equals("11")){
					dletter = "k";
				}
				else if (code.substring(xd,yd).equals("12")){
					dletter = "l";
				}
				else if (code.substring(xd,yd).equals("13")){
					dletter = "m";
				}
				else if (code.substring(xd,yd).equals("14")){
					dletter = "n";
				}
				else if (code.substring(xd,yd).equals("15")){
					dletter = "o";
				}
				else if (code.substring(xd,yd).equals("16")){
					dletter = "p";
				}
				else if (code.substring(xd,yd).equals("17")){
					dletter = "q";
				}
				else if (code.substring(xd,yd).equals("18")){
					dletter = "r";
				}
				else if (code.substring(xd,yd).equals("19")){
					dletter = "s";
				}
				else if (code.substring(xd,yd).equals("20")){
					dletter = "t";
				}
				else if (code.substring(xd,yd).equals("21")){
					dletter = "u";
				}
				else if (code.substring(xd,yd).equals("22")){
					dletter = "v";
				}
				else if (code.substring(xd,yd).equals("23")){
					dletter = "w";
				}
				else if (code.substring(xd,yd).equals("24")){
					dletter = "x";
				}
				else if (code.substring(xd,yd).equals("25")){
					dletter = "y";
				}
				else if (code.substring(xd,yd).equals("26")){
					dletter = "z";
				}
				decodeSubstringLocation++;
				xd+=2;
				yd+=2;
				dcycle++;
				//textArea.append("Finished cycle" + dcycle);
				//textArea.append(newline);
				textArea.append(dletter);
			}
		}
		textArea.append(newline);

		//Make sure the new text is visible
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	//Gui
	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("Encoder");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add contents to the window.
		frame.add(new Encoder());

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}