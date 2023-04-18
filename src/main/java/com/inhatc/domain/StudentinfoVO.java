package com.inhatc.domain;

public class StudentinfoVO {
	private String userid;
	private String username;
	private int dept;
	private String juso;
	private String phone;
	private String email;
	@Override
	public String toString() {
		return "StudentinfoVO [userid=" + userid + ", username=" + username + ", dept=" + dept + ", juso=" + juso
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
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
}
