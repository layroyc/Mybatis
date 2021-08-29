package com.hp.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hp.dao.UserDao;
import com.hp.entity.User;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//��ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//����SqlSessionFactory����
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//����SqlSession����
		SqlSession sqlSession = factory.openSession();
		//��ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//���÷���
		/*����
		 * User user = dao.selectById(5);
		System.out.println(user);*/

		//��¼	�������
		/*User user = dao.selectUP("roy", "1108");
		System.out.println(user);*/
		
		//map �������
		/*Map<String,String> map = new HashMap<String,String>();
		map.put("uname", "root");
		map.put("upassword", "root");
		User user = dao.selectUP2(map);
		System.out.println(user);*/

		//ȫ��
		/*ArrayList<User> users = dao.selectAll();
		for (User user : users) {
			System.out.println(user);
		}*/
		
		//ģ����ѯ
		ArrayList<User> users = dao.selectLike("С");
		for (User user : users) {
			System.out.println(user);
		}
		
		//���
		User user = new User("����","123456");
		dao.add(user);
		System.out.println(user);

		/*ɾ��
		 * int i = dao.delete(7);
		System.out.println(i);*/

		/*�޸�
		User us = new User(8,"С��","147258");
		dao.update(us);
		System.out.println(us);*/

		//�ύ	���˲�ѯ��������Ҫ�ֶ��ύ�ع�
		sqlSession.commit();
		//�ر���Դ
		sqlSession.close();
	}

}
