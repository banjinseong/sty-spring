package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {

	public void insertRecord(SubjectRecordVO vo);
	//�б�
	public SubjectRecordVO selectRecord(String id);
	//����
	public void updateRecord(SubjectRecordVO vo);
	//����
	public void deleteRecord(String id);

	public List<SubjectRecordVO> listAll() throws Exception;
}
