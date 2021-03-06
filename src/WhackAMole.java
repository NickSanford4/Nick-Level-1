import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int molesWhacked = 0;
	int counter = 0;
	Date timeAtStart;

	public static void main(String[] args) {
		WhackAMole whackMole = new WhackAMole();
		whackMole.setupGUI();
	}

	int a = 0;

	public void setupGUI() {
		molesWhacked = 0;
		counter = 0;
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.setSize(300, 300);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timeAtStart = new Date();
		drawButtons(new Random().nextInt(24) + 1);
		a = 0;
	}

	public void drawButtons(int num) {
		for (int i = 1; i < 25; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (num == i) {
				button.setText("Mole!");
			}
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("Mole!")) {
			molesWhacked++;
			a = a - a;
			playSound("Mole Ding.wav");
		} else {
			a++;
		}
		counter++;
		if (counter >= 10) {
			endGame(timeAtStart, molesWhacked);
		}
		panel.removeAll();
		drawButtons(new Random().nextInt(24) + 1);
		if (a == 1) {
			speak("Dork");
		}
		if (a == 2) {
			speak("Idiot");
		}
		if (a == 3) {
			speak("Moron");
		}
		if (a >= 4) {
			speak("You are a complete waste of atoms.");
		}

	}
}