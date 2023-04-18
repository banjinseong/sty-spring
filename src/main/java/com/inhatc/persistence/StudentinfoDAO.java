package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.StudentinfoVO;

public interface StudentinfoDAO {
	public void insertRecord(StudentinfoVO vo);
	//�б�
	public StudentinfoVO selectRecord(String id);
	//����
	public void updateRecord(StudentinfoVO vo);
	//����
	public void deleteRecord(String id);
	
	public List<StudentinfoVO> listAll() throws Exception;
}
