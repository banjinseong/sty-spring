package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.LabmasterVO;
import com.inhatc.persistence.LabmasterDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class LabDAOTest1 {

	@Inject
	LabmasterDAO dao;
	
	@Test
	public void insert() throws Exception{
		LabmasterVO vo = new LabmasterVO();
		vo.setLabid("id3");
		vo.setLabname("name3");
		vo.setPerson(3);
		vo.setLocation("��ġ3");
		vo.setCls("�з�3");
		vo.setDept("�а�3");
		dao.insertRecord(vo);
	}
	
}
