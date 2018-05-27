package dao;

import java.util.List;

import Controller.ClassDemo;



public interface ClassDemoMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(ClassDemo record);

	int insertSelective(ClassDemo record);

	ClassDemo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ClassDemo record);

	int updateByPrimaryKey(ClassDemo record);

	/**
	 * 鏌ヨ鎵�鏈変俊鎭�
	 * 
	 * @return
	 */
	List<ClassDemo> getAll();
}