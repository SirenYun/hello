package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Controller.Usertable;
import dao.UsertableMapper;
import service.UserServiceI;



@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UsertableMapper userMapper;

	public Usertable getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<Usertable> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}

	public List<Usertable> getAll2() {
		return userMapper.getAll2();
	}

	public void insert(Usertable usertable) {
		userMapper.insertSelective(usertable);
	}

	public List<Usertable> getAll3() {
		// TODO Auto-generated method stub
		return userMapper.getAll3();
	}

	public List<Usertable> getAll4() {
		// TODO Auto-generated method stub
		return userMapper.getAll4();
	}

	public Usertable getByParameters(String name, String password) {
		// TODO Auto-generated method stub
		return userMapper.getByParameters(name, password);
	}
}
