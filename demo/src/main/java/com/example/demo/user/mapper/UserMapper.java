package com.example.demo.user.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.user.entity.User;


public interface UserMapper extends BaseMapper<User> {
	User selectMethod();
}
