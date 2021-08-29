package com.hp.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hp.entity.User;

public interface UserDao {
	//单查
	User selectById(int uid);
	//全查
	ArrayList<User> selectAll(); 
	
	//模糊查询
	ArrayList<User> selectLike(String uname);
	
	//登录   多个参数
	/*①通过下标绑定	缺点：可读性不高
	 * User selectUP(String uname,String upassword);*/
	
	/*②通过注解绑定（重点）*/
	User selectUP(@Param("uname")String uname,@Param("upassword")String upassword);
	/*③通过map集合的方式绑定（理解）	方便参数的统一管理*/
	User selectUP2(Map<String, String> map);
	
	
	//删除
	int delete(int uid);
	
	//④通过对象的方式绑定（重点）
	//添加
	int add(User user);
	//修改
	int update(User user);
}
