
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 
 * @author Vu Duc Vuong TEAM 3 / BLUE DOLPHIN Internship 202007
 *
 */
public class JDBCTest {

	public static void main(String[] args) {

		while (true) {
			System.out.println("============MENU============\r\n" + "1.	Nhập danh sách sinh viên\r\n"
					+ "2.	Hiển thị danh sách sinh viên\r\n" + "3.	Chỉnh sửa thông tin sinh viên\r\n"
					+ "4.	Xoá sinh viên\r\n" + "5.	Thoát chương trình.\r\n" + "============MENU============\r\n"
					+ "");
			int key;
			// Khai báo đối tượng Scanner, giúp chúng ta nhận thông tin từ keyboard
			Scanner sc = new Scanner(System.in);
			System.out.print("Lựa chọn của bạn là : ");
			key = sc.nextInt();
			// sc.nextInt() là cách để lấy giá trị từ bàn phím, nó sẽ chờ tới khi chúng ta
			// nhập một số.
			int a, in;
			String b, c, d, f;
			Boolean g;
			switch (key) {
			// Người dùng chọn 1: Nhập danh sách sinh viên
			case 1:
				System.out.println("\nBạn đã chọn nhập danh sách sinh viên !");
				Scanner sc1 = new Scanner(System.in);
				System.out.print("Số sinh viên bạn muốn nhập vào: ");
				in = sc1.nextInt();
				for (int i = 0; i < in; i++) {
					System.out.println("Nhập thông tin sinh viên thứ " + i + 1 + " :");
					System.out.println("Nhập ID sinh viên:");
					a = sc.nextInt();
					System.out.println("Nhập tên sinh viên:");
					b = sc.next();
					System.out.println("Nhập email sinh viên:");
					c = sc.next();
					System.out.println("Nhập số điện thoại sinh viên:");
					d = sc.next();
					System.out.println("Nhập địa chỉ sinh viên:");
					f = sc.next();
					System.out.println("Nhập trạng thái sinh viên (True/False):");
					g = sc.nextBoolean();
					insertStudentInfo(a, b, c, d, f, g);
					System.out.println("--------------------------");
				}
				break;
			// Người dùng chọn 2: Hiển thị danh sách sinh viên
			case 2:
				System.out.println("\nBạn đã chọn hiển thị danh sách sinh viên.");
				showStudents();
				break;
			// Người dùng chọn 3: Cập nhật thông tin sinh viên
			case 3:
				System.out.println("\nBạn đã chọn cập nhật thông tin sinh viên.");
				System.out.println("Nhập ID sinh viên bạn muốn chỉnh sửa: ");

				if (true) {
					a = sc.nextInt();
					System.out.println("Chỉnh sửa thông tin sinh viên thứ " + a + " :");
					System.out.println("Chỉnh sửa tên sinh viên:");
					b = sc.next();
					System.out.println("Chỉnh sửa email sinh viên:");
					c = sc.next();
					System.out.println("Chỉnh sửa số điện thoại sinh viên:");
					d = sc.next();
					System.out.println("Chỉnh sửa địa chỉ sinh viên:");
					f = sc.next();
					updateStudentInfo(a, b, c, d, f);
				} else
					System.out.println("Không có sinh viên tương ứng");
				break;
			// Người dùng chọn 4: Xóa thông tin sinh viên
			case 4:
				System.out.println("\nBạn đã chọn xóa thông tin sinh viên.");
				System.out.println("Nhập ID sinh viên bạn muốn xóa: ");
				a = sc.nextInt();
				if (true)
					deleteStudentInfo(a);
				else
					System.out.println("Không có sinh viên tương ứng.");
				break;
			// Người dùng chọn 5: Thoát chương trình
			case 5:
				System.out.println("\nBạn đã chọn thoát chương trình!");
				System.exit(0);
				// Người dùng chọn sai:
			default:
				System.out.println("\nKHÔNG CÓ CHỨC NĂNG NÀY, MỜI BẠN CHỌN LẠI.\n ");
				break;

			}
		}
	}

