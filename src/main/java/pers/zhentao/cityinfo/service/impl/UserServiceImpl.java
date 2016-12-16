package pers.zhentao.cityinfo.service.impl;

import java.util.List;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pers.zhentao.cityinfo.dao.InfoMapper;
import pers.zhentao.cityinfo.dao.TypeMapper;
import pers.zhentao.cityinfo.dao.UserMapper;
import pers.zhentao.cityinfo.pojo.Info;
import pers.zhentao.cityinfo.pojo.Type;
import pers.zhentao.cityinfo.pojo.User;
import pers.zhentao.cityinfo.pojo.UserExample;
import pers.zhentao.cityinfo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Resource
	private TypeMapper typeMapper;
	
	@Resource
	private InfoMapper infoMapper;
	
	@Resource
	private UserMapper userMapper;
	
	public TreeMap getAllType() {
		TreeMap typeMap = new TreeMap();
		List<Type> list = typeMapper.selectByExample(null);
		if(list != null)
			for(int i=0;i<list.size();i++){
				typeMap.put(list.get(i).getTypeSign(), list.get(i).getTypeIntro());
			}
		return typeMap;
	}

	public List getAllInfo() {
		List<Info> list = infoMapper.selectByExample(null);
		return list;
	}

	public boolean login(String userName, String password) {
		UserExample example = new UserExample();
		example.or().andUserNameEqualTo(userName).andUserPasswordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list.size()>0)return true;
		else return false;
	}

}
