
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ping extends JPanel implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	public static boolean online = false;
	private String url;
	public static String result; 
	public static String status;
	private static boolean error = false;


	public Ping() {
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

	public static String getStatus(String url) throws IOException {
		try {
			//TimeUnit.SECONDS.sleep(3);
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL
					.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			if (code == 200) {
				result = "Online";
				online = true;
			}
			else if(code != 200){
				result = "Offline";
				online = false;
			}
		} catch (Exception e) {
			result = "Offline";
			online = false;
		}
		return result;
	}

	public void actionPerformed(ActionEvent evt) {
		url = textField.getText(); 

		if((url.length() < 11) || (!url.contains("http://www."))){
			textArea.append("\nError: You must have http://www.");
				error = true;
		}
		else{
			error = false;
		}


		try {
			status = getStatus(url);
		} catch (IOException e) {
			e.printStackTrace();
		}


		String pingStatus = ("Status: " + result);
		if(!error){
		textArea.append("\n"+pingStatus);
		}

		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	//Gui
	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("Ping");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add contents to the window.
		frame.add(new Ping());

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