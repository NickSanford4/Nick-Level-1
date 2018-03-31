import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();

	public static void main(String[] args) throws MalformedURLException {
		SlotMachine slot = new SlotMachine();
		slot.setupGUI();
	}

	public void setupGUI() throws MalformedURLException {
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.setSize(500, 300);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		setLabels();
	}

	public void setLabels() throws MalformedURLException {
		Random gen = new Random();
		int number = gen.nextInt(4);
		if (number == 0) {
			label = this.createLabelImage("Jackpot.jpg");
		}
		if (number == 1) {
			label = this.createLabelImage("Cherry.jpg");
		}
		if (number == 2) {
			label = this.createLabelImage("Orange.jpg");
		}
		if (number == 3) {
			label = this.createLabelImage("Banana.jpg");
		}

		int number1 = gen.nextInt(4);
		if (number1 == 0) {
			label2 = this.createLabelImage("Jackpot.jpg");
		}
		if (number1 == 1) {
			label2 = this.createLabelImage("Cherry.jpg");
		}
		if (number1 == 2) {
			label2 = this.createLabelImage("Orange.jpg");
		}
		if (number1 == 3) {
			label2 = this.createLabelImage("Banana.jpg");
		}

		int number2 = gen.nextInt(4);
		if (number2 == 0) {
			label3 = this.createLabelImage("Jackpot.jpg");
		}
		if (number2 == 1) {
			label3 = this.createLabelImage("Cherry.jpg");
		}
		if (number2 == 2) {
			label3 = this.createLabelImage("Orange.jpg");
		}
		if (number2 == 3) {
			label3 = this.createLabelImage("Banana.jpg");
		}
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.pack();
		if (number == number1 && number2 == number) {
			JOptionPane.showMessageDialog(null, "You Win!!!");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button)) {
			try {
				panel.remove(label);
				panel.remove(label2);
				panel.remove(label3);
				setLabels();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
