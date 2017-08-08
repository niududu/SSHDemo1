package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.User;
import com.neusoft.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private int id;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String save() {
		System.out.println("UserAction.save()");
		//保存用户的数据
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		//调用业务逻辑层的userService接口来保存用户的数据
		userService.saveUser(user);
		return "savesuccess";
	}
	public String delete() {
		System.out.println("UserAction.delete()");
		//保存用户的数据
		User user = new User();
		user.setId(id);
		//调用业务逻辑层的userService接口来保存用户的数据
		userService.deleteUser(user);
		return "deletesuccess";
	}
	public String update() {
		System.out.println("UserAction.update()");
		//保存用户的数据
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		//调用业务逻辑层的userService接口来保存用户的数据
		userService.updateUser(user);
		return "updatesuccess";
	}
	
	public String find(){
		List<User> users = userService.findUser(user);
		for (User user2 : users) {
			System.out.println(user2);
		}
		ActionContext.getContext().put("users", users);
		//return NONE;
		return "findsuccess";
	}
}
