/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springdemo.Userservice;

import com.example.springdemo.mapper.IUserMapper;
import com.example.springdemo.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 73431
 */
@Service
public class UserService {

	@Autowired
	private IUserMapper userMapper;

	public List<User> queryUser() {
		return userMapper.query();
	}
}
