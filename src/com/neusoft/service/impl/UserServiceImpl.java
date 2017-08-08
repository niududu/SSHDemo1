package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.User;
import com.neusoft.dao.UserDao;
import com.neusoft.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		if(null==user){
			System.out.println("user is null");
		}else{
			userDao.saveUser(user);
		}
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		if(null==user){
			System.out.println("user is null");
		}else{
			userDao.deleteUser(user);
		}
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		if(null==user){
			System.out.println("user is null");
		}else{
			userDao.updateUser(user);
		}
	}

	@Override
	public List<User> findUser(User user) {
		List<User> list = null;
		if(null==user){
			System.out.println("user is null");
			return null;
		}else{
			list=userDao.findUser(user);	
//			list.add(user);
			return list;
		}
		
		
	}
	
}
