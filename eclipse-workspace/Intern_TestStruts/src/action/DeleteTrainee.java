package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DBUtils;

public class DeleteTrainee {
	private int traineeID;
	
	public int getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String deleteTrainee() throws ClassNotFoundException{
		Connection conn=DBUtils.openConnection();
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		try {
			pstmt = conn.prepareStatement("delete from Trainee where Trainee_ID=?");
			pstmt.setInt(1, getTraineeID());
			if(checked(getTraineeID())==1) {
				pstmt1 = conn.prepareStatement("delete from Rate where Trainee_ID=?");
				pstmt1.setInt(1, getTraineeID());
				pstmt1.executeUpdate();
			}
			int rs=pstmt.executeUpdate();
			if(rs>0) {
				DBUtils.CloseConnection(conn, pstmt);
				return "delete";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtils.CloseConnection(conn, pstmt);
		return "delete";
	}
	public static int checked(int a) throws ClassNotFoundException {
		Connection conn = DBUtils.openConnection();
		PreparedStatement pstmt = null;
		// su dung query
		try {
			String queryStr = "Select * from Rate where Trainee_ID=?";
			pstmt = conn.prepareStatement(queryStr);
			// set gia tri cho StudentID
			pstmt.setInt(1, a);
			// truong hop la select
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
