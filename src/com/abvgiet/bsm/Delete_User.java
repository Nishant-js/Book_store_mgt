package com.abvgiet.bsm;


// import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// import java.awt.Font;
import java.awt.Color;
// import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
// import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// import javax.swing.JTextArea;
// import javax.swing.JSeparator;

public class Delete_User extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Delete_User frame;
	private JPanel contentPane;
	private JTextField textField;
	// private JTextField textField_1;
	// private JTextField textField_2;
	// private JTextField textField_3;
	// private JTextField textField_4;
	// private JTextField textField_5;
	// private JTextField textField_6;
	// private JTextField textField_7;
	// private JTextField textField_8;
	// private JTextField textField_9;
	// JTextArea textArea;
	// private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Delete_User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Delete_User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
        // JLabel lblUsername1 = new JLabel("Username1:");
		JLabel lblDelete_User=new JLabel("Enter Name of User to be deleted");
		
		// JLabel lblISBN = new JLabel("ISBN:");
		
		// JLabel lblAuthor = new JLabel("Author:");
		
		// JLabel lblTitle = new JLabel("Title:");
		
		// JLabel lblQuantity = new JLabel("Quantity:");
		
		// JLabel lblEdition = new JLabel("Edition:");
		
		// JLabel lblCategory = new JLabel("Category:");
		
		// JLabel lblSub_category = new JLabel("Sub_category:");
	
		// JLabel lblPrice = new JLabel("Price:");
		
		
		JButton btnDelete_User = new JButton("Delete User");
		btnDelete_User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//  int Username1=Integer.parseInt(textField.getText());
				String Username1=textField.getText();
				// String Author=textField_2.getText();
				// String Title=textField_3.getText();
                // int Quantity=Integer.parseInt(textField_4.getText());
				// int Edition=Integer.parseInt(textField_5.getText());
				// String Category=textField_6.getText();
				// String Sub_category=textField_7.getText();
				// int Price=Integer.parseInt(textField_8.getText());

            
				
				User s=new User(Username1);
				int status=UserDb.delete(s);
				
                if(status>0){
					JOptionPane.showMessageDialog(Delete_User.this,"User deleted successfully!");
					Delete_User.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(Delete_User.this,"Sorry, Unable to Delete User!");
				}
				
               
			}
		});
		
		textField = new JTextField();
        textField.setEditable(true);
		textField.setColumns(10);
		
		// textField_1 = new JTextField();
		// textField_1.setColumns(10);
		
		// textField_2 = new JTextField();
		// textField_2.setColumns(10);
		
		// textField_3 = new JTextField();
		// textField_3.setColumns(10);
		
		// textField_4 = new JTextField();
		// textField_4.setColumns(10);
		
		// textField_5 = new JTextField();
		// textField_5.setColumns(10);
		
		// textField_6 = new JTextField();
		// textField_6.setColumns(10);
		
		// textField_7 = new JTextField();
		// textField_7.setColumns(10);
		
		// textField_8 = new JTextField();
		// textField_8.setColumns(10);
		
		// textField_9 = new JTextField();
		// textField_9.setColumns(10);
		
		// textArea = new JTextArea();
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_User.main(new String[]{});
				frame.dispose();
			}
		});
		
		//JLabel lblUsername1 = new JLabel("Roll No:");
		
		// textField_10 = new JTextField();
		// textField_10.setColumns(10);
		
//		JSeparator separator = new JSeparator();
		
		// JButton btnLoadRecord = new JButton("Load Record");
		// btnLoadRecord.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent arg0) {
		// 		String sUsername1=textField_10.getText();
		// 		if(sUsername1==null||sUsername1.trim().equals("")){
		// 			JOptionPane.showMessageDialog(Delete_User.this,"Please enter Username1 first!");
		// 		}else{
		// 		int Username1=Integer.parseInt(sUsername1);
		// 		User s=UserDb.getBookByUsername1(Username1);
		// 		textField.setText(String.valueOf((s.getUsername1())));
				// textField_1.setText(s.getISBN());
				// textField_2.setText(s.getAuthor());
				// textField_3.setText(s.getTitle());
				// textField_4.setText(String.valueOf(s.getQuantity()));
				// textField_5.setText(String.valueOf(s.getEdition()));
				// textField_6.setText(s.getCategory());
				// textField_7.setText(s.getSub_category());
				// textField_8.setText(String.valueOf((s.getPrice())));
	// }
			// }
		// });
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDelete_User, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
							.addComponent(lblDelete_User)))
					.addContainerGap(210, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblDelete_User)
					.addGap(42)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnDelete_User, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}


