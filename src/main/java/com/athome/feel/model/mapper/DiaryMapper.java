package com.athome.feel.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.athome.feel.model.DiaryDto;




@Mapper
public interface DiaryMapper {

	List<DiaryDto> list(String member_id);
	int create(DiaryDto diaryDto);
	int modify(DiaryDto diaryDto);
	int delete(int diary_id);
	int getCount(String sentiment);

	
}
