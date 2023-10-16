package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;

// NEED TO IMPORT FOR PICTURES:
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PicturesInJava {
	
	// variables
	ImageIcon dog1 = new ImageIcon(getClass().getResource("/resources/pic1.jpg") );
	ImageIcon dog2 = new ImageIcon(getClass().getResource("/resources/pic2.jpg") );
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PicturesInJava window = new PicturesInJava();
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
	public PicturesInJava() {
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
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(147, 35, 138, 98);
		frame.getContentPane().add(label1);
		// set label to display image upon application launch
		label1.setIcon(dog1);
		
		JButton btnNewButton = new JButton("Change Picture");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// set label to change image upon button click
				label1.setIcon(dog2);
			}
		});
		btnNewButton.setBounds(130, 170, 173, 35);
		frame.getContentPane().add(btnNewButton);
	}

}
