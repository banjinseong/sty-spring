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
public class LabDAOTest3 {

	@Inject
	LabmasterDAO dao;
	
	@Test
	public void update() throws Exception{
		LabmasterVO vo = new LabmasterVO();
		vo.setLabid("id1");
		vo.setLabname("이름변경");
		vo.setPerson(100);
		vo.setLocation("4-401");
		vo.setCls("pc실습");
		vo.setDept("컴퓨터정보과");
		dao.updateRecord(vo);
	}
	
}
