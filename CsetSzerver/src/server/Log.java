package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class Log {

	public Log(String description) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost/Javas?useUnicode=true&characterEnconding=UTF-8", "root", "");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Csetlog (time, description) VALUES (?,?);");
			ps.setString(1, Calendar.getInstance().getTime().toString());
			ps.setString(2, description);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
