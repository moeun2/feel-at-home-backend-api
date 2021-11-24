package com.athome.feel.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.athome.feel.model.DiaryDto;
import com.athome.feel.model.SentimentDto;
import com.athome.feel.model.mapper.DiaryMapper;


@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryMapper diaryMapper;
	
	@Override
	public List<DiaryDto> list(String diary_id) {
		return diaryMapper.list(diary_id);
	}
	
	@Override
	public List<SentimentDto> listSentiment(String member_id) {
		// TODO Auto-generated method stub
		return diaryMapper.listSentiment(member_id);
	}

	@Override
	public boolean create(DiaryDto diaryDto) {
		return diaryMapper.create(diaryDto) == 1;
	}

	@Override
	public boolean modify(DiaryDto diaryDto) {
		return diaryMapper.modify(diaryDto) == 1;
	}

	@Override
	public boolean delete(int diary_id) {
		return diaryMapper.delete(diary_id) == 1;
	}

	

}
