package eshop.home.vo.response;

import java.util.List;

import eshop.home.entity.User;

public class UserListResponse {
	
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
