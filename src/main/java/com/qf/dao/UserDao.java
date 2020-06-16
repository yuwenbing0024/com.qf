package com.qf.dao;

import com.qf.entity.User;

public interface UserDao {
    User selectById(Integer id);
}
