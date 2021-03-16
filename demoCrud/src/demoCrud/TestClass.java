package demoCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestClass {

	public String name;
	public static void main(String args[]) throws Exception{
		add(8,"ddd",122);		
//		selectInfo(3);
//		deleteInfo(4);
//		updateInfo(2,"green",14);
		selectAll();
		selectAtDemand();
		
	}
	
	public static int rowCounter() {
		String query="Select count(*) from userDetails";
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				return rs.getInt(1);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void selectAtDemand() throws Exception{
		String query="SELECT min(y.age) from (select * from userDetails order by distinct (age+0) desc limit 3) as y";
//		String query="select * from(\n" + 
//				"select sno, name, age, dense_rank() \n" + 
//				"over(order by age desc)r from userDetails) \n" + 
//				"where r=&3;";
		try {
//			totalRows=rowCounter();
			int result=0;
//			totalRows=0;
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement preparedStatement = con.prepareStatement(query);
//			Statement st=con.createStatement();
//			int result=st.executeUpdate(query);
			ResultSet rs=preparedStatement.executeQuery();
//			selectAll();
			while(rs.next()) {
//				result=;
				System.out.println("the desired largest is "+rs.getInt(1));
			}
//			if(result>totalRows) {
//				System.out.println("invalid");
//			}
//			else {
//			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectAll() {
		String query="SELECT * from userDetails";
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement preparedStatement = con.prepareStatement(query);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				System.out.println();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void add(int sno,String name,int age) throws Exception
	{		
		try {
			String query="INSERT INTO userDetails values('"+sno+"','"+name+"','"+age+"')";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			Statement st=con.createStatement();
			if(!st.execute(query)) {
				System.out.println("inserted");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void selectInfo(int sno) throws Exception{
		String query="SELECT * from userDetails where sno='"+sno+"'";
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement preparedStatement = con.prepareStatement(query);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateInfo(int sno,String name,int age) throws Exception{
		String query="update userDetails set name='"+name+"', age='"+age+"' where sno='"+sno+"'";
//		String query="update userDetails set name=? where sno=?";
		try {
			System.out.println("before updating");
			selectAll();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate();
			System.out.println("after updating");
			selectAll();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteInfo(int sno) throws Exception{
		String query="DELETE from userDetails where sno='"+sno+"'";
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			Statement st=con.createStatement();
			int result=st.executeUpdate(query);
//			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
