package com.dell.dsg.model.old;

import javax.xml.bind.annotation.XmlElement;

public class Disk {

	private String diskId;
    private Long diskSize;
	
    @XmlElement(name="Disk_Id")
    public String getDiskId() {
		return diskId;
	}
	public void setDiskId(String diskId) {
		this.diskId = diskId;
	}
	
	@XmlElement(name="Disk_Size")
	public Long getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(Long diskSize) {
		this.diskSize = diskSize;
	}
	
}
