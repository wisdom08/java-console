package com.corrine.oop;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner sc = new Scanner(System.in);
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String phonenum;

	// 전화번호가 없는 사람 객체를 위해서
	public PhoneBook(String name) {
		this.name = name;
	}

	public PhoneBook(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		
		while(!checkString(name)) {
			
			return;
		}
		this.name = name;
	}

	public String getPhonenum() {

		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		
		while(checkString(phonenum)) {
		
			return;
		}
		this.phonenum = phonenum;
	}

	
	public boolean checkString(String s) {
		
		char[] ch = s.toCharArray(); 
		for(char temp : ch) {
			if(Character.isDigit(temp)) {
				return false;
			}
		}
		return true;
	}
	
}
