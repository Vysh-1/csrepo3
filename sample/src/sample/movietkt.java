package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movietkt {

	protected static final int YES = 0;
	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietkt window = new movietkt();
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
	public movietkt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(109, 22, 248, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(72, 68, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(72, 109, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(72, 153, 115, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(198, 65, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "TILLU SQUARE", "GUNTUR KARAM"}));
		cb1.setBounds(197, 109, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb2.setBounds(197, 149, 87, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("BOOK TICKET");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill+=nt*200;
				}
				else if(movie.equals("TILLU SQUARE"))
				{
					bill+=nt*300;
				}
				else
				{
					bill+=nt*150;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(b1,"NAME : "+name+"\n MOVIE NAME :"+movie+"\n NUMBER OF TICKETS :"+nt+"\n AMOUNT :"+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(b1,"BOOKING CONFIRMED");
					
				}
				else
				{
					JOptionPane.showMessageDialog(b1,"BOOKING CANCELLED");
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		b1.setBounds(121, 203, 133, 23);
		
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\71fbdVaXfpL._AC_UF1000,1000_QL80_.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
