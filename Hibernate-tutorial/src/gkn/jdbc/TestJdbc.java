package gkn.jdbc;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hb_student_tracker","root","");) 
		{
			
			
			
//			Statement stmt = conn.createStatement();
//			ResultSet rs  = stmt.executeQuery("select * from employees");
//			whiles(rs.next())
//			{
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3) );
//			}
			
			System.out.println("satrted");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}



	}

}
