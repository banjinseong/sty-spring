package com.inhatc.cs;

import java.util.List;

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
public class BoardDAOTest5 {

	@Inject
	BoardDAO dao;
	
	@Test
	public void test1() throws Exception{
		
		List<boardVO> listMember = dao.listAll();
		int size = listMember.size();
		System.out.println("size: "+ size);
		for(int i=0; i<size; i++) {
			System.out.printf("------------%d번째 목록-------------\n",i+1);
			System.out.println("userid: "+ listMember.get(i).getTitle());
			System.out.println("username: "+ listMember.get(i).getContent());
			System.out.println("useremail: "+ listMember.get(i).getWriter());
			System.out.println("--------------------------------------");
		}
	}
	
}
