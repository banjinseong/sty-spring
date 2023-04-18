
package com.inhatc.cs;

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
public class MembersDAO3Test {
	
	@Inject
	private MembersDAO dao;
	
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("============test=============");
		MembersVO vo = dao.readMembers("id1");
		System.out.println("user name: "+vo.getUsername());
		System.out.println("-----------------------------");
	}
	
}