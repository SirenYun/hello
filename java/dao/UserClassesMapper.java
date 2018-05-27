package dao;

import java.util.List;

import Controller.UserClasses;



public interface UserClassesMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(UserClasses record);

	int insertSelective(UserClasses record);

	UserClasses selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UserClasses record);

	int updateByPrimaryKey(UserClasses record);

	/**
	 * 鏌ヨ鎵�鏈変俊鎭�
	 * 
	 * @return
	 */
	List<UserClasses> getAll();
}