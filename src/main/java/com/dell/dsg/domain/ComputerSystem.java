package com.dell.dsg.domain;

import java.util.Date;
import java.util.Map;

public class ComputerSystem extends ComputerSystemBase {
	private boolean virtual;
	private String osVersion;
	private String osArchitecture;
	private String osServicePack;
	private Date installDate;
	private String biosName;
	private String biosVersion;
	private String manufacture;
	private String model;
	private String processor;
	private Long ramTotal;

	public ComputerSystem(String prodId) {
		super(prodId);
	}
	
	public boolean isVirtual() {
		return virtual;
	}
	public void setVirtual(boolean virtual) {
		this.virtual = virtual;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getOsArchitecture() {
		return osArchitecture;
	}
	public void setOsArchitecture(String osArchitecture) {
		this.osArchitecture = osArchitecture;
	}
	public String getOsServicePack() {
		return osServicePack;
	}
	public void setOsServicePack(String osServicePack) {
		this.osServicePack = osServicePack;
	}
	public Date getInstallDate() {
		return installDate;
	}
	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}
	public String getBiosName() {
		return biosName;
	}
	public void setBiosName(String biosName) {
		this.biosName = biosName;
	}
	public String getBiosVersion() {
		return biosVersion;
	}
	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public Long getRamTotal() {
		return ramTotal;
	}
	public void setRamTotal(Long ramTotal) {
		this.ramTotal = ramTotal;
	}

	@SuppressWarnings("rawtypes")
	public void mapK1000(Map info) {
		Map comp = (Map) info.get("machine");
		//TODO why it has different keys? super.mapK1000(comp);
		setId(s_(comp.get("id")));
		setName(s_(comp.get("name")));
		setOsName(s_(comp.get("os_name")));
		//TODO data model for k1000? 
		setModel(s_(comp.get("cs_model")));
		setBiosName(s_(comp.get("cs_model")));
		setDomain(s_(comp.get("cs_model")));
		setManufacture(s_(comp.get("cs_model")));
		setProcessor(s_(comp.get("cs_model")));
	}
	
}
