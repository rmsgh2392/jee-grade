package com.web.grade.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name,ssn,hakbun,total,avg;
	private int kor,eng,math,soceity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	public int getSoceity() {
		return soceity;
	}
	public void setSoceity(int soceity) {
		this.soceity = soceity;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setTotal(String total) {
	  this.total = total;
	}
	public String getTotal() {
		return total;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getAvg() {
		return avg;
	}
	@Override
	public String toString() {
		return String.format(
				"주민번호:%s\n"
				+ "이름:%s\n"
				+ "국어:%d\n"
				+ "영어:%d\n"
				+ "수학:%d\n"
				+ "사회:%d\n"
				+ "총점:%s\n"
				+ "평균:%s",ssn,name,kor,eng,math,soceity,total,avg);
	}
	
	
	
	
}
