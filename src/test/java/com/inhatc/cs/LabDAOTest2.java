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
public class LabDAOTest2 {

	@Inject
	LabmasterDAO dao;
	
	@Test
	public void select() throws Exception{
		LabmasterVO vo = dao.selectRecord("id1");
		System.out.println("----------test------------");
		System.out.println(vo.getLabname());
		System.out.println(vo.getPerson());
		System.out.println(vo.getLocation());
		System.out.println(vo.getCls());
		System.out.println(vo.getDept());
		System.out.println("-------------------------");
	}
	
}
