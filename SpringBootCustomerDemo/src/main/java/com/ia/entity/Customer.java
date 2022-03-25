package com.ia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="cid",length=10)
   private int cId;
	@Column(name="cname",length=10)
   private String cName;
	@Column(name="csal",length=10)
   private int cSal;
	@Column(name="cadd",length=10)
   private String cAdd;
   
    public int getcId() {
	 return cId;
   }
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public int getcSal() {
	return cSal;
}
public void setcSal(int cSal) {
	this.cSal = cSal;
}
public String getcAdd() {
	return cAdd;
}
public void setcAdd(String cAdd) {
	this.cAdd = cAdd;
}
   
    public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cId, String cName, int cSal, String cAdd) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cSal = cSal;
		this.cAdd = cAdd;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cSal=" + cSal + ", cAdd=" + cAdd + "]";
	}
    
    
   
}
