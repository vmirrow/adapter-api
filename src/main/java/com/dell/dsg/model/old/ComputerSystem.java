package com.dell.dsg.model.old;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;

//@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "ComputerSystem")
@XmlType(propOrder = { "Id", "Hostname", "Virtual", "Domain", "OSName", "OSVersion", "OSArchitecture", "OSServicePack", "OSUptime", "InstallDate", "BIOSName", "BIOSVersion", "Manufacture", "Model", "Processor", "RAMTotal", "Disks", "Partitions" } )
@XmlAccessorType(XmlAccessType.FIELD)
public class ComputerSystem {
	@XmlElement
	private Integer Id;
	@XmlElement
	private String Hostname;
	@XmlElement
	private boolean Virtual;
	@XmlElement
	private String Domain;
	@XmlElement
	private String OSName;
	@XmlElement
	private String OSVersion;
	@XmlElement
	private String OSArchitecture;
	@XmlElement
	private String OSServicePack;
	@XmlElement
	private String OSUptime;
	@XmlElement
	private Date InstallDate;
	@XmlElement
	private String BIOSName;
	@XmlElement
	private String BIOSVersion;
	@XmlElement
	private String Manufacture;
	@XmlElement
	private String Model;
	@XmlElement
	private String Processor;
	@XmlElement
	private Long RAMTotal;
	@XmlElement(name="Disk")
	@XmlElementWrapper(name="Disks")
	private List<Disk> Disks = new ArrayList<Disk>();
	@XmlElement(name="Partition")
	@XmlElementWrapper(name="Partitions")
	private List<Partition> Partitions = new ArrayList<Partition>();
    	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
	
	public String getHostname() {
		return Hostname;
	}

	public void setHostname(String hostname) {
		Hostname = hostname;
	}

	public boolean getVirtual() {
		return Virtual;
	}

	public void setVirtual(boolean virtual) {
		Virtual = virtual;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getOSName() {
		return OSName;
	}

	public void setOSName(String oSName) {
		OSName = oSName;
	}

	public String getOSVersion() {
		return OSVersion;
	}

	public void setOSVersion(String oSVersion) {
		OSVersion = oSVersion;
	}

	public String getOSArchitecture() {
		return OSArchitecture;
	}

	public void setOSArchitecture(String oSArchitecture) {
		OSArchitecture = oSArchitecture;
	}

	public String getOSServicePack() {
		return OSServicePack;
	}

	public void setOSServicePack(String oSServicePack) {
		OSServicePack = oSServicePack;
	}

	public String getOSUptime() {
		return OSUptime;
	}

	public void setOSUptime(String oSUptime) {
		OSUptime = oSUptime;
	}

	public Date getInstallDate() {
		return InstallDate;
	}

	public void setInstallDate(Date installDate) {
		InstallDate = installDate;
	}

	public String getBIOSName() {
		return BIOSName;
	}

	public void setBIOSName(String bIOSName) {
		BIOSName = bIOSName;
	}

	public String getBIOSVersion() {
		return BIOSVersion;
	}

	public void setBIOSVersion(String bIOSVersion) {
		BIOSVersion = bIOSVersion;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public Long getRAMTotal() {
		return RAMTotal;
	}

	public void setRAMTotal(Long rAMTotal) {
		RAMTotal = rAMTotal;
	}
	
	public List<Disk> getDisks() {
		return Disks;
	}

	public void setDisks(List<Disk> disk) {
		Disks = disk;
	}

	public List<Partition> getPartitions() {
		return Partitions;
	}

	public void setPartitions(List<Partition> partition) {
		this.Partitions = partition;
	}	

	public Disk getDisk(String id) {
		//TODO
		return new Disk();
	}
	
}
