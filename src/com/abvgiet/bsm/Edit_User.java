package com.abvgiet.bsm;


// import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
// import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
// import java.util.List;
import java.awt.event.ActionEvent;

public class Edit_User extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Edit_User frame;
	private JPanel contentPane;
	JScrollPane sp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Edit_User();
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
	public Edit_User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JLabel lblEdit_User = new JLabel("User Modification");
		lblEdit_User.setForeground(Color.DARK_GRAY);
		lblEdit_User.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnAdd_User = new JButton("Add User");
		btnAdd_User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_User.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnDelete_User = new JButton("Delete User");
		btnDelete_User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_User.main(new String[]{});
				frame.dispose();

			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start_page.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(161)
							.addComponent(lblEdit_User))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(149)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDelete_User, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd_User, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(136, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblEdit_User)
					.addGap(29)
					.addComponent(btnAdd_User, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDelete_User, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
