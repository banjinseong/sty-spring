package com.inhatc.service;

import java.util.List;

import com.inhatc.domain.Criteria;
import com.inhatc.domain.SearchCriteria;
import com.inhatc.domain.boardVO;

public interface BoardService {
	public void regist(boardVO board)throws Exception;
	public boardVO read(int bno)throws Exception;
	public void modify(boardVO board)throws Exception;
	public void remove(int bno)throws Exception;
	public List<boardVO> listAll()throws Exception;
	public List<boardVO> listPage(int page) throws Exception;
	public List<boardVO> listCriteria(Criteria cri) throws Exception;
	public int totalDataCount() throws Exception;
	public List<boardVO> listSearch(SearchCriteria cri)throws Exception;
	  
	public int listSearchCount(SearchCriteria cri)throws Exception;
}
