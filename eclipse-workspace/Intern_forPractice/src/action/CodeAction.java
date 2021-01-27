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

	private String codeId;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	private List<Code> codeList;

	public List<Code> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<Code> codeList) {
		this.codeList = codeList;
	}

	public String getCodeData() throws SQLException {
		Connection conn = DBUtils.openConnection();

		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Code");

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

	// method for delete the record
	public String deleteCode() throws SQLException {
		Connection conn = DBUtils.openConnection();
		PreparedStatement ps = conn.prepareStatement("Delete From Code Where Code_ID = ?");

		ps.setString(1, getCodeId());
		int i = ps.executeUpdate();
		if (i > 0) {
			return "loadCodeSuccess";
		}
		return "error";
	}

}
