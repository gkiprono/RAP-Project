package com.kiprono.models;

import javax.crypto.spec.SecretKeySpec;

public class Customers extends Users{
	@Override
	public boolean isVerified() {
		// TODO Auto-generated method stub
		return super.isVerified();
	}

	@Override
	public void setVerified(boolean verified) {
		// TODO Auto-generated method stub
		super.setVerified(verified);
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return super.getKey();
	}

	@Override
	public void setKey(String key) {
		// TODO Auto-generated method stub
		super.setKey(key);
	}

	private Accounts customerAccount;
	private int accountNumber;

	// getters and setters of accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public boolean isSudoer() {
		// TODO Auto-generated method stub
		return super.isSudoer();
	}

	@Override
	public void setSudoer(boolean isSudoer) {
		// TODO Auto-generated method stub
		super.setSudoer(isSudoer);
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return super.getCity();
	}

	@Override
	public void setCity(String city) {
		// TODO Auto-generated method stub
		super.setCity(city);
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.getUserName();
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		super.setUserName(userName);
	}

	@Override
	public String getPasswd() {
		// TODO Auto-generated method stub
		return super.getPasswd();
	}

	@Override
	public void setPasswd(String passwd) {
		// TODO Auto-generated method stub
		super.setPasswd(passwd);
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return super.isAdmin();
	}

	@Override
	public void setAdmin(boolean isAdmin) {
		// TODO Auto-generated method stub
		super.setAdmin(isAdmin);
	}

	@Override
	public int getUserId() {
		// TODO Auto-generated method stub
		return super.getUserId();
	}

	@Override
	public void setUserId(int userId) {
		// TODO Auto-generated method stub
		super.setUserId(userId);
	}

	public Accounts getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(Accounts customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return super.getState();
	}

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		super.setState(state);
	}

	@Override
	public int getZipCode() {
		// TODO Auto-generated method stub
		return super.getZipCode();
	}

	@Override
	public void setZipCode(int zipCode) {
		// TODO Auto-generated method stub
		super.setZipCode(zipCode);
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	@Override
	public String getMiddleInitial() {
		// TODO Auto-generated method stub
		return super.getMiddleInitial();
	}

	@Override
	public void setMiddleInitial(String middleInitial) {
		// TODO Auto-generated method stub
		super.setMiddleInitial(middleInitial);
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getPhoneNumber();
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		super.setPhoneNumber(phoneNumber);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

}
