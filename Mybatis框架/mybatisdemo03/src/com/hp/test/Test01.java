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
	//登录
	public void testlogin() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		User login = dao.login("admin", "123456");
		System.out.println(login);
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//单查
	public void testById() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		User i = dao.selectById(3);
		System.out.println(i);
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//模糊查询
	public void testLike() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		ArrayList<User> users = dao.selectLike("r");
		for (User user : users) {
			System.out.println(user);
		}
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//排序查询
	public void testOrder() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		ArrayList<User> users = dao.selectOrder("age");
		for (User user : users) {
			System.out.println(user);
		}
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//全查
	public void testAll() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		ArrayList<User> users = dao.selectAll();
		for (User user : users) {
			System.out.println(user);
		}
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//删除
	public void testDel() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		int i = dao.delete(11);
		System.out.println(i);
		//手动提交
		sqlSession.commit();
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//修改
	public void testUpdate() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		User user = new User(12,"cxk","1008",19,"男");
		dao.update(user);
		System.out.println(user);
		//手动提交
		sqlSession.commit();
		//6、释放资源
		sqlSession.close();
	}

	@Test
	//添加
	public void testAdd() throws Exception {
		//1、读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//2、创建sqlsessionfactory工厂
		SqlSessionFactory ft = new SqlSessionFactoryBuilder().build(in);
		//3、创建sqlsession对象
		SqlSession sqlSession = ft.openSession();
		//4、获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//5、调用方法
		User user = new User(null,"roy","1106",19,"男");
		dao.add(user);
		System.out.println(user);
		//手动提交
		sqlSession.commit();
		//6、释放资源
		sqlSession.close();
	}

	
}
