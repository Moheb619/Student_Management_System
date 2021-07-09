package Student_Management_System;

import java.io.BufferedReader;

import java.io.FileReader;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.PrintWriter;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.*;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class Student_Management extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField ADDRESS;
	private JTextField NAME;
	private DefaultTableModel model;
	private JTable table;
	private JTextField COURSE;
	private JTextField EMAIL;
	private JTextField PHONE;

//Creating the frame
	public static void main(String[] args) throws Exception{
			
		Student_Management frame = new Student_Management();
		frame.setVisible(true);
	}

	
	public Student_Management() throws Exception{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().setPreferredSize(new Dimension(1382,754));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
//		Set Icon
		ImageIcon img = new ImageIcon("image/icon.png");   
		setIconImage(img.getImage()); 
		
//		Set Background color
		getContentPane().setBackground(new Color(179, 218, 255));
		
		JLabel lblNewLabel = new JLabel("Student Management System");
		lblNewLabel.setBackground(new Color(0, 204, 204));
		lblNewLabel.setBounds(352, 10, 443, 35);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setBounds(563, 72, 79, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("image/logo.png"));
		lblNewLabel_2.setBounds(61, 56, 406, 217);
		contentPane.add(lblNewLabel_2);
		
		ID = new JTextField();
		ID.setBounds(667, 71, 181, 20);
		contentPane.add(ID);
		ID.setColumns(10);
		
		ADDRESS = new JTextField();
		ADDRESS.setBounds(667, 133, 181, 20);
		ADDRESS.setColumns(10);
		contentPane.add(ADDRESS);
		
		NAME = new JTextField();
		NAME.setBounds(667, 102, 181, 20);
		NAME.setColumns(10);
		contentPane.add(NAME);
		
		COURSE = new JTextField();
		COURSE.setColumns(10);
		COURSE.setBounds(667, 170, 181, 20);
		contentPane.add(COURSE);
		
		EMAIL = new JTextField();
		EMAIL.setColumns(10);
		EMAIL.setBounds(667, 202, 181, 20);
		contentPane.add(EMAIL);
		
		PHONE = new JTextField();
		PHONE.setColumns(10);
		PHONE.setBounds(667, 233, 181, 20);
		contentPane.add(PHONE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 321, 1048, 217);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				ID.setText(model.getValueAt(i,0).toString());
				NAME.setText(model.getValueAt(i,1).toString());
				ADDRESS.setText(model.getValueAt(i,2).toString());
				COURSE.setText(model.getValueAt(i,3).toString());
				EMAIL.setText(model.getValueAt(i,4).toString());
				PHONE.setText(model.getValueAt(i,5).toString());
			}
		});
		model=new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		};
		Object[] column= {"Id","Name","Address","Course","Email","Phone"};
		Object[] row=new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

//Connecting JDBC
		String url="jdbc:mysql://localhost:3306/student"; 			//ip port and database name stored in the url (create a database and add a table with Id,Name,Address,Course,Email,Phone)
		String uname="root"; 										//default username root
		String pass="Abarmysql12#"; 
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement(); 
		
		ResultSet rs = st.executeQuery("SELECT*FROM details");
        while(rs.next())
		{
			 	row[0]=rs.getInt("Id");
				row[1]=rs.getString("Name");
				row[2]=rs.getString("Address");
				row[3]=rs.getString("Course");
				row[4]=rs.getString("Email");
				row[5]=rs.getString("Phone");
				model.addRow(row);
		}
	
