package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.LabmasterVO;


@Repository
public class Labmaster201944030DAOPImpl implements LabmasterDAO{

	@Inject private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.Labmaster201944030Mapper";
	
	@Override
	public void insertRecord(LabmasterVO vo) {
		sqlSession.insert(namespace + ".insertRecord", vo);
		
	}

	@Override
	public LabmasterVO selectRecord(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectRecord", id);
	}

	@Override
	public void updateRecord(LabmasterVO vo) {
		sqlSession.update(namespace + ".updateRecord", vo);
		
	}

	@Override
	public void deleteRecord(String id) {
		sqlSession.delete(namespace + ".deleteRecord", id);
		
	}

	@Override
	public List<LabmasterVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

}
