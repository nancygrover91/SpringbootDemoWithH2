package com.example.OperateWashMachine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="WASHMACHINE")
public class WashMachine {
	
	@Id
	@Column(name="MACHINE_ID")
	private int machineId;
	
	@Column(name="MACHINE_BRAND")
	private String machineBrand;
	
	@Column(name="MACHINE_VERSION")
	private String machineVersion;
	
	@Column(name="MACHINE_TYPE")
	private String machineType;
	
	@Column(name="PRICE")
	private double price;

	public int getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	public String getMachineBrand() {
		return machineBrand;
	}

	public void setMachineBrand(String machineBrand) {
		this.machineBrand = machineBrand;
	}

	public String getMachineVersion() {
		return machineVersion;
	}

	public void setMachineVersion(String machineVersion) {
		this.machineVersion = machineVersion;
	}

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