//Adding Label
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setBounds(563, 134, 79, 14);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Student Name");
		lblNewLabel_1_2.setBounds(563, 103, 94, 14);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1_2);
		
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(ID.getText().equals("") || ADDRESS.getText().equals("") || NAME.getText().equals("") || COURSE.getText().equals("") || EMAIL.getText().equals("") || PHONE.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Please Complete the information");
				}
				else {
					row[0]=Integer.parseInt(ID.getText());
					row[1]=NAME.getText();
					row[2]=ADDRESS.getText();
					row[3]=COURSE.getText();
					row[4]=EMAIL.getText();
					row[5]=PHONE.getText();
					
					model.addRow(row);
					
					try {
						int id=Integer.parseInt(ID.getText());
						String name="'"+NAME.getText()+"'";
						String address="'"+ADDRESS.getText()+"'";
						String course="'"+COURSE.getText()+"'";
						String email="'"+EMAIL.getText()+"'";
						String phone="'"+PHONE.getText()+"'";
						String sql="INSERT INTO details VALUES ("+id+","+name.toString()+","+address+","+course+","+email+","+phone+");";
						st.executeUpdate(sql);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					
					ID.setText("");
					NAME.setText("");
					ADDRESS.setText("");
					COURSE.setText("");
					EMAIL.setText("");
					PHONE.setText("");
					JOptionPane.showMessageDialog(null,"Information Added Successfully");
				}
			}
		});
		btnNewButton.setBounds(888, 70, 94, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("Update");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(ID.getText(),i,0);
					model.setValueAt(NAME.getText(),i,1);
					model.setValueAt(ADDRESS.getText(),i,2);
					model.setValueAt(COURSE.getText(),i,3);
					model.setValueAt(EMAIL.getText(),i,4);
					model.setValueAt(PHONE.getText(),i,5);
					
					int id=Integer.parseInt(ID.getText());
					String name="'"+NAME.getText()+"'";
					String address="'"+ADDRESS.getText()+"'";
					String course="'"+COURSE.getText()+"'";
					String email="'"+EMAIL.getText()+"'";
					String phone="'"+PHONE.getText()+"'";
					
					try {
						String sql="UPDATE details SET Id="+id+",Name="+name+",Address="+address+",Course="+course+",Email="+email+",Phone="+phone+" WHERE Id="+id+";";
						st.executeUpdate(sql);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					ID.setText("");
					ADDRESS.setText("");
					NAME.setText("");
					EMAIL.setText("");
					COURSE.setText("");
					PHONE.setText("");
					JOptionPane.showMessageDialog(null,"Udpated successfully");	
				}
				else
					JOptionPane.showMessageDialog(null,"Select row to update");
			}
		});
		btnEdit.setBounds(888, 101, 94, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
					int id=Integer.parseInt(ID.getText());
					try {
						String sql="DELETE FROM details WHERE Id="+id+";";
						st.executeUpdate(sql);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					
					model.removeRow(i);
					ID.setText("");
					ADDRESS.setText("");
					NAME.setText("");
					EMAIL.setText("");
					COURSE.setText("");
					PHONE.setText("");
					JOptionPane.showMessageDialog(null,"Deleted Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null,"Select a row first");
				}
			}
		});
		btnDelete.setBounds(888, 132, 94, 23);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID.setText("");
				ADDRESS.setText("");
				NAME.setText("");
				EMAIL.setText("");
				COURSE.setText("");
				PHONE.setText("");
			}
		});
		btnClear.setBounds(888, 169, 94, 23);
		contentPane.add(btnClear);
		
		JLabel lblProduct = new JLabel("Student Details");
		lblProduct.setBounds(421, 284, 221, 35);
		lblProduct.setFont(new Font("Castellar", Font.BOLD, 21));
		contentPane.add(lblProduct);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Course");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(563, 171, 79, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Email");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(563, 203, 79, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Phone");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(563, 230, 79, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sql="DELETE FROM details";
					st.executeUpdate(sql);
					dispose();
					Student_Management s=new Student_Management();
					s.setVisible(true);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(888, 202, 94, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login l=new Login();
				l.setVisible(true);
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(50, 10, 46, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("About Us");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AboutUs a=new AboutUs();
				a.setVisible(true);
			}
		});
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(104, 10, 72, 20);
		contentPane.add(lblNewLabel_3_1);
	
	}
}