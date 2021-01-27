import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Connection conn = openConnection();

		// Su dung query thao tac den DB
		//FindUserByUserId();
//		
//		// Close Connection
//		CloseConnection(conn);
		openConnection();
	}

	public static Connection openConnection() {
		Connection conn = null;
		// Dang ky driver
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Khai bao connection toi SQLServer
			conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QCVV79D\\SQLEXPRESS01:1433; databaseName=Practice; user=sa;password=123456");
			System.out.println("Kết nối thành công rồi anh Vượng ạ !");

			return conn;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void CloseConnection(Connection conn) {
		// Kiem tra truoc khi dong connection
		if (conn != null) {
			try {
//				// Kiem tra truoc khi dong stmt
//				if (conn != null) {
//					stmt.close();
//					// Kiem tra truoc khi dong pstmt
//					if (conn != null) {
//						pstmt.close();
//					}
				// Dong connection
				conn.close();
//				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// Vi du su dung Statement
	public static void DisplayAllUser() {
		// Open Connection
		Connection conn = openConnection();

		try {
			// Su dung query
			String queryStr = "SELECT * FROM UserMaster ";
			// Statement chi thao tac voi nhung query dang SELECT

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryStr);
			// Hoac truyen truc tiep: ResultSet rs = stmt.executeQuery("SELECT * FROM
			// UserMaster ");
			// Hien thi data
			System.out.println("\n----------Danh sach User----------");
			System.out.println("User ID\t\tFull Name\tSalary");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString("Full_Name") + "\t" + rs.getInt("Salary"));
			}
			if (conn != null) {
				stmt.close();
			}
		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Hoac truyen truc tiep: Statement stmt = conn.createStatement("SELECT * FROM
		// UserMaster");

		// Close Connection
		CloseConnection(conn);
	}

	// Vi du su dung Transaction
	public static void UpdateUser() {
		Connection conn = openConnection();
		
		try {
			// Set mode comit
			conn.setAutoCommit(false);
			
			// Thuc hien update lan 1
			String query1 = "UPDATE UserMaster SET Full_Name = ? WHERE User_ID = ?";
			PreparedStatement pstmt1 = conn.prepareStatement(query1);
			
			// Set parameter
			pstmt1.setString(1, "Vuong");
			pstmt1.setString(2, "500000");
			int result1 = pstmt1.executeUpdate();
			
			// Thuc hien update lan 2
			String query2 = "DELETE FROM UserMaster WHERE User_ID = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(query2);
			
			// Set parameter
			pstmt2.setString(1, "500000");
			int result2 = pstmt2.executeUpdate();
			
			if(result1 > 0 && result2 >0) {
				conn.commit();
				System.out.println("Commit roi");
			} else {
				conn.rollback();
				System.out.println("Tao rollback roi");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void DisplayUser() {
		// Open Connection
		Connection conn = openConnection();

		try {
			// Khai bao Prepare Statement
			String queryStr = "SELECT * FROM UserMaster WHERE User_ID = ? AND ROLE = ?";

			PreparedStatement pstmt = conn.prepareStatement(queryStr);

			// Set parameter
			pstmt.setString(1, "500000");
			pstmt.setString(2, "MGR");

			// Truong hop query la SELECT
			ResultSet rs = pstmt.executeQuery();

			// Hien thi data
			System.out.println("\n----------Danh sach User----------");
			System.out.println("User ID\t\tFull Name\tSalary");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString("Full_Name") + "\t" + rs.getInt("Salary"));

				if (conn != null) {
					pstmt.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CloseConnection(conn);
	}

	// Vi du su dung Prepare Statement
	public static void UpdateUserInfo() {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "UPDATE UserMaster SET Full_Name = ? WHERE User_ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(queryStr);

			// Set parameter
			pstmt.setString(1, "UserTest");
			pstmt.setString(2, "500000");

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiem tra ket qua
			if (result > 0) {
				System.out.println("Update thành công rồi anh Vượng ạ !");

				if (conn != null) {
					pstmt.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CloseConnection(conn);
	}

	public static void InsertUserInfo() {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "INSERT INTO UserMaster ([User_ID],[Full_Name],[Initial_Name],[User_Status],[Department],[Role],[Salary],[LOGICAL_DELETE_FLG]) "
					+ "VALUES (? , ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(queryStr);
			// Set parameter
			pstmt.setString(1, "12345678");
			pstmt.setString(2, "User Vu");
			pstmt.setString(3, "U122");
			pstmt.setString(4, " ");
			pstmt.setString(5, "DEV01");
			pstmt.setString(6, "DEV");
			pstmt.setString(7, "10000000");
			pstmt.setString(8, "0");

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiem tra ket qua
			if (result > 0) {
				System.out.println("Insert thành công rồi anh Vượng ạ !");

				if (conn != null) {
					pstmt.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CloseConnection(conn);
	}

	public static void DeleteUserInfo() {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "DELETE FROM UserMaster WHERE User_ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(queryStr);
			// Set parameter
			pstmt.setString(1, "12345678");

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiem tra ket qua
			if (result > 0) {
				System.out.println("Delete thành công rồi anh Vượng ạ !");

				if (conn != null) {
					pstmt.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CloseConnection(conn);
	}

	public static void FindUserByUserId() {
		// Khai bao connection
		Connection conn = openConnection();
		CallableStatement cstmt = null;

		// Khai bao CallableStatement
		try {
			cstmt = conn.prepareCall("{CALL GetUserByID(?)}");

			/** Cau lenh PROCEDURE
			CREATE PROC GetUserByID @User_ID varchar(10)
			AS
			BEGIN
				SELECT * FROM UserMaster
				WHERE User_ID = @User_ID
			END **/

			// Set parameter
			cstmt.setString(1, "500000");

			// Thuc thi cau query
			ResultSet rs = cstmt.executeQuery();

			// Hien thi data
			System.out.println("\n----------Danh sach User----------");
			System.out.println("User ID\t\tFull Name\tSalary");
			if (rs.next()) { // Khong su dung while vi chi duyet 1 phan tu
				System.out.println(rs.getString(1) + "\t\t" + rs.getString("Full_Name") + "\t" + rs.getInt("Salary"));
			}

			if (conn != null) {
				cstmt.close();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CloseConnection(conn);
	}

}


