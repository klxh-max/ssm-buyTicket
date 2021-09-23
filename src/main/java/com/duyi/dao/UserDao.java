package com.duyi.dao;

import com.duyi.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from dept")
    public List<User> findAll();
}
