package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentinfoVO;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.StudentinfoDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class InfoDAOTest3 {

	@Inject
	StudentinfoDAO dao;
	
	@Test
	public void test1() throws Exception{
		StudentinfoVO vo = new StudentinfoVO();
		vo.setUserid("id5");
		vo.setEmail("$@!@%!#@%AFSD");
		vo.setUsername("이름 체인지");
		dao.updateRecord(vo);
	}
	
}
