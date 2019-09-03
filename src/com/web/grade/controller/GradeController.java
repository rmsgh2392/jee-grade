package com.web.grade.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.grade.domains.GradeBean;
import com.web.grade.services.GradeService;
import com.web.grade.servicesImpl.GradeServiceImpl;


@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("맥락이 맞아서 들어옴");
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String soceity = request.getParameter("soceity");
		GradeBean param = new GradeBean();
		param.setSsn(ssn);
		param.setName(name);
		param.setKor(Integer.parseInt(kor));
		param.setEng(Integer.parseInt(eng));
		param.setMath(Integer.parseInt(math));
		param.setSoceity(Integer.parseInt(soceity));
		System.out.println(">>>>"+param.toString());
		GradeService service = new GradeServiceImpl();
		service.createGradeMgt(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
