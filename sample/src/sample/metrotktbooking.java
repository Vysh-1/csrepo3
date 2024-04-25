package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;

public class metrotktbooking {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrotktbooking window = new metrotktbooking();
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
	public metrotktbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(182, 11, 137, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("source");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(84, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("destination");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(76, 145, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("number of tickets");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(46, 198, 126, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(84, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(139, 310, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(182, 51, 126, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KOTHAGUDEM", "KARIMNAGAR", "ZAMBIA", "US"}));
		comboBox.setBounds(182, 101, 126, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("date");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(73, 244, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1713810600000L), new Date(1713810600000L), null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(182, 241, 126, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_1.setBounds(182, 195, 126, 20);
		frame.getContentPane().add(spinner_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "VIJAYAWADA", "VRINDAVAN", "ANNAVARAM", "TIRUPATHI"}));
		comboBox_1.setBounds(182, 141, 126, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\m1.jpg"));
		lblNewLabel_6.setBounds(0, 0, 434, 402);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
