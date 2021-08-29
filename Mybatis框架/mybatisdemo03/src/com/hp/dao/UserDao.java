package com.hp.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.hp.entity.User;

public interface UserDao {
	//登录
	User login(@Param("uname")String uname,@Param("upassword")String upassword);
	//单查
	User selectById(@Param("uid")Integer uid);
	//模糊查询
	ArrayList<User> selectLike(@Param("uname")String uname);
	//根据给定的字段名进行排序查询
	ArrayList<User> selectOrder(@Param("desc")String desc);
	//全查
	ArrayList<User> selectAll();
	//删除
	int delete(@Param("uid")int uid);
	//修改
	int update(User user);
	//增加
	int add(User user);

}
