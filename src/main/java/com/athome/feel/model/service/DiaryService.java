package com.athome.feel.model.service;

import java.util.List;
import com.athome.feel.model.DiaryDto;
import com.athome.feel.model.SentimentDto;




public interface DiaryService {

	List<SentimentDto> listSentiment(String member_id);
	List<DiaryDto> list(String diary_id);

	boolean create(DiaryDto diaryDto);

	boolean modify(DiaryDto diaryDto);

	boolean delete(int diary_id);
	
}
