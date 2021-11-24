package com.athome.feel.model.service;

import com.athome.feel.model.FriendDto;
import com.athome.feel.model.LoginDto;
import com.athome.feel.model.MemberDto;
import com.athome.feel.model.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    SqlSession sqlSession;

    @Override
    public MemberDto findMemberByAccountId(LoginDto loginDto) {
        return sqlSession.getMapper(MemberMapper.class).findByAccountId(loginDto.getId());
    }

    @Override
    public void register(LoginDto loginDto) {
        sqlSession.getMapper(MemberMapper.class).insertMember(loginDto);
    }

    @Override
    public List<MemberDto> findFriend(int memberId) {
        return sqlSession.getMapper(MemberMapper.class).findFriend(memberId);
    }

    @Override
    public void addFriend(FriendDto friendDto) {
        sqlSession.getMapper(MemberMapper.class).addFriend(friendDto);
    }

    @Override
    public void deleteFriend(FriendDto friendDto) {
        sqlSession.getMapper(MemberMapper.class).deleteFriend(friendDto);
    }

    @Override
    public List<MemberDto> searchName(String name) {
        return sqlSession.getMapper(MemberMapper.class).findByNameLike(name);
    }
}
