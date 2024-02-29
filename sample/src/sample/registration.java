package sample;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

//import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
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
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(180, 11, 139, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(73, 50, 85, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(73, 87, 85, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(250, 47, 95, 20);
		frame.getContentPane().add(tb1);
		
		JFormattedTextField p1 = new JFormattedTextField();
		p1.setBounds(250, 84, 95, 20);
		frame.getContentPane().add(p1);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(73, 129, 85, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT", "EEE", "CSE-DS", "AIML"}));
		cb1.setBounds(250, 125, 95, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(73, 164, 69, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(230, 154, 59, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(312, 154, 59, 23);
		frame.getContentPane().add(r2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_5.setBounds(73, 194, 46, 18);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Hyd", "Knr"}));
		cb2.setBounds(250, 190, 95, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem();
				String gender="" ;
				if(r1.isSelected()) {
					gender="Male";
				}
				if(r2.isSelected()) {
					gender="Female";
				}
				
				JOptionPane.showMessageDialog(b1 ,"name "+user+"\n branch "+branch+"\n city "+city+"\n gender "+gender);
			
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		b1.setBounds(156, 227, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\f1.jpg"));
		lblNewLabel_6.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
