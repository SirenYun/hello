package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Controller.Usertable;



public interface UsertableMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Usertable record);

	int insertSelective(Usertable record);

	Usertable selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Usertable record);

	int updateByPrimaryKey(Usertable record);

	/**
	 * 鏌ヨ鎵�鏈変俊鎭�
	 * 
	 * @return
	 */
	List<Usertable> getAll();

	List<Usertable> getAll2();

	List<Usertable> getAll3();

	List<Usertable> getAll4();

	/**
	 * 甯﹀涓弬鏁�
	 */
	Usertable getByParameters(@Param("nn") String name,
			@Param("np") String password);

}