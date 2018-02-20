import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField answer;
	JLabel letter = new JLabel();

	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.createUI();
	}

	void createUI() {
		frame.add(panel);
		answer = new JTextField(20);
		panel.add(answer);
		frame.setTitle("Give me binary or give me death!!!");
		frame.setSize(700, 60);
		frame.setVisible(true);
		panel.add(button);
		button.setLabel("Convert");
		button.addActionListener(this);
		panel.add(letter);

		frame.pack();

	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}

	}

	String convert1(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// int result = convert(answer.getText().trim());
		System.out.println("text;" + answer.getText() + ".");
		letter.setText(convert1(answer.getText()));
	}

}
