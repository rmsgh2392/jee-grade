package com.web.grade.DAOImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.web.grade.DAO.GradeDAO;
import com.web.grade.domains.GradeBean;
import com.web.grade.services.GradeService;
import com.web.grade.servicesImpl.GradeServiceImpl;

public class GradeDAOImpl implements GradeDAO{
	public static final String FILE_PATH =String.format("C:%sUsers%suser%seclipes-jee%sjee-grade%sWebContent%sresources%stxt%s"
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);
	
	
	@Override
	public void insertGradeDAO(GradeBean param) {
		try {
			GradeService service = new GradeServiceImpl();
			File file = new File(FILE_PATH +"Grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s\n"
					+ "%s",param.getHakbun(),param.toString()));
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
