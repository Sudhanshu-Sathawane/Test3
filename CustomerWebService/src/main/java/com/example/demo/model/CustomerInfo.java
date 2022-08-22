package com.example.demo.model;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class CustomerInfo {
	@Id
	private int customerId;
	private String customerName;
	private String customerPhone;
	private String customerAddress;
	private String customerLoginId;
	private String customerPassword;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerLoginId() {
		return customerLoginId;
	}
	public void setCustomerLoginId(String customerLoginId) {
		this.customerLoginId = customerLoginId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerAddress=" + customerAddress + ", customerLoginId=" + customerLoginId
				+ ", customerPassword=" + customerPassword + "]";
	}
	
}
