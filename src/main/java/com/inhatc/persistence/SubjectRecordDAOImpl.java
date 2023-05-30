package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.LabmasterVO;
import com.inhatc.domain.SubjectRecordVO;
@Repository
public class SubjectRecordDAOImpl implements SubjectRecordDAO{

	@Inject private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.subMapper";
	
	@Override
	public void insertRecord(SubjectRecordVO vo) {
		sqlSession.insert(namespace + ".insertRecord", vo);
		
	}

	@Override
	public SubjectRecordVO selectRecord(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectRecord", id);
	}

	@Override
	public void updateRecord(SubjectRecordVO vo) {
		sqlSession.update(namespace + ".updateRecord", vo);
		
	}

	@Override
	public void deleteRecord(String id) {
		sqlSession.delete(namespace + ".deleteRecord", id);
		
	}
	
	@Override
	public List<SubjectRecordVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

}
