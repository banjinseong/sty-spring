package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.StudentinfoVO;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.StudentinfoDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class InfoDAOTest5 {

	@Inject
	StudentinfoDAO dao;
	
	@Test
	public void test1() throws Exception{
		List<StudentinfoVO> listMember = dao.listAll();
		int size = listMember.size();
		System.out.println("size: "+ size);
		for(int i=0; i<size; i++) {
			System.out.printf("------------%d번째 목록-------------\n",i+1);
			System.out.println("userid: "+ listMember.get(i).getUserid());
			System.out.println("username: "+ listMember.get(i).getUsername());
			System.out.println("useremail: "+ listMember.get(i).getEmail());
			System.out.println("--------------------------------------");
		}
	}
	
}
