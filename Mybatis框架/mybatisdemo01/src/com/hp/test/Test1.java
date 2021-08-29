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
		//读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession sqlSession = factory.openSession();
		//获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//调用方法
		User user = dao.selectById(5);
		System.out.println(user);
		//关闭资源
		sqlSession.close();
	}

}
