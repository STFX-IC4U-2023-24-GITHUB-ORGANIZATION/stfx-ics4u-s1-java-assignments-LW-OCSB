package lessons.twoDice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUI {

	
	
	// create instance of TwoDice object
	TwoDice myGame = new TwoDice();

	
	
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Roll Di");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myGame.rollDi();
				textField1.setText(Integer.toString(myGame.getDice1()));
				textField2.setText(Integer.toString(myGame.getDice2()));
				
			}
		});
		button1.setBounds(88, 116, 89, 23);
		frame.getContentPane().add(button1);
		
		textField1 = new JTextField();
		textField1.setBounds(271, 77, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(271, 164, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dice 1");
		lblNewLabel.setBounds(271, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dice 2");
		lblNewLabel_1.setBounds(271, 142, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
