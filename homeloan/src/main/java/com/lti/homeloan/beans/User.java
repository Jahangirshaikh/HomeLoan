package com.lti.homeloan.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
		
		@Id
		@Column(name="USERID")
		private int userId;
		@Column(name="PASSWORD")
		private String password;
		@Column(name="USERTYPE")
		private String userType;
		
		
		public User() {
			super();
		}


		public User(int userId, String password, String userType) {
			super();
			this.userId = userId;
			this.password = password;
			this.userType = userType;
		}


		public int getUserId() {
			return userId;
		}


		public void setUserId(int userId) {
			this.userId = userId;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getUserType() {
			return userType;
		}


		public void setUserType(String userType) {
			this.userType = userType;
		}


		@Override
		public String toString() {
			return "User [userId=" + userId + ", password=" + password + ", userType=" + userType + "]";
		}
		
		
		
}
