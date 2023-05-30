package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class RecordDAOTest4 {

	@Inject
	SubjectRecordDAO dao;
	
	@Test
	public void test1() throws Exception{
		List<SubjectRecordVO> listMember = dao.listAll();
		int size = listMember.size();
		System.out.println("size: "+ size);
		for(int i=0; i<size; i++) {
			System.out.printf("------------%d번째 목록-------------\n",i+1);
			System.out.println("id: "+ listMember.get(i).getId());
			System.out.println("kor: "+ listMember.get(i).getKor());
			System.out.println("eng: "+ listMember.get(i).getEng());
			System.out.println("math: "+ listMember.get(i).getMath());
			System.out.println("--------------------------------------");
		}
	}
	
}
