package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;

@Repository
public class MembersDAOImpl implements MembersDAO{
	
	
	@Inject private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.MemberMapper";

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMembers(MembersVO vo) {
		sqlSession.insert(namespace + ".insertMembers", vo);
	}

	@Override
	public MembersVO readMembers(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".selectMembers", userid);
	}

	@Override
	public MembersVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return sqlSession.selectOne(namespace + ".selectReadPW",paramMap);
	}

	@Override
	public void modify(MembersVO vo) throws Exception {
		sqlSession.update(namespace + ".update",vo);
		
	}

	@Override
	public void del(MembersVO vo) throws Exception {
		sqlSession.update(namespace + ".delete",vo);
		
	}

	@Override
	public List<MembersVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

}
