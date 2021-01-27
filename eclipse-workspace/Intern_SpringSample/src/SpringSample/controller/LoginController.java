package SpringSample.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SpringSample.model.User;

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user, ModelMap model) throws SQLException {
		Connection conn = SpringSample.utils.DBUtils.openConnection();
		String sql = "SELECT * FROM UserMaster WHERE Full_Name = ? AND User_ID = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		String userName = user.getUserName();
		String passWord = user.getPassWord();
		ps.setString(1, userName);
		ps.setString(2, passWord);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return "loginSuccess";
		}
		return "loginFailure";
	}

}
