package demoCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NewSqlJoin {

	public static void main(String args[]) throws Exception{
		fun1();
		System.out.println();
		fun2();
		System.out.println();
		fun3();
		System.out.println();
		fun4();
		
	}
	
	public static void fun1() throws Exception{
		
		String query="select employee.*, organisation.org_name from (employee inner join organisation on employee.org_id=organisation.org_id) where employee.emp_joining BETWEEN '2021/01/21' AND '2021/03/21'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newTestDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getInt(5)+" "+rs.getString(6)+"\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void fun2() throws Exception{
		
		String query="select salary.sal from ((employee join salary on employee.emp_id=salary.emp_id) join organisation on organisation.org_id=employee.org_id) where organisation.org_name='brsofttech' and employee.emp_name='amit'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newTestDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getDouble(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void fun3() throws Exception{

		String query="select min(a.sal) from (select distinct salary.sal from salary inner join\n" + 
				" (select emp.emp_id, org.org_name from employee emp inner join organisation org on emp.org_id=org.org_id) as b\n" + 
				" ON \n" + 
				" b.emp_id=salary.emp_id where b.org_name='infosis' limit 2) as a";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newTestDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getDouble(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void fun4() throws Exception{
		
//		String query="select e.emp_joining from employee e inner join salary s on s.emp_id=e.emp_id where e.emp_name='amit' and s.sal='20000'";
		String query="select e.emp_joining from employee e inner join salary s on e.emp_id=s.emp_id where s.sal=20000 and e.emp_name='amit'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newTestDB", "root", "root");
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getDate(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
