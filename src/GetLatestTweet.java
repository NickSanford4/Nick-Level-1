import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void MakeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 60);
		frame.setTitle("The Amazing Tweet Retriever");
		JTextField tf = new JTextField();
		panel.add(tf);
		
		JButton button2 = new JButton();
		panel.add(button2);
		button2.setText("Search the Twitterverse");
		tf.addActionListener(this);
		button2.addActionListener(this);
	}
public static void main(String[] args) {
	GetLatestTweet c = new GetLatestTweet();
	c.MakeButtons();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, "tweet tweet");
	}
	
}
}

