import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
public static void main(String[] args) {
	
}
public void setupGUI() {
	frame.add(panel);
	frame.setVisible(true);
	panel.setVisible(true);
	frame.setSize(500, 300);
}
}
