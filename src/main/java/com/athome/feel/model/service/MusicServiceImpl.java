package com.athome.feel.model.service;

import com.athome.feel.model.MusicDto;
import com.athome.feel.model.mapper.MusicMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{

    @Autowired
    SqlSession sqlSession;

    @Override
    public void addMusicIfAbsent(List<MusicDto> musicDtos) {
        for (MusicDto musicDto : musicDtos) {
            MusicDto foundDto = sqlSession.getMapper(MusicMapper.class).findById(musicDto.getYoutube_id());
            if (foundDto == null) {
                sqlSession.getMapper(MusicMapper.class).insertSong(musicDto);
            }
        }
    }
}
