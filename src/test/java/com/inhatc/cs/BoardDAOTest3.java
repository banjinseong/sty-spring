package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentinfoVO;
import com.inhatc.domain.boardVO;
import com.inhatc.persistence.BoardDAO;
import com.inhatc.persistence.StudentinfoDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class BoardDAOTest3 {

	@Inject
	BoardDAO dao;
	
	@Test
	public void test1() throws Exception{
		
		boardVO vo = new boardVO();
		vo.setBno(1);
		vo.setContent("º¯°æ111");
		dao.update(vo);
		
	}
	
}
