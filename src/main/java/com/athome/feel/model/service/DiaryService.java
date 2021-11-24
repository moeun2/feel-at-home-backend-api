package com.athome.feel.model.service;

import java.util.List;

import com.athome.feel.model.DiaryDto;


public interface DiaryService {

	
	List<DiaryDto> list(String member_id);
	boolean create(DiaryDto diaryDto);
	boolean modify(DiaryDto diaryDto);
	boolean delete(int diary_id);
	int getCount(String sentiment);
	
}
