package com.dell.dsg.model.old;

import javax.xml.bind.annotation.XmlElement;

public class Partition {

	private String PartitionId;
	private String PartitionFileSystem;
	private Long PartitionSize;
	private Long PartitionFreeSpace;
	
	@XmlElement
	public String getPartitionId() {
		return PartitionId;
	}
	public void setPartitionId(String partitionId) {
		PartitionId = partitionId;
	}
	
	@XmlElement
	public String getPartitionFileSystem() {
		return PartitionFileSystem;
	}
	public void setPartitionFileSystem(String partitionFileSystem) {
		PartitionFileSystem = partitionFileSystem;
	}
	
	@XmlElement
	public Long getPartitionSize() {
		return PartitionSize;
	}
	public void setPartitionSize(Long partitionSize) {
		PartitionSize = partitionSize;
	}
	
	@XmlElement
	public Long getPartitionFreeSpace() {
		return PartitionFreeSpace;
	}
	public void setPartitionFreeSpace(Long partitionFreeSpace) {
		PartitionFreeSpace = partitionFreeSpace;
	}

}
