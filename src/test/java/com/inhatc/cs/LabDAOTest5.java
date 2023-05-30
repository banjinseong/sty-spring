package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.LabmasterVO;
import com.inhatc.domain.StudentinfoVO;
import com.inhatc.persistence.LabmasterDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class LabDAOTest5 {

	@Inject
	LabmasterDAO dao;
	
	@Test
	public void listAll() throws Exception{
		List<LabmasterVO> listMember = dao.listAll();
		int size = listMember.size();
		System.out.println("size: "+ size);
		for(int i=0; i<size; i++) {
			System.out.printf("------------%d번째 목록-------------\n",i+1);
			System.out.println("labid: "+ listMember.get(i).getLabid());
			System.out.println("labname: "+ listMember.get(i).getLabname());
			System.out.println("가용인원: "+ listMember.get(i).getPerson());
			System.out.println("위치: "+ listMember.get(i).getLocation());
			System.out.println("실습분류: "+ listMember.get(i).getCls());
			System.out.println("책임관리학과: "+ listMember.get(i).getDept());
			System.out.println("--------------------------------------");
		}
	}
	
}
