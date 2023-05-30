package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.LabmasterVO;


public interface LabmasterDAO {
	public void insertRecord(LabmasterVO vo);
	//�б�
	public LabmasterVO selectRecord(String id);
	//����
	public void updateRecord(LabmasterVO vo);
	//����
	public void deleteRecord(String id);
	
	public List<LabmasterVO> listAll() throws Exception;
}
