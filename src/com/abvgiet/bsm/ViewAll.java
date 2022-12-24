package com.abvgiet.bsm;

// import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
// import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
// import javax.swing.border.EmptyBorder;

public class ViewAll extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ViewAll frame;
	public ViewAll() {
		//Code to view data in JTable
		List<Books> list=BooksDb.view();
		int size=list.size();
		
		String data[][]=new String[size][9];
		int row=0;
		for(Books s:list){
			data[row][0]=String.valueOf(s.getBook_id ());
			// data[row][1]=s.getISBN();
			// data[row][1]=s.getAuthor();
			data[row][1]=s.getTitle();
			// data[row][4]=String.valueOf(s.getQuantity());
			data[row][2]=String.valueOf(s.getEdition());
			data[row][3]=s.getCategory();
			// data[row][7]=s.getSub_category();
			// data[row][8]=String.valueOf(s.getPrice());
			
			row++;
		}
		String columnNames[]={"Book_id","Title","Edition","Category"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1250, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


