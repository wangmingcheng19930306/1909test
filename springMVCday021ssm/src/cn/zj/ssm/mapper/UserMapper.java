package cn.zj.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.zj.ssm.pojo.User;

public interface UserMapper {

	//1.���в�ѯ
	@Select("select * from s_user")
	public List<User> selectList();
	
	//2.����û�
	@Insert("insert into s_user(username,password,age,phone,email) values(#{username},#{password},#{age},#{phone},#{email})")
	public  int insert(User user);
	
	//3.ɾ���û�
	@Delete("delete from s_user  where id=#{id}")
	public int deleteByPrimaryKey(Integer id);

    //4.��¼����
}
