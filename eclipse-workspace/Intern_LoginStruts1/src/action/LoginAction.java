package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import utils.DBUtils;
import form.LoginForm;
import model.Code;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		// Ger tham so tu client
		LoginForm loginForm = (LoginForm) form;

		Connection conn = DBUtils.openConnection();

		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM UserMaster WHERE Full_Name = ? AND User_ID =?");

		// Set parameter
		pstmt.setString(1, loginForm.getUserName());
		pstmt.setString(2, loginForm.getPassWord());

		// Check ket qua
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			pstmt = conn.prepareStatement("SELECT * FROM Code");
			ResultSet rsCode = pstmt.executeQuery();
			List<Code> codeList = new ArrayList<Code>();
			Code codeModel = null;
			while (rsCode.next()) {
				codeModel = new Code();
				codeModel.setCodeId(rsCode.getString(1));
				codeModel.setCodeName(rsCode.getString(2));
				codeModel.setCodeValue(rsCode.getString(3));

				codeList.add(codeModel);
			}
			request.setAttribute("codeList", codeList);
			request.setAttribute("userNameReq", loginForm.getUserName());
			return mapping.findForward("success");
		}
		return mapping.findForward("error");
	}

}
