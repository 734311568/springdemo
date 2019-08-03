/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springdemo.mapper;

import com.example.springdemo.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author 73431
 */
public interface IUserMapper {

	/**
	 *
	 * @param id
	 * @return
	 */
	@Select("SELECT id,user_name userName, pass_word password FROM user ")
	List<User> query();
}
