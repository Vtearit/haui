package models;

import java.sql.Date;

public class TraineeModel {
	private int traineeID;
	private String traineeName;
	private Date birth;
	private String phone;
	private String email;
	private int projectID;
	private int teamID;
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public int getTeamID() {
		return teamID;
	}
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
}
