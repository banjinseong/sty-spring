
package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class MembersDAO7Test {
	
	@Inject
	private MembersDAO dao;
	
	
	@Test
	public void updateMembers() throws Exception{
		List<MembersVO> listMember = dao.listAll();
		int size = listMember.size();
		System.out.println("size: "+ size);
		for(int i=0; i<size; i++) {
			System.out.println("userid: "+ listMember.get(i).getUserid());
			System.out.println("username: "+ listMember.get(i).getUsername());
			System.out.println("useremail: "+ listMember.get(i).getEmail());
		}
	}
	
}
