package Controller;

import java.util.List;

public class Usertable {
	
	private Integer id;
	private String username;
	private String password;

	private List<UserClasses> userClasses;
	private List<ClassDemo> classDemoList;

	public List<ClassDemo> getClassDemoList() {
		return classDemoList;
	}

	public void setClassDemoList(List<ClassDemo> classDemoList) {
		this.classDemoList = classDemoList;
	}

	public Integer getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public List<UserClasses> getUserClasses() {
		return userClasses;
	}

	public String getUsername() {
		return username;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public void setUserClasses(List<UserClasses> userClasses) {
		this.userClasses = userClasses;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

}