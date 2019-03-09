package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.demo.user.entity.User;
import com.example.demo.user.mapper.UserMapper;

@Controller
public class HelloSpringBoot {
	@Autowired private UserMapper userMapper;
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (Model model){
        System.out.println("hello spring boot");
        model.addAttribute("name", "何绍江");
        return "MyJsp";
    }
    @ResponseBody
    @RequestMapping(path = {"/getUser"})
    public List<User> getUser (){
    	User user = new User();
    	user.setId(1);
    	Wrapper<User> test = new EntityWrapper<User>(user,"name");
        return userMapper.selectList(test);
    }
    
    @ResponseBody
    @RequestMapping(path = {"/getUserOne1"})
    public User getUserOne (){
        return userMapper.selectMethod();
    }
}
