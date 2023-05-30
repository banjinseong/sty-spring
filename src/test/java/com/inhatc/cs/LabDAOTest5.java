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
			System.out.printf("------------%d��° ���-------------\n",i+1);
			System.out.println("labid: "+ listMember.get(i).getLabid());
			System.out.println("labname: "+ listMember.get(i).getLabname());
			System.out.println("�����ο�: "+ listMember.get(i).getPerson());
			System.out.println("��ġ: "+ listMember.get(i).getLocation());
			System.out.println("�ǽ��з�: "+ listMember.get(i).getCls());
			System.out.println("å�Ӱ����а�: "+ listMember.get(i).getDept());
			System.out.println("--------------------------------------");
		}
	}
	
}
