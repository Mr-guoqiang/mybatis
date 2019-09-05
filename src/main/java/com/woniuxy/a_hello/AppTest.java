package com.woniuxy.a_hello;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {
@Test
public void testName() throws Exception {
	//加载主配置文件
	InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
	//创建工厂
	SqlSessionFactory sf= new SqlSessionFactoryBuilder().build(in);
	// 从工厂中获取出会话，每一个会话都封装了一个Connection。
	// 获取会话的时候，事务就自动开启了，不用写任何api！
	SqlSession s=sf.openSession(true);
	//=====================================================================
	
	User u=new User();
	
	
	
	//=====================================================================
	//关闭会话
	s.close();
	
}
}
