package Student_Management_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField search_bar;

	public static void main(String[] args) {
		try {
			Student frame = new Student();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public Student() throws Exception{
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(229, 11, 246, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon("image/searchbar.png"));
		lblNewLabel_1.setBounds(144, 72, 46, 40);
		contentPane.add(lblNewLabel_1);
		
		search_bar = new JTextField();
		search_bar.setToolTipText("");
		search_bar.setColumns(10);
		search_bar.setBounds(222, 72, 233, 40);
		contentPane.add(search_bar);
		
		String url="jdbc:mysql://localhost:3306/Database-name"; 			//ip port and database name stored in the url(create a database and add a table with Id,Name,Address,Course,Email,Phone)
		String uname="root"; 										//default username root
		String pass="password"; 
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();		
		JButton btnNewButton = new JButton("Search ID");
		
		btnNewButton.setBounds(222, 122, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("image/search.png"));
		lblNewLabel_2.setBounds(20, 156, 314, 229);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login l=new Login();
				l.setVisible(true);
			}
		});
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(40, 25, 46, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("About Us");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AboutUs a=new AboutUs();
				a.setVisible(true);
			}
		});
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(96, 25, 64, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Search Result");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(458, 156, 110, 23);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(382, 181, 264, 222);
		textArea.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textArea);
		textArea.setVisible(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id=Integer.parseInt(search_bar.getText());
					String sql="SELECT Id,Name,Address,Course,Email,Phone FROM details WHERE Id="+id+";";
					ResultSet rs=st.executeQuery(sql);
						if(rs.next())
						{
							lblNewLabel_5.setVisible(true);
							textArea.setVisible(true);
							String result="\n"+"   Id           :  "+rs.getInt("Id")+"\n\n"+"   Name     :  "+rs.getString("Name")+"\n\n"+"   Address :  "+rs.getString("Address")+"\n\n"+"   Course   :  "+rs.getString("Course")+"\n\n"+"   Email      :  "+rs.getString("Email")+"\n\n"+"   Phone    :  "+rs.getString("Phone");
							textArea.setText(result);						
							search_bar.setText("");
							
						}
						else {
							lblNewLabel_5.setVisible(false);
							textArea.setVisible(false);
							search_bar.setText("");
							JOptionPane.showInternalMessageDialog(null, "No ID found", "Not Found", JOptionPane.WARNING_MESSAGE);
						}
						
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_5.setVisible(false);
				textArea.setText("");
				textArea.setVisible(false);
				search_bar.setText("");
			}
		});
		btnClear.setBounds(366, 121, 89, 23);
		contentPane.add(btnClear);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("image/searchlogo.png"));
		lblNewLabel_3.setBounds(0, 0, 692, 430);
		contentPane.add(lblNewLabel_3);
	}
}
