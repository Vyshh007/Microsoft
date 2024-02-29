package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=411,-1
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel UserName = new JLabel("user name");
		UserName.setBounds(90, 67, 69, 14);
		frame.getContentPane().add(UserName);
		
		JLabel password = new JLabel("password");
		password.setBounds(90, 138, 46, 14);
		frame.getContentPane().add(password);
		
		JLabel login = new JLabel("login");
		login.setBounds(299, 34, 46, 14);
		frame.getContentPane().add(login);
		
		JFormattedTextField b1 = new JFormattedTextField();
		b1.setBounds(284, 64, 89, 20);
		frame.getContentPane().add(b1);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(314, 145, 0, 20);
		frame.getContentPane().add(formattedTextField_1);
		
		JFormattedTextField p1 = new JFormattedTextField();
		p1.setBounds(284, 138, 89, 17);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=b1.getText();
				String password=p1.getText();
//				JOptionPane.showMessageDialog(btnNewButton, "Hello "+user+"\n password is"+password);
				if(user.equals("Raju") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
				
					
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
				}
			
		});
		btnNewButton.setBounds(204, 192, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
