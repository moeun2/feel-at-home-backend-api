package com.athome.feel.model;

public class FriendDto {

    private final int memberId;
    private final int friendId;

    public FriendDto(int memberId, int friendId) {
        this.memberId = memberId;
        this.friendId = friendId;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getFriendId() {
        return friendId;
    }
}
