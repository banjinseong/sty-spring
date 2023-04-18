package com.inhatc.domain;

public class SubjectRecordVO {
	private String id;
	private int kor;
	private int eng;
	private int math;
	
	@Override
	public String toString() {
		return "SubjectRecordVO [id=" + id + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
