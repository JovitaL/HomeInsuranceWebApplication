package com.perscholas.case_study_home.models;

import com.perscholas.case_study_home.enums.UserRoleEn;

public class User {
	private String user_id;
	private String password;
	private UserRoleEn user_role;

	public User() {
		this.password = "";
		this.user_id = "";
	}

	public User(String user_id, String password) {
		this.user_id = user_id;
		this.password = password;
	}

	public User(String user_id, String password, String user_role) {
		this.user_id = user_id;
		this.password = password;
		try {
			this.user_role = UserRoleEn.valueOf(user_role);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return this.user_role.name();
	}

	public void setUserRole(String user_role) {
		this.user_role = UserRoleEn.valueOf(user_role);
	}
}
