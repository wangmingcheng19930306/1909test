package cn.zj.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.ssm.mapper.UserMapper;
import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> selectListService() {
		List<User>list=mapper.selectList();
		return list;
	}

	@Override
	public int insertService(User u) {
		 int num=mapper.insert(u);
		return num;
	}

	@Override
	public int deleterByPrimaryKeyService(Integer id) {
		 int num=mapper.deleteByPrimaryKey(id);
		return num;
	}

}
