import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfaceRegister {

	private JFrame frame;
	private JTextField textFieldAccount;
	private JTextField textFieldPassword;
	private JTextField textFieldPasswordAgain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceRegister window = new InterfaceRegister();
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
	public InterfaceRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldAccount = new JTextField();
		textFieldAccount.setBounds(140, 90, 150, 25);
		frame.getContentPane().add(textFieldAccount);
		textFieldAccount.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(140, 140, 150, 25);
		frame.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);

		JButton btnNewButtonRegister = new JButton("\u8A3B\u518A");
		btnNewButtonRegister.setBounds(170, 228, 99, 27);
		frame.getContentPane().add(btnNewButtonRegister);
		
		JLabel lblNewLabelAccount = new JLabel("\u5E33\u865F");
		lblNewLabelAccount.setBounds(57, 90, 57, 19);
		frame.getContentPane().add(lblNewLabelAccount);
		
		JLabel lblNewLabelPassword = new JLabel("\u5BC6\u78BC");
		lblNewLabelPassword.setBounds(57, 144, 57, 19);
		frame.getContentPane().add(lblNewLabelPassword);
		
		JLabel labelTop = new JLabel("     \u8ACB\u8F38\u5165\u5E33\u865F\u5BC6\u78BC");
		labelTop.setBounds(136, 55, 147, 19);
		frame.getContentPane().add(labelTop);
		
		textFieldPasswordAgain = new JTextField();
		textFieldPasswordAgain.setBounds(140, 190, 150, 25);
		frame.getContentPane().add(textFieldPasswordAgain);
		textFieldPasswordAgain.setColumns(10);
		
		JLabel lblNewLabelPasswordAgain = new JLabel("\u518D\u6B21\u8F38\u5165\u5BC6\u78BC");
		lblNewLabelPasswordAgain.setBounds(37, 193, 99, 19);
		frame.getContentPane().add(lblNewLabelPasswordAgain);
		
	}

}
