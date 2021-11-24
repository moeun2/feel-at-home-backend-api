package com.athome.feel.controller;

import com.athome.feel.model.FriendDto;
import com.athome.feel.model.LoginDto;
import com.athome.feel.model.MemberDto;
import com.athome.feel.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        MemberDto memberDto = memberService.findMemberByAccountId(loginDto);
        if (memberDto == null) {
            memberService.register(loginDto);
            memberDto = memberService.findMemberByAccountId(loginDto);
        }
        return ResponseEntity.ok(memberDto);
    }

    @GetMapping("/friend/{memberId}")
    public ResponseEntity<?> friend(@PathVariable("memberId") int memberId) {
        List<MemberDto> friends = memberService.findFriend(memberId);
        return ResponseEntity.ok(friends);
    }

    @PostMapping("/friend")
    public ResponseEntity<?> addFriend(@RequestBody FriendDto friendDto) {
        memberService.addFriend(friendDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> searchName(@RequestParam("name") String name) {
        List<MemberDto> memberDtos = memberService.searchName(name);
        return ResponseEntity.ok(memberDtos);
    }

}
