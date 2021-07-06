package Student_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Login frame = new Login();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(362, 109, 79, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(276, 184, 35, 34);
		contentPane.add(lblNewLabel_1);
		
		JComboBox User = new JComboBox();
		
		User.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Student"}));
		User.setBounds(340, 193, 112, 22);
		contentPane.add(User);
		
		JLabel UserPasswordLabel = new JLabel("Password");
		UserPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UserPasswordLabel.setBounds(242, 233, 88, 34);
		contentPane.add(UserPasswordLabel);
		
		UserPassword = new JTextField();
		UserPassword.setBounds(340, 243, 112, 20);
		contentPane.add(UserPassword);
		UserPassword.setColumns(10);
		
		User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(User.getSelectedItem().toString().equals("Student")) {
					UserPassword.setVisible(false);
					UserPasswordLabel.setVisible(false);
				}
				else {
					UserPassword.setVisible(true);
					UserPasswordLabel.setVisible(true);
				}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Student Management");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(242, 57, 343, 43);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(User.getSelectedItem().toString().equals("Admin")) {
					if(UserPassword.getText().equals("1234")) {
						dispose();
						try {
							Student_Management s=new Student_Management();
							s.setVisible(true);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
					else {
						UserPassword.setText("");
						JOptionPane.showInternalMessageDialog(null, "You Entered Wrong Password", "Wrong Password", JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					dispose();
					try {
						Student s=new Student();
						s.setVisible(true);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(496, 193, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("About Us");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AboutUs a=new AboutUs();
				a.setVisible(true);
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(242, 111, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("image/login.png"));
		lblNewLabel_3.setBounds(0, 0, 784, 447);
		contentPane.add(lblNewLabel_3);
	}
}