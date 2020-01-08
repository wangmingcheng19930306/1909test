package cn.zj.ssm.service;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserService {
     
	//1.多行查询
	public List<User> selectListService();
	
	//2.添加用户
	public int insertService(User u);
	
	//3.删除用户
	public int deleterByPrimaryKeyService(Integer id);
	
}
