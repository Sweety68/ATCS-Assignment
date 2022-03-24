package com.sj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {
	
	@Id
	@Column(name="tid",length=10)
   private int tId;
	@Column(name="tname",length=10)
   private String tName;
	@Column(name="tsal",length=10)
   private int tSal;
	@Column(name="tadd",length=10)
   private String tAdd;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int gettSal() {
		return tSal;
	}
	public void settSal(int tSal) {
		this.tSal = tSal;
	}
	public String gettAdd() {
		return tAdd;
	}
	public void settAdd(String tAdd) {
		this.tAdd = tAdd;
	}
   
    public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int tId, String tName, int tSal, String tAdd) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tSal = tSal;
		this.tAdd = tAdd;
	}
	@Override
	public String toString() {
		return "Trainee [tId=" + tId + ", tName=" + tName + ", tSal=" + tSal + ", tAdd=" + tAdd + "]";
	}
    
   
}