	public static void insertStudentInfo(int a, String b, String c, String d, String f, boolean g) {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "INSERT INTO Students ([StudentID],[StudentName],[Email],[Phone],[Address],[Status]) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(queryStr);
			// Set parameter;

			pstmt.setInt(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			pstmt.setString(4, d);
			pstmt.setString(5, f);
			pstmt.setBoolean(6, g);

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiếm tra kết quả
			if (result > 0) {
				System.out.println("Insert thành công !");

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

	public static void updateStudentInfo(int a, String b, String c, String d, String f) {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "UPDATE Students SET StudentName = ?, Email = ?, Phone = ?, Address = ? WHERE StudentID = ?";
			PreparedStatement pstmt = conn.prepareStatement(queryStr);

			// Set parameter
			pstmt.setString(1, b);
			pstmt.setString(2, c);
			pstmt.setString(3, d);
			pstmt.setString(4, f);
			pstmt.setInt(5, a);

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiem tra ket qua
			if (result > 0) {
				System.out.println("Update thành công!");

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

	public static void deleteStudentInfo(int a) {
		// Open Connection
		Connection conn = openConnection();

		try {
			String queryStr = "DELETE FROM Students WHERE StudentID = ?";
			PreparedStatement pstmt = conn.prepareStatement(queryStr);
			// Set parameter
			pstmt.setInt(1, a);

			// Thuc thi cau query
			int result = pstmt.executeUpdate();

			// Kiem tra ket qua
			if (result > 0) {
				System.out.println("Delete thành công.");

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

	public static Connection openConnection() {
		Connection conn = null;
		// Dang ky driver
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Khai bao connection toi SQLServer
			conn = DriverManager
					.getConnection("jdbc:sqlserver://INTERN12\\MSSQL2014; databaseName=Test; user=vvu1; password=123");
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

	public static void showStudents() {
		// Open Connection
		Connection conn = openConnection();

		try {
			// Su dung query
			String queryStr = "SELECT * FROM Students WHERE Status = 'True' ";
			// Statement chi thao tac voi nhung query dang SELECT

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryStr);
			// Hien thi data
			System.out.println("\n----------Danh sách sinh viên----------");
			System.out.println("ID\t\tName\t\tEmail\t\tPhone\t\tAddress");
			while (rs.next()) {
				System.out.println(rs.getInt("StudentID") + "\t\t" + rs.getString("StudentName") + "\t\t"
						+ rs.getString("Email") + "\t\t" + rs.getString("Phone") + "\t\t" + rs.getString("Address"));
			}
			if (conn != null) {
				stmt.close();
			}
		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close Connection
		CloseConnection(conn);
	}

}

/**
 * Thực hành JDBC
 * 
 * Tạo một ứng dụng menu như sau :
 * 
 * DATABASE (SQL SERVER) Tạo table Students gồm các field sau StudentID - int
 * StudentName – nvarchar(50) Email – nvarchar(50) Phone – nvarchar(20) Address
 * – nvarchar(250) Status – bit (True : Active / False : Deactive)
 * 
 * ============MENU============ 1. Nhập danh sách sinh viên 2. Hiển thị danh
 * sách sinh viên 3. Chỉnh sửa thông tin sinh viên 4. Xoá sinh viên 5. Thoát
 * chương trình. ============MENU============ Lựa chọn của bạn là :
 * 
 * Hướng dẫn Trường hợp chọn 1. Nhập danh sách sinh viên - Cho người dùng nhập
 * số sinh viên muốn input - Nhập thông tin cho số sinh viên đã input ở trên -
 * Sau khi nhập xong hiển thị lại menu
 * 
 * Trường hợp chọn 2. Hiển thị danh sách sinh viên - Hiển thị toàn bộ danh sách
 * nhân viên có trạng thái Status là True – Active - Hiển thị theo format như
 * dưới ========Danh sách sinh viên========== ID Name Email Phone Address 1
 * Nguyễn Văn A anguyen@gmail.com 0123456678 Hà Nội
 * 
 * Trường hợp chọn 3.Chỉnh sửa thông tin sinh viên - Yêu cầu người dùng input ID
 * sinh viên muốn chỉnh sửa - Trường hợp không tồn tại ID thì thông báo message
 * : “Không có sinh viên tương ứng” và hiển thị lại menu. - Trường hợp tồn tại
 * sinh viên, cho phép chỉnh sửa Name, Email, Phone, Address (Trường hợp các
 * trường không input thông tin thì không update) - Sau khi update thành công
 * thì hiển thị message : “Update thành công” và hiển thị lại menu.
 * 
 * Trường hợp chọn 4. Xoá sinh viên - Yêu cầu người dùng input ID sinh viên muốn
 * xoá - Trường hợp không tồn tại thì hiển thị message : Không có sinh viên
 * tương ứng” và hiển thị lại menu.
 * 
 * Trường hợp chọn 5.Thoát chương trình - Thoát chương trình.
 **/
