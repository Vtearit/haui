package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modal.Customer;
import Modal.DBConnect;
import Tool.MD5;

public class RegisterDAO {
	public int insertAccount(String email, String name, String password) throws SQLException {
		DBConnect dbConnect = new DBConnect();
		MD5 md5 = new MD5();
		Statement statement = dbConnect.getConnection().createStatement();
		String sql1 = String.format("select *from customer where email='" + email + "'");
		ResultSet rSet1 = statement.executeQuery(sql1);
		if (rSet1.next()) {
			return 1;
		} else {
			String sql2 = String.format("insert into customer(name,email,password) values ( '" + name + "','" + email
					+ "','" + md5.mahoa(password) + "' )");
			int rSet2 = statement.executeUpdate(sql2);
			if (rSet2 >= 0) {
				return 0;
			}

		}
		return 2;

	}

}
