package pers.zhentao.cityinfo.service;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.zhentao.cityinfo.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-mybatis.xml"})
public class UserServiceTest {
	@Resource
	private UserServiceImpl userService;
	
	@Test
	public void getListBoxTest(){
		TreeMap map = userService.getAllType();
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj+":"+map.get(obj));
		}
	}
}
