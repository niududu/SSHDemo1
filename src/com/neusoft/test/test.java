package com.neusoft.test;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.bean.User;
import com.neusoft.service.UserService;

public class test {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=ctx.getBean("userService",UserService.class);
		
		/**��������
		User user=new User();
		user.setId(666);
		user.setUsername("aaa");
		user.setPassword("123");
		us.saveUser(user);
		*/
		/**
		ɾ������	
		User user=new User();
		user.setId(666);
		us.deleteUser(user);**/
		/**�޸�����
		User user=new User();
		user.setId(2);
		user.setUsername("aaa");
		user.setPassword("666");
		us.updateUser(user);
		**/
		/**���ҹ��ܣ����ǿ��
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setId(1);
		list=us.findUser(user);
		System.out.println(list); 
		**/
		
		
		
	}

}
