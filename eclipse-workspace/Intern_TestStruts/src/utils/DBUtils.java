package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {
	public static Connection openConnection() throws ClassNotFoundException {
		Connection conn = null;
		try {
			// Dang ky driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Khai bao connection
			conn = DriverManager
					.getConnection("jdbc:sqlserver://DESKTOP-QCVV79D\\SQLEXPRESS01:1433;databaseName=forTest;user=sa;password=123456");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void CloseConnection(Connection conn, PreparedStatement pstmt) {
		// Kiem tra truoc khi dong ket noi
		try {
			if (pstmt != null) {
				conn.close();
			}
			// Kiem tra truoc khi dong ket noi
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
