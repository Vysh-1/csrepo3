package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class stud {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stud window = new stud();
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
	public stud() {
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
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(87, 29, 249, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(53, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("roll number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(53, 111, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("marks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(53, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("branch");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(53, 149, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(177, 73, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(177, 108, 96, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(177, 145, 86, 22);
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(177, 175, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton b1 = new JButton("sumbit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try {
					 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values('"+name+"','"+roll+"',"+"'"+branch+"','"+m+"')";
					Statement stn=con.createStatement();
					stn.executeUpdate(q);
					JOptionpane.showMessageDialog(b1,"inserted successfully");
					con.close();
				
				
				
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(138, 216, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\ui.jpg"));
		lblNewLabel_5.setBounds(-274, -21, 698, 561);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
