package com.dell.dsg.domain;


public class Identity extends Mapable {

	private String id;
	private String prodId;
	
	public Identity(String prodId) {
		super();
		this.prodId = prodId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
}
