package com.web.grade.services;

import com.web.grade.domains.GradeBean;

public interface GradeService {
	public void createGradeMgt(GradeBean param);
	public String getDate();
	public String genderDistinguish(GradeBean param);
	public String createHakBun(GradeBean param);
	public void getGrade(GradeBean param);
}
