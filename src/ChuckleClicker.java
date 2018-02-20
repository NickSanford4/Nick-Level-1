import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void makeButtons() {
	

	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.setVisible(true);
	frame.setTitle("Chuckle Clicker");
	frame.setSize(200, 60);
	button1.setText("Joke");
	button2.setText("Punchline");
	button1.addActionListener(this);
	button2.addActionListener(this);
	}
public static void main(String[] args) {
	ChuckleClicker c = new ChuckleClicker();
	c.makeButtons();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) 
	{     JOptionPane.showMessageDialog(null, "Why do dumb people not trust atoms");    }
	if(e.getSource()==button2) 
	{     JOptionPane.showMessageDialog(null, "because they make up everything");    }
}
}

