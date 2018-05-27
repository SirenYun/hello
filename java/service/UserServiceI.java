package service;

import java.util.List;

import Controller.Usertable;

public interface UserServiceI {

	public Usertable getUserById(Integer id);

	public List<Usertable> getAll();

	public void insert(Usertable usertable);

	List<Usertable> getAll2();

	List<Usertable> getAll3();

	List<Usertable> getAll4();

	Usertable getByParameters(String name, String password);
}
