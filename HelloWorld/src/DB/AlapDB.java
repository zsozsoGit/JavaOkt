package DB;

import java.sql.*;

public class AlapDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost/Javas?useUnicode=true&characterEnconding=UTF-8", "root", "");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO USER (EMail, Password) VALUES (?,?);");
			ps.setString(1, "x@gmail.com");
			ps.setString(2, "x");
			ps.executeUpdate();
			ps = conn.prepareStatement("SELECT * FROM USER");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("ID")+", "+ rs.getString("EMail")+ ", "+ rs.getString("Password"));
				
			}
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
