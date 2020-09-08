package com.corrine.oop;

public class Address extends PhoneBook {

	private String address;

	public Address() {

	}

	public Address(String name, String address) {
		super(name);
		this.address = address;
	}

	public Address(String name, String phonenum, String address) {
		super(name, phonenum);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {

		while (!checkString(address)) {
			return;
		}
		this.address = address;
	}

}
