package modusSystemsPattern;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class jdbc {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost8080/mydatabase";
		String userid = "myid";
		String pass = "mypass";
		Connection conn=DriverManager.getConnection(url,userid,pass);
	}

}
