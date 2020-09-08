package com.corrine.oop;

import java.io.Serializable;

public class Employee extends Address implements Serializable {

	private String department;
	private String position;
	private String nickName; // 필수값 아니다.

	public Employee() {
	}

	public Employee(String name, String phonenum, String address, String department, String position, String nickName) {
		super(name, phonenum, address);
		this.department = department;
		this.position = position;
		this.nickName = nickName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {

		while (!checkString(department)) {
			return;
		}
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {

		while (!checkString(position)) {
			return;
		}
		this.position = position;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {

		while (!checkString(nickName)) {
			return;
		}
		this.nickName = nickName;
	}

	public void printSpect() {

		String print = " department:::" + department + " position:::" + position + " nickName:::" + nickName;
		print = "name:::" + super.getName() + " address:::" + super.getAddress() + " phonenum:::" + super.getPhonenum()
				+ print;

		System.out.println(print);
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", position=" + position + ", nickName=" + nickName + "]";
	}

}
