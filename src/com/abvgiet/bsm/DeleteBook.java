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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
// import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class DeleteBook extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static DeleteBook frame;
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
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DeleteBook();
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
	public DeleteBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
        JLabel lblBook_id = new JLabel("Book_id:");
		
		JLabel lblISBN = new JLabel("ISBN:");
		
		JLabel lblAuthor = new JLabel("Author:");
		
		JLabel lblTitle = new JLabel("Title:");
		
		JLabel lblQuantity = new JLabel("Quantity:");
		
		JLabel lblEdition = new JLabel("Edition:");
		
		JLabel lblCategory = new JLabel("Category:");
		
		JLabel lblSub_category = new JLabel("Sub_category:");
	
		JLabel lblPrice = new JLabel("Price:");
		
		
		JButton btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.addActionListener(new ActionListener() {
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
				int status=BooksDb.delete(s);
				
                if(status>0){
					JOptionPane.showMessageDialog(DeleteBook.this,"Book deleted successfully!");
					DeleteBook.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(DeleteBook.this,"Sorry, Unable to Delete Book!");
				}
				
               
			}
		});
		
		textField = new JTextField();
        textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		// textField_9 = new JTextField();
		// textField_9.setColumns(10);
		
		// textArea = new JTextArea();
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_Books.main(new String[]{});
				frame.dispose();
			}
		});
		
		//JLabel lblBook_id = new JLabel("Roll No:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JSeparator separator = new JSeparator();
		
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sBook_id=textField_10.getText();
				if(sBook_id==null||sBook_id.trim().equals("")){
					JOptionPane.showMessageDialog(DeleteBook.this,"Please enter Book_id first!");
				}else{
				int Book_id=Integer.parseInt(sBook_id);
				Books s=BooksDb.getBookByBook_id(Book_id);
				textField.setText(String.valueOf((s.getBook_id())));
				textField_1.setText(s.getISBN());
				textField_2.setText(s.getAuthor());
				textField_3.setText(s.getTitle());
				textField_4.setText(String.valueOf(s.getQuantity()));
				textField_5.setText(String.valueOf(s.getEdition()));
				textField_6.setText(s.getCategory());
				textField_7.setText(s.getSub_category());
				textField_8.setText(String.valueOf((s.getPrice())));
	}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)

						.addComponent(lblBook_id, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblISBN, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAuthor, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuantity, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEdition, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCategory, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSub_category, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)


						// .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						// 	.addComponent(lblBook_id, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						// 	.addComponent(lblISBN, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        )
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							// .addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							// .addComponent(textArea))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(btnLoadRecord)))
					// .addContainerGap()
                    )
				// .addGroup(gl_contentPane.createSequentialGroup()
				// 	.addContainerGap()
				// 	.addComponent(lblContactNo)
				// 	.addContainerGap(356, Short.MAX_VALUE))
				// .addGroup(gl_contentPane.createSequentialGroup()
				// 	.addContainerGap()
				// 	.addComponent(lblCountry, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
				// 	.addGap(350)
                )
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSub_category, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(383, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(btnDeleteBook, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap(78, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(364, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBook_id)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLoadRecord))
					.addGap(16)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
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
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSub_category)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)




					// //.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					// 	//.addComponent(lblCategory)
					// 	// .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    //     )
					// .addPreferredGap(ComponentPlacement.UNRELATED)
					// .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
					// 	.addGroup(gl_contentPane.createSequentialGroup()
					// 		.addComponent(lblSub_category)
					// 		.addGap(18))
					// 	.addGroup(gl_contentPane.createSequentialGroup()
					// 		.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					// 		.addPreferredGap(ComponentPlacement.UNRELATED)))
					// .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					// 	.addComponent(lblPrice)
					// 	.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					// .addPreferredGap(ComponentPlacement.UNRELATED)
					// //.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					// 	// .addComponent(lblCountry)
					// 	//.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					// //.addPreferredGap(ComponentPlacement.UNRELATED)
					// .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					// 	// .addComponent(lblContactNo)
					// 	// .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    //     )
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDeleteBook, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}


