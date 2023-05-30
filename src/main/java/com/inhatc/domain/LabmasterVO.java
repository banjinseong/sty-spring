package com.inhatc.domain;

public class LabmasterVO {
	private String labid;
	private String labname;
	private int person;
	private String location;
	private String cls;
	@Override
	public String toString() {
		return "LabmasterVO [labid=" + labid + ", labname=" + labname + ", person=" + person + ", location=" + location
				+ ", cls=" + cls + ", dept=" + dept + "]";
	}
	public String getLabid() {
		return labid;
	}
	public void setLabid(String labid) {
		this.labid = labid;
	}
	public String getLabname() {
		return labname;
	}
	public void setLabname(String labname) {
		this.labname = labname;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private String dept;
}
