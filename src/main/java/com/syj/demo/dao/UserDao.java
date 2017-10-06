package com.syj.demo.dao;

import com.syj.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    public int insertUser(User user);

    User findUser(String username);

    User findUserByNameAndPw(@Param("username") String username,@Param("password")String password);
}
