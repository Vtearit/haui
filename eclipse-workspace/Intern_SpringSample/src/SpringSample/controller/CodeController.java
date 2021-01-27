package SpringSample.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringSample.model.Code;

@Controller
public class CodeController {

	@RequestMapping("code")
	public String showCode(ModelMap model, Code code) throws SQLException {
		Connection conn = SpringSample.utils.DBUtils.openConnection();

		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Code");

		ResultSet rsCode = pstmt.executeQuery();
		List<Code> codeList = new ArrayList<Code>();
		while (rsCode.next()) {
			code = new Code();
			code.setCodeId(rsCode.getString(1));
			code.setCodeName(rsCode.getString(2));
			code.setCodeValue(rsCode.getString(3));
			codeList.add(code);
		}
		model.addAttribute("vuong", codeList);
		return "showCodeSuccess";
	}
}
