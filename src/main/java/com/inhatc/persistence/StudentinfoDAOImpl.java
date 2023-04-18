package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentinfoVO;

@Repository
public class StudentinfoDAOImpl implements StudentinfoDAO{

	@Inject private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.infoMapper";
	
	@Override
	public void insertRecord(StudentinfoVO vo) {
		sqlSession.insert(namespace + ".insertRecord", vo);
		
	}

	@Override
	public StudentinfoVO selectRecord(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectRecord", id);
	}

	@Override
	public void updateRecord(StudentinfoVO vo) {
		sqlSession.update(namespace + ".updateRecord", vo);
		
	}

	@Override
	public void deleteRecord(String id) {
		sqlSession.delete(namespace + ".deleteRecord", id);
		
	}

	@Override
	public List<StudentinfoVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

}
