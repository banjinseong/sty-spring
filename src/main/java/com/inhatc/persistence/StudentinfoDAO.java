package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.StudentinfoVO;

public interface StudentinfoDAO {
	public void insertRecord(StudentinfoVO vo);
	//읽기
	public StudentinfoVO selectRecord(String id);
	//갱신
	public void updateRecord(StudentinfoVO vo);
	//삭제
	public void deleteRecord(String id);
	
	public List<StudentinfoVO> listAll() throws Exception;
}
