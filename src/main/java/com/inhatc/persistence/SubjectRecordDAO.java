package com.inhatc.persistence;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {

	public void insertRecord(SubjectRecordVO vo);
	//읽기
	public SubjectRecordVO selectRecord(String id);
	//갱신
	public void updateRecord(SubjectRecordVO vo);
	//삭제
	public void deleteRecord(String id);


}
