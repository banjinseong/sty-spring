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
public class InfoDAOTest2 {

	@Inject
	StudentinfoDAO dao;
	
	@Test
	public void test1() throws Exception{
		System.out.println("----------test------------");
		StudentinfoVO vo = dao.selectRecord("1");
		System.out.println(vo.getUsername());
		System.out.println(vo.getUserid());
		System.out.println(vo.getJuso());
		System.out.println(vo.getPhone());
		System.out.println(vo.getEmail());
		System.out.println("----------------------");
	}
	
}
