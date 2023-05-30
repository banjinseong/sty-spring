package com.inhatc.service;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.inhatc.domain.Criteria;
import com.inhatc.domain.SearchCriteria;
import com.inhatc.domain.boardVO;
import com.inhatc.persistence.BoardDAO;

@Service
public class BoardServiceimpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(boardVO board)throws Exception{
		dao.create(board);
	}
	@Override
	public boardVO read(int bno)throws Exception{
		return dao.read(bno);
	}
	@Override
	public void modify(boardVO board)throws Exception{
		dao.update(board);
	}
	@Override
	public void remove(int bno)throws Exception{
		dao.delete(bno);
	}
	@Override
	public List<boardVO> listAll()throws Exception{
		return dao.listAll();
	}
	@Override
	public List<boardVO> listPage(int page) throws Exception {
		// TODO Auto-generated method stub
		return dao.listPage(page);
	}
	@Override
	public List<boardVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listCriteria(cri);
	}
	@Override
	public int totalDataCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.totalDataCount();
	}
	@Override
	public List<boardVO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearch(cri);
	}
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearchCount(cri);
	}
}
