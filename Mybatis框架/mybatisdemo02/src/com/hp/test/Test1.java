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
		//读取mybatis核心配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession sqlSession = factory.openSession();
		//获取实现类对象
		UserDao dao = sqlSession.getMapper(UserDao.class);
		//调用方法
		/*单查
		 * User user = dao.selectById(5);
		System.out.println(user);*/

		//登录	多个参数
		/*User user = dao.selectUP("roy", "1108");
		System.out.println(user);*/
		
		//map 多个参数
		/*Map<String,String> map = new HashMap<String,String>();
		map.put("uname", "root");
		map.put("upassword", "root");
		User user = dao.selectUP2(map);
		System.out.println(user);*/

		//全查
		/*ArrayList<User> users = dao.selectAll();
		for (User user : users) {
			System.out.println(user);
		}*/
		
		//模糊查询
		ArrayList<User> users = dao.selectLike("小");
		for (User user : users) {
			System.out.println(user);
		}
		
		//添加
		User user = new User("朗朗","123456");
		dao.add(user);
		System.out.println(user);

		/*删除
		 * int i = dao.delete(7);
		System.out.println(i);*/

		/*修改
		User us = new User(8,"小王","147258");
		dao.update(us);
		System.out.println(us);*/

		//提交	除了查询其他都需要手动提交回滚
		sqlSession.commit();
		//关闭资源
		sqlSession.close();
	}

}
