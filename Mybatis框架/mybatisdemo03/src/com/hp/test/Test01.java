package com.hp.test;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hp.dao.UserDao;
import com.hp.entity.User;

public class Test01 {
	@Test
	//��¼
	public void testlogin() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		User login = dao.login("admin", "123456");
		System.out.println(login);
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//����
	public void testById() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		User i = dao.selectById(3);
		System.out.println(i);
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//ģ����ѯ
	public void testLike() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		ArrayList<User> users = dao.selectLike("r");
		for (User user : users) {
			System.out.println(user);
		}
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//�����ѯ
	public void testOrder() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		ArrayList<User> users = dao.selectOrder("age");
		for (User user : users) {
			System.out.println(user);
		}
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//ȫ��
	public void testAll() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		ArrayList<User> users = dao.selectAll();
		for (User user : users) {
			System.out.println(user);
		}
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//ɾ��
	public void testDel() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		int i = dao.delete(11);
		System.out.println(i);
		//�ֶ��ύ
		sqlSession.commit();
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//�޸�
	public void testUpdate() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		User user = new User(12,"cxk","1008",19,"��");
		dao.update(user);
		System.out.println(user);
		//�ֶ��ύ
		sqlSession.commit();
		//6���ͷ���Դ
		sqlSession.close();
	}

	@Test
	//���
	public void testAdd() throws Exception {
		//1����ȡmybatis���������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2������sqlsessionfactory����
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3������sqlsession����
		SqlSession sqlSession = ft.openSession();
		//4����ȡʵ�������
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5�����÷���
		User user = new User(null,"roy","1106",19,"��");
		dao.add(user);
		System.out.println(user);
		//�ֶ��ύ
		sqlSession.commit();
		//6���ͷ���Դ
		sqlSession.close();
	}

	
}
