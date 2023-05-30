package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.LabmasterVO;


public interface LabmasterDAO {
	public void insertRecord(LabmasterVO vo);
	//읽기
	public LabmasterVO selectRecord(String id);
	//갱신
	public void updateRecord(LabmasterVO vo);
	//삭제
	public void deleteRecord(String id);
	
	public List<LabmasterVO> listAll() throws Exception;
}
