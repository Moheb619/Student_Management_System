package Student_Management_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class AboutUs extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		try {
			AboutUs frame = new AboutUs();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public AboutUs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1111, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("About Us (Group-1)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(387, 36, 328, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Team Leader");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(132, 90, 188, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("image/Moheb.png"));
		lblNewLabel_2.setBounds(63, 135, 295, 279);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name   : Saeed Hossain Moheb");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_3.setBounds(104, 425, 275, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Roll       : 2054901050");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(104, 449, 275, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sec        : A");
		lblNewLabel_3_2.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_3_2.setBounds(104, 474, 275, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Other Members");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(765, 90, 235, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("image/Mahbub.png"));
		lblNewLabel_4.setBounds(701, 152, 76, 65);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("image/Jafrin.png"));
		lblNewLabel_4_1.setBounds(701, 229, 76, 65);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon("image/Nushrat.png"));
		lblNewLabel_4_2.setBounds(701, 305, 76, 65);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon("image/Neha.png"));
		lblNewLabel_4_3.setBounds(701, 394, 76, 65);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5 = new JLabel("Name: Muhammad Mahbub Sarwar Shafi");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(809, 162, 248, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Roll: 2054901049");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(809, 183, 248, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Sec: A");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(809, 203, 248, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name: Jafrin Akter Alo");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(809, 235, 248, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Roll: 2054901035");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2.setBounds(809, 260, 248, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Sec: A");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1_1.setBounds(809, 280, 248, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Name: Nushrat Sharmin");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1_1.setBounds(809, 305, 248, 14);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Roll: 19511007");
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2_1.setBounds(809, 330, 248, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Sec: B");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1_1_1.setBounds(809, 356, 248, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Name: Sidratul Muntaha Neha");
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1_1_1.setBounds(809, 400, 248, 14);
		contentPane.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Roll: 2054901029");
		lblNewLabel_6_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2_1_1.setBounds(809, 425, 248, 14);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("Sec: A");
		lblNewLabel_6_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1_1_2.setBounds(809, 449, 248, 14);
		contentPane.add(lblNewLabel_6_1_1_2);
		
		JLabel lblNewLabel_7 = new JLabel("----------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_7.setFont(new Font("TonnyBanglaMJ", Font.BOLD, 11));
		lblNewLabel_7.setBounds(701, 218, 356, 8);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_7_1.setFont(new Font("TonnyBanglaMJ", Font.BOLD, 11));
		lblNewLabel_7_1.setBounds(701, 297, 356, 8);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_7_2.setFont(new Font("TonnyBanglaMJ", Font.BOLD, 11));
		lblNewLabel_7_2.setBounds(701, 375, 356, 8);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("image/aboutlogo.png"));
		lblNewLabel_8.setBounds(387, 184, 274, 230);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Login");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login l=new Login();
				l.setVisible(true);
			}
		});
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setBounds(103, 25, 56, 34);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("image/aboutbg.png"));
		lblNewLabel_10.setBounds(0, 0, 1095, 535);
		contentPane.add(lblNewLabel_10);
	}
}
