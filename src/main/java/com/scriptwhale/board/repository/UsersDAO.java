package com.scriptwhale.board.repository;

import com.scriptwhale.board.vo.User;

public interface UsersDAO {
    public User selectLogin(User user);
    public int insert(User user);
} // UsersDAO end
