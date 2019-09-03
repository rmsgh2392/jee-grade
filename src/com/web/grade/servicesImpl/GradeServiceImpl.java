package com.web.grade.servicesImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.jasper.tagplugins.jstl.core.Param;

import com.web.grade.DAO.GradeDAO;
import com.web.grade.DAOImpl.GradeDAOImpl;
import com.web.grade.domains.GradeBean;
import com.web.grade.services.GradeService;

public class GradeServiceImpl implements GradeService{
	private GradeDAO dao;
	
	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}
	@Override
	public void createGradeMgt(GradeBean param) {
		param.setHakbun(createHakBun(param));
		getGrade(param);
		System.out.println(">>>>" + param.toString());
		dao.insertGradeDAO(param);
	}
	@Override
	public String createHakBun(GradeBean param) {
		String hakbun = getDate();
		int temp = new Random().nextInt(999)+1;
		return String.format("%s-%s%03d",getDate()
				,genderDistinguish(param)
				,new Random().nextInt(999)+1);
	}

	@Override
	public String getDate() {
	return new SimpleDateFormat("yyyy").format(new Date());
	}

	@Override
	public String genderDistinguish(GradeBean param) {
		String flag = param.getSsn().substring(7,8);
		String answer = "";
		switch (flag) {
		case "1":
			answer = "1";
			break;
		case "2":
			answer = "2";
			break;
		}
		return answer;
	}
	public void getGrade(GradeBean param) {
		int sum = param.getKor()
				+param.getEng()
				+param.getMath()
				+param.getSoceity();
		param.setTotal(String.valueOf(sum));
		int avg = sum/4;
		param.setAvg(String.valueOf(avg));
	}

	
	
}
