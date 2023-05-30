package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Criteria;
import com.inhatc.domain.SearchCriteria;
import com.inhatc.domain.boardVO;
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	private static final String namespace = "com.inhatc.mapper.BoardMapper";
	
	@Override
	public void create(boardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".insert", vo);
	}

	@Override
	public boardVO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".select",bno);
	}

	@Override
	public void update(boardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", bno);

	}

	@Override
	public List<boardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace+".listAll");
	}

	@Override
	public List<boardVO> listPage(int page) throws Exception {
		if(page<=0) {
			page=1;
		}
		page = (page -1)*10;
		return sql.selectList(namespace+".listPage", page);
	}

	@Override
	public List<boardVO> listCriteria(Criteria cri) throws Exception {
		
		return sql.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int totalDataCount() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".totalCount");
	}

	@Override
	public List<boardVO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".listSearchCount", cri);
	}

}
