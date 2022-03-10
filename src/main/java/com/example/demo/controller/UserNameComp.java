package com.example.demo.controller;

import com.example.demo.entity.User;

import java.util.Comparator;

public class UserNameComp implements Comparator< User>{
	
	public int compare(User user1, User user2) {
		
					
	return user1.getName().compareTo(user2.getName());
			
	 }
}
