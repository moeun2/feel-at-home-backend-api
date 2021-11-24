package com.athome.feel.controller;

import com.athome.feel.model.MusicDto;
import com.athome.feel.model.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    MusicService musicService;

    @PostMapping("/recommend")
    public ResponseEntity<?> recommend(@RequestBody List<MusicDto> musicDtos) {
        musicService.addMusicIfAbsent(musicDtos);
        return ResponseEntity.ok().build();
    }

    // song_like 테이블 만들고
    // 사용자가 좋아요 누르면 post 로 song_id, member_id 보내고
    // PostMapping - song_id, member_id 받아서 db 에 저장
    // @PostMapping("/url")
    //
}
