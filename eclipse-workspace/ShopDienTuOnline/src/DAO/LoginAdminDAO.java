package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modal.CustomerSession;
import Modal.DBConnect;
import Modal.EmployeeSession;
import Tool.MD5;

public class LoginAdminDAO {
	public int checkLogin(String email, String password) throws SQLException {
		DBConnect dbConnect = new DBConnect();
		MD5 md5 = new MD5();
		PreparedStatement statement = null;
		String sql = "select * from employee where email=? and password=?";
		statement = dbConnect.getConnection().prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, md5.mahoa(password));
		ResultSet rSet = statement.executeQuery();
		if (rSet.next()) {
			EmployeeSession.id = rSet.getInt("id");
			EmployeeSession.name = rSet.getString("name");
			EmployeeSession.phone = rSet.getString("phone");
			EmployeeSession.email = rSet.getString("email");
			EmployeeSession.address = rSet.getString("address");
			return 0;
		}
		return 1;
	}
}
