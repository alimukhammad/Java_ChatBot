package chatBot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(300, 370);
		frame.setTitle("Onboarding ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		// For text are
		Chatarea.setSize(300, 300);
		Chatarea.setLocation(2, 2);
		
		//For TextField
		chatbox.setSize(300, 30);
		chatbox.setLocation(2, 303);
		
		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU ->" + gtext + "\n");
				chatbox.setText("");
				
				if (gtext.contains("hi")) {
					bot("hello");
				}else if (gtext.contains("onboarding process")){
					bot("Onboarding\n" +
				"1:\n" +
							"2:\n " +
				"3: \n" +
							"4: \n" +
				"5:\n");
				}else if (gtext.contains("help")){
					bot("Please ask your manager");
				}else if (gtext.contains("money")){
					bot("It is too clasified, direct anything related with money to HR");
				}else if (gtext.contains("manager")){
					bot("Look Up their name in company board");
				}else if (gtext.contains("thank you")){
					bot("No problem, come again");
				}else if (gtext.contains("good morning")){
					bot("Welcome");
				}else{
					int rand =(int) (Math.random()* 3+1);
					if(rand == 1) {
						bot("i dont understand");
					}else if(rand == 2) {
						bot("i dont understand you bro");
					}else if(rand == 3) {
						bot("Keep It Simple");
					}
				}
			}
		});
	}
	
	private void bot(String string) {
		Chatarea.append("BOT ->" + string + "\n");
	}
	
public static void main(String [] args) {
	new Bot();
}
}
