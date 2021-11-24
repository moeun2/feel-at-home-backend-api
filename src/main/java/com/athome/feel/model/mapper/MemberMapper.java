package com.athome.feel.model.mapper;

import com.athome.feel.model.FriendDto;
import com.athome.feel.model.LoginDto;
import com.athome.feel.model.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    void insertMember(LoginDto loginDto);

    MemberDto findByAccountId(String accountId);

    List<MemberDto> findFriend(int memberId);

    void addFriend(FriendDto friendDto);

    void deleteFriend(FriendDto friendDto);

    List<MemberDto> findByNameLike(String name);
}
