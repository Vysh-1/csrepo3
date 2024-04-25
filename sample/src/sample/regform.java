package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class regform {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regform window = new regform();
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
	public regform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 469, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(101, 23, 239, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NUMBER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(39, 62, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 99, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(39, 124, 59, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(39, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(39, 226, 68, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		t1 = new JTextField();
		t1.setBounds(138, 59, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextField t2 = new JTextField();
		t2.setBounds(138, 97, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "CSE_CS", "CSE_IOT", "MECH"}));
		cb1.setBounds(138, 124, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(Color.RED);
		r1.setBounds(135, 173, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(Color.RED);
		r2.setBounds(265, 173, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(Color.RED);
		c1.setBounds(138, 222, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(Color.RED);
		c2.setBounds(243, 222, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(Color.RED);
		c3.setBounds(350, 222, 97, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup ();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String roll=t1.getText();
			String name=t2.getText();
			String branch=(String)cb1.getSelectedItem();
			String gender=" ";
			String langs=" ";
			if(r1.isSelected())
			{
				gender="Male";
			}
			if(r2.isSelected())
			{
				gender="Female";
			}
			if(c1.isSelected())
			{
				langs+="c";
			}
			if(c2.isSelected())
			{
				langs+="java";

			}
			if(c3.isSelected())
			{
				langs+="Python";
			}
			
			JOptionPane.showMessageDialog(btnNewButton,"ROLL: "+roll+"\n NAME"+name+"\n BRANCH"+branch+"\n GENDER :"+gender+"\n PROG LANGS"+langs);
		
			}
		
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setBounds(191, 289, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
