 package modusSystems;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBc {

	public static void main(String[] args) {
	//extends SQLException, Exception, Throwable{

		String url="jdbc:mysql://localhost:3306";
		String username="myusername";
		String password="mypassword";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}


		//		try {
		//			Class.forName("oracle.jdbc.driver.oracleDriver");
		//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ex","system","273113");
		//			Statement smt=(Statement) con.createStatement();
		//			((java.sql.Statement) smt).executeUpdate("create table emp(eno number,ename charvar(15), esal number");
		//			System.out.println("table created Successfully");
		//
		//
		//		}
		//		catch(Exception e) {
		//			System.out.println(e);
		//		}
	}

}
