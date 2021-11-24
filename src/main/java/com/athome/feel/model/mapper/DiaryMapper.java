package com.athome.feel.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.athome.feel.model.DiaryDto;
import com.athome.feel.model.SentimentDto;

@Mapper
public interface DiaryMapper {

	List<SentimentDto> listSentiment(String member_id);
	List<DiaryDto> list(String diary_id);

	int create(DiaryDto diaryDto);

	int modify(DiaryDto diaryDto);

	int delete(int diary_id);

}
