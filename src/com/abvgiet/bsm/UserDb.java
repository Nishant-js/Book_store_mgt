package com.abvgiet.bsm;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDb {
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsm","root","3345");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from User_info where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
	public static int save(User a){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into User_info(name,password,contact) values(?,?,?)");
			ps.setString(1,a.getName());
			ps.setString(2,a.getPassword());
			ps.setString(3,a.getcontact());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<User> view(){
		List<User> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from User_info");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User a=new User();
				// a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPassword(rs.getString(3));
				a.setcontact(rs.getString(4));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static int delete(User x){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("delete from User_info where name=?");
			ps.setString(1,x.getName());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}

