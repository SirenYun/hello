package utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.portable.InputStream;

public class DbUtils {
	
	public static SqlSessionFactory getSession(){
		try {
			java.io.InputStream inputStream = Resources.getResourceAsStream("com/springdemo/mapper/mybatis-config.xml");// ��ȡconfig�ļ��� ע�ⷴб��
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory; //���sqlSessionFactory.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
