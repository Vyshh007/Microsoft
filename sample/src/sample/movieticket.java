package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(73, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bookmyshow");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(175, 11, 100, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField Tb1 = new JFormattedTextField();
		Tb1.setToolTipText("enter the name");
		Tb1.setBounds(250, 47, 100, 20);
		frame.getContentPane().add(Tb1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(73, 90, 72, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"RRR", "Salaar", "Hi Nanna", "Animal"}));
		cb1.setBounds(250, 86, 100, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Tickets");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(31, 132, 152, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBackground(new Color(255, 255, 255));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(250, 135, 100, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=Tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR")) {
					bill=nt*150;
				}
				if(movie.equals("Salaar")) {
					bill=nt*200;
				}
				if(movie.equals("Hi Nanna")) {
					bill=nt*250;
				}
				if(movie.equals("Animal")) {
					bill=nt*300;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"Name "+user+" \nmovie "+movie+" \n number of tickets "+tickets+" \nbill "+bill);
				if(res==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton,"Booking Confirmed");
					Tb1.setText("");
					cb1.setSelectedItem("");	
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Booking Cancelled");

				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(261, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

