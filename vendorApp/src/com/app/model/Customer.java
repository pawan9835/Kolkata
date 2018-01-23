package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUST_TAB")
public class Customer {
	@Id
	@GeneratedValue(generator="cust",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cust",sequenceName="CUST_SEQ")
	@Column(name="cid")
	private int custId;
	@Column(name="cname")
	private String custName;
	@Column(name="cmail")
	private String custEmail;
	@Column(name="creg")
	private int custRegNum;
	
	@Column(name="caddr")
	private String address;
	@Column(name="ctype")
	private String custType;
	@Column(name="cpwd")
	private String custPwd;
	@Column(name="ctoken")
	private String custToken;
	
	public Customer() {
	}

	public Customer(int custId) {
		this.custId = custId;
	}

	public Customer(int custId, String custName, String custEmail,
			int custRegNum, String address, String custType, String custPwd,
			String custToken) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custRegNum = custRegNum;
		this.address = address;
		this.custType = custType;
		this.custPwd = custPwd;
		this.custToken = custToken;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public int getCustRegNum() {
		return custRegNum;
	}

	public void setCustRegNum(int custRegNum) {
		this.custRegNum = custRegNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getCustPwd() {
		return custPwd;
	}

	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}

	public String getCustToken() {
		return custToken;
	}

	public void setCustToken(String custToken) {
		this.custToken = custToken;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", custEmail=" + custEmail + ", custRegNum=" + custRegNum
				+ ", address=" + address + ", custType=" + custType
				+ ", custPwd=" + custPwd + ", custToken=" + custToken + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((custEmail == null) ? 0 : custEmail.hashCode());
		result = prime * result + custId;
		result = prime * result
				+ ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((custPwd == null) ? 0 : custPwd.hashCode());
		result = prime * result + custRegNum;
		result = prime * result
				+ ((custToken == null) ? 0 : custToken.hashCode());
		result = prime * result
				+ ((custType == null) ? 0 : custType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (custEmail == null) {
			if (other.custEmail != null)
				return false;
		} else if (!custEmail.equals(other.custEmail))
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (custPwd == null) {
			if (other.custPwd != null)
				return false;
		} else if (!custPwd.equals(other.custPwd))
			return false;
		if (custRegNum != other.custRegNum)
			return false;
		if (custToken == null) {
			if (other.custToken != null)
				return false;
		} else if (!custToken.equals(other.custToken))
			return false;
		if (custType == null) {
			if (other.custType != null)
				return false;
		} else if (!custType.equals(other.custType))
			return false;
		return true;
	}
	
	
	
}
