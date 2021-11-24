package com.athome.feel.model.service;

import com.athome.feel.model.MusicDto;

import java.util.List;

public interface MusicService {

    void addMusicIfAbsent(List<MusicDto> musicDtos);
}
