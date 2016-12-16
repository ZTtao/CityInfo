package pers.zhentao.cityinfo.service;

import java.util.List;
import java.util.TreeMap;

public interface IUserService {
	TreeMap getAllType();
	List getAllInfo();
	boolean login(String userName,String password);
}
