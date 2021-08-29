package com.hp.test;

import java.io.IOException;
import java.io.InputStream;

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
		User user = dao.selectById(5);
		System.out.println(user);
		//�ر���Դ
		sqlSession.close();
	}

}
