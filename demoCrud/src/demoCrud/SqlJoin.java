package demoCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlJoin {

	public static void main(String[] args) throws Exception{
//		innerJoin();
//		System.out.println("\n");
//		System.out.println("\n");
//		leftJoin();
//		System.out.println("\n");
//		System.out.println("\n");
		rightJoin();
//		System.out.println("\n");
//		System.out.println("\n");
//		fullJoin();
	}
	public static void innerJoin() throws Exception{
		String query="select employee.*, salary.sal from employee inner join salary on employee.emp_id=salary.emp_id"+"\n";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+"\n");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void leftJoin() throws Exception{
		String query="select employee.*, salary.sal from employee left join salary on employee.emp_id=salary.emp_id"+"\n";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+"\n");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void rightJoin() throws Exception{
		String query="select employee.emp_name,employee.emp_id, salary.* from employee right join salary on employee.emp_id=salary.emp_id"+"\n";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getDouble(5)+"\n");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void fullJoin() throws Exception{
		String query="select * from employee left join salary on employee.emp_id=salary.emp_id "
				+ "union "
				+ "select * from employee right join salary on employee.emp_id=salary.emp_id";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getDouble(8)+"\n");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
}
