package com.woniuxy.a_hello;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {
@Test
public void testName() throws Exception {
	//�����������ļ�
	InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
	//��������
	SqlSessionFactory sf= new SqlSessionFactoryBuilder().build(in);
	// �ӹ����л�ȡ���Ự��ÿһ���Ự����װ��һ��Connection��
	// ��ȡ�Ự��ʱ��������Զ������ˣ�����д�κ�api��
	SqlSession s=sf.openSession(true);
	//=====================================================================
	
	User u=new User();
	
	
	
	//=====================================================================
	//�رջỰ
	s.close();
	
}
}
