import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprize implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JLabel label = new JLabel();
	public void setupGUI() throws MalformedURLException {
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.setSize(20, 90);
		panel.add(button);
		panel.add(button2);
		button.setText("Trick");
		button.addActionListener(this);
		button2.setText("Treat");
		button2.addActionListener(this);
		panel.add(label);
		frame.pack();
	}

	public static void main(String[] args) throws MalformedURLException {
		NastySuprize n = new NastySuprize();
		n.setupGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if (buttonPressed.equals(button)) {
			try {
				panel.remove(label);
				label = this.createLabelImage("Puppy.jpg");
				panel.add(label);
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (buttonPressed.equals(button2)) {
			try {
				panel.remove(label);
				label = createLabelImage("Zombie.jpg");
				frame.add(label);
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
