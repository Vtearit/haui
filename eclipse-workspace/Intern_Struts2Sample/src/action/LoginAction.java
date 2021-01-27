package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import utils.DBUtils;

public class LoginAction {

	HttpSession session;

	private String userName;
	private String passWord;

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String login() throws SQLException {

		// Khai bao connection
		Connection conn = DBUtils.openConnection();
		
		String queryStr = "SELECT * FROM UserMaster WHERE Full_Name = ? AND User_ID =?";
		PreparedStatement pstmt = conn.prepareStatement(queryStr);
		pstmt.setString(1, getUserName());
		pstmt.setString(2, getPassWord());
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {

			return "success";
		}
		return "error";
	}
}
