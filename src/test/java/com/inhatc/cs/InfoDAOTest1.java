package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentinfoVO;

import com.inhatc.persistence.StudentinfoDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class InfoDAOTest1 {

	@Inject
	StudentinfoDAO dao;
	
	@Test
	public void test1() throws Exception{
		StudentinfoVO vo = new StudentinfoVO();
		vo.setUserid("i2fdfdd3");
		vo.setUsername("name");
		vo.setDept(1);
		vo.setJuso("¿Œ√µ");
		vo.setPhone("6692");
		vo.setEmail("@@@@");
		dao.insertRecord(vo);
	}
	
}
