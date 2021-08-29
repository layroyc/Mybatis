package com.hp.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hp.dao.ClazzDao;
import com.hp.dao.PersonDao;
import com.hp.dao.StudentDao;
import com.hp.entity.Clazz;
import com.hp.entity.Person;
import com.hp.entity.Student;

public class Test01 {
	public static void main(String[] args) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(in);
		SqlSession sql = fa.openSession();
		StudentDao dao = sql.getMapper(StudentDao.class);
		/*Person person = dao.selectById(3);
		System.out.println(person);*/
		
		/*Clazz clazz = dao.selectById(1);
		System.out.println(clazz);*/
		
		Student stu = dao.selectC(2);
		System.out.println(stu);
		sql.close();
	}

}
