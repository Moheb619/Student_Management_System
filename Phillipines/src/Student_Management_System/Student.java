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
import javax.swing.JSlider;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/6mohe/Desktop/image/icon.png"));
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
		lblNewLabel_1.setIcon(new ImageIcon("C:/Users/6mohe/Desktop/image/searchbar.png"));
		lblNewLabel_1.setBounds(144, 72, 46, 40);
		contentPane.add(lblNewLabel_1);
		
		search_bar = new JTextField();
		search_bar.setToolTipText("");
		search_bar.setColumns(10);
		search_bar.setBounds(222, 72, 233, 40);
		contentPane.add(search_bar);
		
		String url="jdbc:mysql://localhost:3306/databasename"; 			//ip port and database name stored in the url
		String uname="username"; 										//default username root
		String pass="password"; 
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();		
		JButton btnNewButton = new JButton("Search ID");
		
		btnNewButton.setBounds(222, 122, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\6mohe\\Desktop\\image\\search.png"));
		lblNewLabel_2.setBounds(20, 156, 314, 229);
		contentPane.add(lblNewLabel_2);
		
		JLabel UserID = new JLabel("ID             :");
		UserID.setForeground(Color.WHITE);
		UserID.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserID.setBounds(400, 180, 75, 14);
		contentPane.add(UserID);
		UserID.setVisible(false);
		
		JLabel UserName = new JLabel("Name       :");
		UserName.setForeground(Color.WHITE);
		UserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserName.setBounds(400, 212, 75, 14);
		contentPane.add(UserName);
		UserName.setVisible(false);
		
		JLabel UserAddress = new JLabel("Address   :");
		UserAddress.setForeground(Color.WHITE);
		UserAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserAddress.setBounds(400, 248, 75, 14);
		contentPane.add(UserAddress);
		UserAddress.setVisible(false);
		
		JLabel UserCourse = new JLabel("Course     :");
		UserCourse.setForeground(Color.WHITE);
		UserCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserCourse.setBounds(400, 280, 75, 14);
		contentPane.add(UserCourse);
		UserCourse.setVisible(false);
		
		JLabel UserEmail = new JLabel("Email        :");
		UserEmail.setForeground(Color.WHITE);
		UserEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserEmail.setBounds(400, 315, 75, 14);
		contentPane.add(UserEmail);
		UserEmail.setVisible(false);
		
		JLabel UserPhone = new JLabel("Phone      :");
		UserPhone.setForeground(Color.WHITE);
		UserPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserPhone.setBounds(400, 353, 75, 14);
		contentPane.add(UserPhone);
		UserPhone.setVisible(false);
		
		JLabel UserIDget = new JLabel("");
		UserIDget.setForeground(Color.WHITE);
		UserIDget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserIDget.setBounds(479, 180, 208, 14);
		contentPane.add(UserIDget);
		UserIDget.setVisible(false);
		
		JLabel UserNameget = new JLabel("");
		UserNameget.setForeground(Color.WHITE);
		UserNameget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserNameget.setBounds(479, 212, 208, 14);
		contentPane.add(UserNameget);
		UserNameget.setVisible(false);
		
		JLabel UserAddressget = new JLabel("");
		UserAddressget.setForeground(Color.WHITE);
		UserAddressget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserAddressget.setBounds(479, 248, 208, 14);
		contentPane.add(UserAddressget);
		UserAddressget.setVisible(false);
		
		JLabel UserCourseget = new JLabel("");
		UserCourseget.setForeground(Color.WHITE);
		UserCourseget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserCourseget.setBounds(479, 280, 208, 14);
		contentPane.add(UserCourseget);
		UserCourseget.setVisible(false);
		
		JLabel UserEmailget = new JLabel("");
		UserEmailget.setForeground(Color.WHITE);
		UserEmailget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserEmailget.setBounds(479, 315, 208, 14);
		contentPane.add(UserEmailget);
		UserEmailget.setVisible(false);
		
		JLabel UserPhoneget = new JLabel("");
		UserPhoneget.setForeground(Color.WHITE);
		UserPhoneget.setFont(new Font("Tahoma", Font.BOLD, 13));
		UserPhoneget.setBounds(479, 349, 208, 18);
		contentPane.add(UserPhoneget);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserID.setVisible(false);
				UserName.setVisible(false);
				UserAddress.setVisible(false);
				UserCourse.setVisible(false);
				UserEmail.setVisible(false);
				UserPhone.setVisible(false);
				UserIDget.setVisible(false);
				UserNameget.setVisible(false);
				UserAddressget.setVisible(false);
				UserCourseget.setVisible(false);
				UserEmailget.setVisible(false);
				UserPhoneget.setVisible(false);
				
				search_bar.setText("");
			}
		});
		btnClear.setBounds(366, 121, 89, 23);
		contentPane.add(btnClear);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\6mohe\\Desktop\\image\\searchlogo.png"));
		lblNewLabel_3.setBounds(0, 0, 692, 430);
		contentPane.add(lblNewLabel_3);
		UserPhoneget.setVisible(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id=Integer.parseInt(search_bar.getText());
					String sql="SELECT Id,Name,Address,Course,Email,Phone FROM details WHERE Id="+id+";";
					ResultSet rs=st.executeQuery(sql);
						if(rs.next())
						{
							UserIDget.setText(String.valueOf(rs.getInt("Id")));
							UserNameget.setText(rs.getString("Name"));
							UserAddressget.setText(rs.getString("Address"));
							UserCourseget.setText(rs.getString("Course"));
							UserEmailget.setText(rs.getString("Email"));
							UserPhoneget.setText(rs.getString("Phone"));
							
							UserID.setVisible(true);
							UserName.setVisible(true);
							UserAddress.setVisible(true);
							UserCourse.setVisible(true);
							UserEmail.setVisible(true);
							UserPhone.setVisible(true);
							UserIDget.setVisible(true);
							UserNameget.setVisible(true);
							UserAddressget.setVisible(true);
							UserCourseget.setVisible(true);
							UserEmailget.setVisible(true);
							UserPhoneget.setVisible(true);
							
							search_bar.setText("");
							
						}
						else {
							UserID.setVisible(false);
							UserName.setVisible(false);
							UserAddress.setVisible(false);
							UserCourse.setVisible(false);
							UserEmail.setVisible(false);
							UserPhone.setVisible(false);
							UserIDget.setVisible(false);
							UserNameget.setVisible(false);
							UserAddressget.setVisible(false);
							UserCourseget.setVisible(false);
							UserEmailget.setVisible(false);
							UserPhoneget.setVisible(false);
							search_bar.setText("");
							JOptionPane.showInternalMessageDialog(null, "No ID found", "Not Found", JOptionPane.WARNING_MESSAGE);
						}
						
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}
}
