package com.hp.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hp.entity.User;

public interface UserDao {
	//����
	User selectById(int uid);
	//ȫ��
	ArrayList<User> selectAll(); 
	
	//ģ����ѯ
	ArrayList<User> selectLike(String uname);
	
	//��¼   �������
	/*��ͨ���±��	ȱ�㣺�ɶ��Բ���
	 * User selectUP(String uname,String upassword);*/
	
	/*��ͨ��ע��󶨣��ص㣩*/
	User selectUP(@Param("uname")String uname,@Param("upassword")String upassword);
	/*��ͨ��map���ϵķ�ʽ�󶨣���⣩	���������ͳһ����*/
	User selectUP2(Map<String, String> map);
	
	
	//ɾ��
	int delete(int uid);
	
	//��ͨ������ķ�ʽ�󶨣��ص㣩
	//���
	int add(User user);
	//�޸�
	int update(User user);
}
