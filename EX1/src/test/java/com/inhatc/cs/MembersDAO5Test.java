
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
public class MembersDAO5Test {
	
	@Inject
	private MembersDAO dao;
	
	
	@Test
	public void updateMembers() throws Exception{
		System.out.println("============test=============");
		MembersVO vo = new MembersVO();
		vo.setUserid("id1");
		vo.setUsername("����ض�");
		dao.modify(vo);
	}
	
}
