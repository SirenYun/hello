package sy.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import sy.entity.Usertable;
import sy.service.UserServiceI;

//SpringJunit测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	@Autowired
	private UserServiceI uservice;

	@Test
	public void test_getUserById() {
		Usertable user = uservice.getUserById(1);
		System.out.println("============");
		logger.info(JSON.toJSONString(user));
		System.out.println("============");
	}

	@Test
	public void test_getAll() {
		List<Usertable> list = uservice.getAll();
		System.out.println("============");
		logger.info(JSON
				.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("============");
	}

	@Test
	public void test_getAll2() {
		List<Usertable> list = uservice.getAll2();
		System.out.println("============");
		logger.info(JSON
				.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("============");
	}

	@Test
	public void test_getAll3() {
		List<Usertable> list = uservice.getAll3();
		System.out.println("============");
		logger.info(JSON
				.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("============");
	}

	@Test
	public void test_getAll4() {
		List<Usertable> list = uservice.getAll4();
		System.out.println("============");
		logger.info(JSON
				.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("============");
	}

	@Test
	public void test_insert() {
		Usertable u = new Usertable();
		u.setUsername("lily");
		u.setPassword("123456");
		uservice.insert(u);
	}

	@Test
	public void test_getByParameters() {
		Usertable u = new Usertable();
		u.setUsername("lily");
		u.setPassword("lily");
		u = uservice.getByParameters(u.getUsername(), u.getPassword());
		System.out.println("============");
		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("============");
	}
}
