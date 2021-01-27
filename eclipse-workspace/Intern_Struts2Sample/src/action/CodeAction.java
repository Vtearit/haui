package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Code;
import utils.DBUtils;

public class CodeAction {

	private List<Code> codeList;

	public List<Code> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<Code> codeList) {
		this.codeList = codeList;
	}

	public String getAllCode() throws SQLException {
		// Khai bao connection
		// Khai bao connection
		Connection conn = DBUtils.openConnection();

		String queryStr = "SELECT * FROM Code";

		PreparedStatement pstmt = conn.prepareStatement(queryStr);

		ResultSet rsCode = pstmt.executeQuery();

		codeList = new ArrayList<Code>();
		Code codeModel = null;
		while (rsCode.next()) {
			codeModel = new Code();
			codeModel.setCodeId(rsCode.getString(1));
			codeModel.setCodeName(rsCode.getString(2));
			codeModel.setCodeValue(rsCode.getString(3));
			codeList.add(codeModel);
		}
		return "loadCodeSuccess";
	}

}
