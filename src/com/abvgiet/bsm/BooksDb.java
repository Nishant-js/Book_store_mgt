package com.abvgiet.bsm;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.sql.*;

// import javax.swing.JOptionPane;

// import com.mysql.cj.util.Util;

public class BooksDb {

	public static int save(Books s){
		int status=0;
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Books(Book_id,ISBN,Author,Title,Quantity,Edition,Category,Sub_category,Price) values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,s.getBook_id());
            ps.setString(2,s.getISBN() );
            ps.setString(3,s.getAuthor() );
            ps.setString(4,s.getTitle() );
            ps.setInt(5,s.getQuantity());
            ps.setInt(6,s.getEdition());
            ps.setString(7,s.getCategory() );
            ps.setString(8,s.getSub_category() );
            ps.setInt(9,s.getPrice());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}



	public static int update(Books s){
		int status=0;
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("update Books set ISBN=?,Author=?,Title=?,Quantity=?,Edition=?,Category=?,Sub_category=?,Price=? where Book_id=?");
			ps.setInt(9,s.getBook_id());
            ps.setString(1,s.getISBN() );
            ps.setString(2,s.getAuthor() );
            ps.setString(3,s.getTitle() );
            ps.setInt(4,s.getQuantity());
            ps.setInt(5,s.getEdition());
            ps.setString(6,s.getCategory() );
            ps.setString(7,s.getSub_category() );
            ps.setInt(8,s.getPrice() );
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Books> view(){
		List<Books> list=new ArrayList<Books>();
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("select * from Books");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Books s=new Books();
				s.setBook_id(rs.getInt("Book_id"));
				s.setISBN(rs.getString("ISBN"));
				s.setAuthor(rs.getString("Author"));
				s.setTitle(rs.getString("Title"));
				s.setQuantity(rs.getInt("Quantity"));
				s.setEdition(rs.getInt("Edition"));
				s.setCategory(rs.getString("Category"));
				s.setSub_category(rs.getString("Sub_category"));
				s.setPrice(rs.getInt("Price"));
				// s.setState(rs.getString("state"));
				// s.setCountry(rs.getString("country"));
				// s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
    
	/**
	 * @param Book_id
	 * @return
	 */
	public static Books getBookByBook_id(int Book_id){
		Books s=new Books();
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("select * from books where book_id=?");
			ps.setInt(1,Book_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setBook_id(rs.getInt("Book_id"));
				s.setISBN(rs.getString("ISBN"));
				s.setAuthor(rs.getString("Author"));
				s.setTitle(rs.getString("Title"));
				s.setQuantity(rs.getInt("Quantity"));
				s.setEdition(rs.getInt("Edition"));
				s.setCategory(rs.getString("Category"));
				s.setSub_category(rs.getString("Sub_category"));
				s.setPrice(rs.getInt("Price"));
				// s.setState(rs.getString("state"));
				// s.setCountry(rs.getString("country"));
				// s.setContactno(rs.getString("contactno"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}



	public static int delete(Books s){
		int status=0;
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("delete from Books where Book_id=?");
			ps.setInt(1,s.getBook_id());
            // ps.setString(1,s.getISBN() );
            // ps.setString(2,s.getAuthor() );
            // ps.setString(3,s.getTitle() );
            // ps.setInt(4,s.getQuantity());
            // ps.setInt(5,s.getEdition());
            // ps.setString(6,s.getCategory() );
            // ps.setString(7,s.getSub_category() );
            // ps.setInt(8,s.getPrice() );
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static List<Books> viewSelected(Books a){
		List<Books> list=new ArrayList<Books>();
		try{
			Connection con=UserDb.getCon();
			PreparedStatement ps=con.prepareStatement("select * from Books where title like '%?%'");
			ps.setString(1, a.getTitle());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Books s=new Books();
				s.setBook_id(rs.getInt("Book_id"));
				s.setISBN(rs.getString("ISBN"));
				s.setAuthor(rs.getString("Author"));
				s.setTitle(rs.getString("Title"));
				s.setQuantity(rs.getInt("Quantity"));
				s.setEdition(rs.getInt("Edition"));
				s.setCategory(rs.getString("Category"));
				s.setSub_category(rs.getString("Sub_category"));
				s.setPrice(rs.getInt("Price"));
				// s.setState(rs.getString("state"));
				// s.setCountry(rs.getString("country"));
				// s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}

