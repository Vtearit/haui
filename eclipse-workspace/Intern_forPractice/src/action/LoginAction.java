package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DBUtils;

public class LoginAction {
	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String login() throws SQLException {

		// Mo connection
		Connection conn = DBUtils.openConnection();

		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM UserMaster WHERE Full_Name = ? AND User_ID = ?");
		pstmt.setString(1, userName);
		pstmt.setString(2, passWord);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return "success";
		}

		return "error";

	}

}
