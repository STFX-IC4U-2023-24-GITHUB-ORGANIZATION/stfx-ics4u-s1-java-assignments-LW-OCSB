package lessons.review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 458, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setBounds(170, 34, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(235, 97, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(235, 145, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(235, 196, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(248, 81, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(245, 130, 150, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setBounds(245, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 0; 
				int num2 = 0;
				int sum = 0;
				
				try  {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
				}
				
				catch (Exception e1)  {
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
				
				sum = num1 + num2;
				
				textField3.setText(Integer.toString(sum));
				
				
			}
		});
		button1.setBounds(40, 77, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Subtract");
		button2.setBounds(40, 108, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Multiply");
		button3.setBounds(40, 144, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Divide");
		button4.setBounds(40, 176, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Clear");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		button5.setBounds(40, 210, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Exit");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		button6.setBounds(40, 244, 89, 23);
		frame.getContentPane().add(button6);
	}
}
