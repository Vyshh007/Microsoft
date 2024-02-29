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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(126, 11, 223, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(45, 53, 79, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(45, 94, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(256, 53, 106, 20);
		frame.getContentPane().add(tb1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Kukatpally", "Ameerpet", "L.B Nagar", "Moosapet", "Lingampally", "Balanagar"}));
		cb1.setBounds(256, 90, 106, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(255, 0, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(45, 136, 95, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Balanagar", "Bharath Nagar", "Erragadda", "Lingampally", "Kukatpally", "Ameerpet"}));
		cb2.setBounds(256, 137, 106, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("No.of Tickets");
		lblNewLabel_4.setForeground(new Color(255, 0, 128));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(45, 174, 133, 18);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(256, 170, 106, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination))
				{
				 JOptionPane.showMessageDialog(btnNewButton,"please check stations" );
				}
				else
				{
					bill=bill+45*nt;
					JOptionPane.showMessageDialog(btnNewButton,"name "+name+"\nsource "+source+"\ndestination "+destination+"\nnoof tickets "+nt+"\n bill "+bill );
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(260, 216, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\m1.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
