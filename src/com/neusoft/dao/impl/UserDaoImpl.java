package com.neusoft.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.neusoft.bean.User;
import com.neusoft.dao.UserDao;

public class UserDaoImpl implements UserDao{
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
				System.out.println("UserDaoImpl.save()");
				sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl.deleteUser()");
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl.updateUser()");
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public List<User> findUser(User user) {


//		System.out.println("UserDaoImpl.findUser()");
		Session session = sessionFactory.getCurrentSession();
		
		Criteria createCriteria = session.createCriteria(User.class);
		List list2 = createCriteria.add(Restrictions.eq("username",user.getUsername())).list();
		return list2;
	}

}
