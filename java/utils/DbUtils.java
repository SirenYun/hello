package utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.portable.InputStream;

public class DbUtils {
	
	public static SqlSessionFactory getSession(){
		try {
			java.io.InputStream inputStream = Resources.getResourceAsStream("com/springdemo/mapper/mybatis-config.xml");// 获取config文件。 注意反斜杠
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory; //获得sqlSessionFactory.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
