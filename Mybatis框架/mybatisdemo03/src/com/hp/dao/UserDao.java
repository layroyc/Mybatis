package com.hp.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.hp.entity.User;

public interface UserDao {
	//��¼
	User login(@Param("uname")String uname,@Param("upassword")String upassword);
	//����
	User selectById(@Param("uid")Integer uid);
	//ģ����ѯ
	ArrayList<User> selectLike(@Param("uname")String uname);
	//���ݸ������ֶ������������ѯ
	ArrayList<User> selectOrder(@Param("desc")String desc);
	//ȫ��
	ArrayList<User> selectAll();
	//ɾ��
	int delete(@Param("uid")int uid);
	//�޸�
	int update(User user);
	//����
	int add(User user);

}
