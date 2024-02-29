package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ecommerce {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(147, 11, 163, 29);
		frame.getContentPane().add(lblNewLabel);
		JLabel l3 = new JLabel("CART:");
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setBounds(345, 19, 62, 14);
		frame.getContentPane().add(l3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(70, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel l1 = new JLabel("RS: 300");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l1.setBounds(58, 224, 70, 14);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(256, 224, 56, 14);
		frame.getContentPane().add(l2);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+300;
				l3.setText("CART : "+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\j1.jpeg"));
		b1.setBounds(26, 51, 138, 162);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+250;
				l3.setText("CART : "+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\d1.jpeg"));
		b2.setBounds(219, 51, 146, 162);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_4 = new JLabel("RS:250");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(266, 225, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
				
		JButton b3 = new JButton("Buy");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3, "number of items "+items+"\n total bill "+bill);
			}
		});
		b3.setBackground(new Color(255, 128, 128));
		b3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b3.setBounds(345, 227, 89, 23);
		frame.getContentPane().add(b3);
	}
}