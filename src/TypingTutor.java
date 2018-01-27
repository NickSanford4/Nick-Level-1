import java.awt.Window.Type;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.createGUI();

	}

	private void createGUI() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(500, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Typed:     " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("CORRECT!");
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		
	}
	
		
	
		
}
