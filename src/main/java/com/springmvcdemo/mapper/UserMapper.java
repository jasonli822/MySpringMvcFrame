package com.springmvcdemo.mapper;

import com.springmvcdemo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User findById(int userId);

    int deleteById(int userId);

    int insert(User user);

    int update(User user);

    List<User> getAll();
}
