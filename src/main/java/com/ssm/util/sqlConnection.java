package com.ssm.util;

import java.io.IOException;
import java.io.InputStream;




import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlConnection {
	public static SqlSessionFactory getSessionFactory(String mapper) throws IOException{
		//mybatis配置文件
		String resource = "com/ssm/mapping/"+mapper;
		//得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置文件
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
}
