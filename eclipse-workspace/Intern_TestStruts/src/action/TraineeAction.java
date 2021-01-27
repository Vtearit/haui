package action;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

import utils.DBUtils;

public class TraineeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int traineeID;
	private String traineeName;
	private String birth;
	private String phone;
	private String email;
	private int projectID;
	private int teamID;
	List<TraineeAction> list;
	public int getTraineeID() {
		return traineeID;
	}
//	@RequiredStringValidator(message="Nhap TraineeID")
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
//	@RequiredStringValidator(message="Nhap TraineeName")
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getBirth() {
		return birth;
	}
//	@RequiredStringValidator(message="Nhap Birth")
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
//	@RequiredStringValidator(message="Nhap Phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
//	@RequiredStringValidator(message="Nhap Email")
	public void setEmail(String email) {
		this.email = email;
	}
	public int getProjectID() {
		return projectID;
	}
//	@RequiredStringValidator(message="Nhap ProjectID")
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public int getTeamID() {
		return teamID;
	}
//	@RequiredStringValidator(message="Nhap TeamID")
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	public List<TraineeAction> getList() {
		return list;
	}
	public void setList(List<TraineeAction> list) {
		this.list = list;
	}
	public String getTrainee() throws ClassNotFoundException {
		Connection conn=DBUtils.openConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement("Select * from Trainee");
			ResultSet rs=pstmt.executeQuery();
			list= new ArrayList<TraineeAction>();
			TraineeAction ac=null;
			while(rs.next()) {
				ac=new TraineeAction();
				ac.setTraineeID(rs.getInt(1));
				ac.setTraineeName(rs.getString(2));
				ac.setBirth(rs.getString(3));
				ac.setPhone(rs.getString(4));
				ac.setEmail(rs.getString(5));
				ac.setProjectID(rs.getInt(6));
				ac.setTeamID(rs.getInt(7));
				list.add(ac);
			}
			DBUtils.CloseConnection(conn, pstmt);
			return "success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return "success";
	}
	public String updateTrainee() throws ClassNotFoundException {
		HttpServletRequest request=ServletActionContext.getRequest();
		if(getTraineeName().trim().equals("")) {
			request.setAttribute("name", "Nhap TraineeName");
			return ERROR;
		}
		if(getBirth().equals("")) {
			request.setAttribute("birth", "Nhap Birth");
			return ERROR;
		}
		if(getPhone().trim().equals("")) {
			request.setAttribute("phone", "Nhap Phone");
			return ERROR;
		}
		if(getEmail().trim().equals("")) {
			request.setAttribute("email", "Nhap Email");
			return ERROR;
		}
		if(String.valueOf(getProjectID()).trim().equals("")) {
			request.setAttribute("pid", "Nhap ProjectID");
			return ERROR;
		}
		if(String.valueOf(getTeamID()).trim().equals("")) {
			request.setAttribute("tid", "Nhap TeamID");
			return ERROR;
		}
		Connection conn=DBUtils.openConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement("Update Trainee set Trainee_Name=?,Birth=?,PhoneE=?,EmailE=?,Project_ID=?,Team_ID=? where Trainee_ID=?");
			pstmt.setString(1, getTraineeName());
			pstmt.setString(2, getBirth());
			pstmt.setString(3, getPhone());
			pstmt.setString(4, getEmail());
			pstmt.setInt(5, getProjectID());
			pstmt.setInt(6, getTeamID());
			pstmt.setInt(7, getTraineeID());
			int result=0;
			if(checkedP(getProjectID())==1&&checkedT(getTeamID())==1) {
				result=pstmt.executeUpdate();
			}
			else if(checkedP(getProjectID())==0) {
				request.setAttribute("pid", "ProjectID ko ton tai");
				System.out.println("ProjectID ko ton tai");
			}
			else if(checkedT(getTeamID())==0) {
				request.setAttribute("tid", "TeamID ko ton tai");
				System.out.println("TeamID ko ton tai");
			}
			if(result>0) {
				DBUtils.CloseConnection(conn, pstmt);
				return "update";
			}
			else {
				System.out.println("loi");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return "error1";
	}
	public String addTrainee() throws ClassNotFoundException {
		HttpServletRequest request=ServletActionContext.getRequest();
		Connection conn=DBUtils.openConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement("Insert into Trainee values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, getTraineeID());
			pstmt.setString(2, getTraineeName());
			pstmt.setString(3, getBirth());
			pstmt.setString(4, getPhone());
			pstmt.setString(5, getEmail());
			pstmt.setInt(6, getProjectID());
			pstmt.setInt(7, getTeamID());
			int result = 0;
			if(checkedTr(getTraineeID())==0&&checkedP(getProjectID())==1&&checkedT(getTeamID())==1)	{
				result=pstmt.executeUpdate();
			}
			else if(checkedTr(getTraineeID())==1) {
				request.setAttribute("trid", "TraineeID da ton tai");
				System.out.println("TraineeID da ton tai");
			}
			else if(checkedP(getProjectID())==0) {
				request.setAttribute("pid", "ProjectID ko ton tai");
				System.out.println("ProjectID ko ton tai");
			}
			else if(checkedT(getTeamID())==1) {
				request.setAttribute("tid", "TeamID ko ton tai");
				System.out.println("TeamID ko ton tai");
			}
			if(result>0) {
				return "add";
			}
			else {
				System.out.println("loi insert");
//				System.out.println(getTraineeID());
//				System.out.println(getTraineeName());
//				System.out.println(getBirth());
//				System.out.println(getPhone());
//				System.out.println(getEmail());
//				System.out.println(getProjectID());
//				System.out.println(getTeamID());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return "error";
	}
	public static int checkedP(int a) throws ClassNotFoundException {
		Connection conn = DBUtils.openConnection();
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		try {
			String queryStr = "Select * from Project where Project_ID=?";
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, a);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				DBUtils.CloseConnection(conn, pstmt);
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return 0;
	}
	public static int checkedT(int a) throws ClassNotFoundException {
		Connection conn = DBUtils.openConnection();
		PreparedStatement pstmt = null;
		try {
			String queryStr = "Select * from Team where Team_ID=?";
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, a);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				DBUtils.CloseConnection(conn, pstmt);
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return 0;
	}
	public static int checkedTr(int a) throws ClassNotFoundException {
		Connection conn = DBUtils.openConnection();
		PreparedStatement pstmt = null;
		try {
			String queryStr = "Select * from Rate where Trainee_ID=?";
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, a);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				DBUtils.CloseConnection(conn, pstmt);
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return 0;
	}
}
