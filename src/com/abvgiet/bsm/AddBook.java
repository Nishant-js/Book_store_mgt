package com.abvgiet.bsm;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
//import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JTextArea;

public class AddBook extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static AddBook frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	// private JTextField textField_9;
	// JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 503);
		contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddBook = new JLabel("Add Book");
		lblAddBook.setForeground(Color.DARK_GRAY);
		lblAddBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblBook_id = new JLabel("Book_id:");
		
		JLabel lblISBN = new JLabel("ISBN:");
		
		JLabel lblAuthor = new JLabel("Author:");
		
		JLabel lblTitle = new JLabel("Title:");
		
		JLabel lblQuantity = new JLabel("Quantity:");
		
		JLabel lblEdition = new JLabel("Edition:");
		
		JLabel lblCategory = new JLabel("Category:");
		
		JLabel lblSub_category = new JLabel("Sub_category:");
	
		JLabel lblPrice = new JLabel("Price:");
		
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Book_id=Integer.parseInt(textField.getText());
				String ISBN=textField_1.getText();
				String Author=textField_2.getText();
				String Title=textField_3.getText();
                int Quantity=Integer.parseInt(textField_4.getText());
				int Edition=Integer.parseInt(textField_5.getText());
				String Category=textField_6.getText();
				String Sub_category=textField_7.getText();
				int Price=Integer.parseInt(textField_8.getText());
				

				
				Books s=new Books(Book_id,ISBN,Author,Title,Quantity,Edition,Category,Sub_category,Price);
				int status=BooksDb.save(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(AddBook.this,"Books added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");

				}else{
					JOptionPane.showMessageDialog(AddBook.this,"Sorry, Unable to add Books!");
				}
			}
		});
		
		textField = new JTextField();
		textField.setColumns(20);
		
		textField_1 = new JTextField();
		textField_1.setColumns(20);
		
		textField_2 = new JTextField();
		textField_2.setColumns(20);
		
		textField_3 = new JTextField();
		textField_3.setColumns(20);
		
		textField_4 = new JTextField();
		textField_4.setColumns(20);
		
		textField_5 = new JTextField();
		textField_5.setColumns(20);
		
		textField_6 = new JTextField();
		textField_6.setColumns(20);
		
		textField_7 = new JTextField();
		textField_7.setColumns(20);
		
		textField_8 = new JTextField();
		textField_8.setColumns(20);
		
	
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_Books.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(142)
							.addComponent(lblAddBook))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBook_id)
								.addComponent(lblAuthor, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuantity, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEdition, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCategory, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblISBN, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQuantity, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSub_category, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
				
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField  , GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
					.addContainerGap(124, Short.MAX_VALUE))
				// .addGroup(gl_contentPane.createSequentialGroup()
				// 	.addContainerGap()
				// 	//.addComponent(lblContactNo)
				// 	.addContainerGap(356, Short.MAX_VALUE))
				// .addGroup(gl_contentPane.createSequentialGroup()
				// 	.addContainerGap()
				// 	//.addComponent(lblCountry, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
				// 	.addGap(350))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSub_category, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(383, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(btnAddBook, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap(44, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(364, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddBook)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBook_id)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblISBN)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAuthor)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitle)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantity)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEdition)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategory)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSub_category)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					// .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					// 	.addComponent(lblCountry)
					// 	.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					// .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					// 	.addComponent(lblContactNo)
					// 	.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddBook, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}

