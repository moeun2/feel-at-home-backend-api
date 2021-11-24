package com.athome.feel.model.service;


import com.athome.feel.model.FriendDto;
import com.athome.feel.model.LoginDto;
import com.athome.feel.model.MemberDto;

import java.util.List;

public interface MemberService {

    MemberDto findMemberByAccountId(LoginDto loginDto);

    void register(LoginDto loginDto);

    List<MemberDto> findFriend(int memberId);

    void addFriend(FriendDto friendDto);

    void deleteFriend(FriendDto friendDto);
}
