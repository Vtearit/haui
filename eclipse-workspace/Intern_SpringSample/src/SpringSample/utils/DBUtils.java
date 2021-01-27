package SpringSample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static Connection openConnection() {
		Connection conn = null;
		try {
			conn = DriverManager
					.getConnection("jdbc:sqlserver://DESKTOP-QCVV79D\\\\\\\\SQLEXPRESS01:1433; databaseName=Practice; user=sa;password=123456");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void CloseConnect(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
}
