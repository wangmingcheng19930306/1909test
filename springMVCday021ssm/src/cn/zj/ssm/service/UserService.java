package cn.zj.ssm.service;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserService {
     
	//1.���в�ѯ
	public List<User> selectListService();
	
	//2.�����û�
	public int insertService(User u);
	
	//3.ɾ���û�
	public int deleterByPrimaryKeyService(Integer id);
	
}