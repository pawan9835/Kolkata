package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VEN_TAB")
public class Vendor {
	@Id
	@GeneratedValue(generator="ven",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="ven",sequenceName="ven_seq")
	@Column(name="v_id")
	private int venId;
	@Column(name="v_name")
	private String venName;
	@Column(name="v_mail")
	private String venEmail;
	
	//HAS-A
	@ManyToOne
	@JoinColumn(name="locFk")
	private Location loc;

	public Vendor() {
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName
				+ ", venEmail=" + venEmail + ", loc=" + loc + "]";
	}

		
}
