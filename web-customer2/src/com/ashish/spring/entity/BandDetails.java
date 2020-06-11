package com.ashish.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="band_details")
public class BandDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private  int id;
	@Column(name="band_name")
	private String bandName;
	
	@Column(name="band_members")
	private String bandMembers;
	
	public BandDetails()
	{
		
		
	}

	public BandDetails(int id, String bandName, String bandMembers) {
		super();
		this.id = id;
		this.bandName = bandName;
		this.bandMembers = bandMembers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getBandMembers() {
		return bandMembers;
	}

	public void setBandMembers(String bandMembers) {
		this.bandMembers = bandMembers;
	}

	@Override
	public String toString() {
		return "BandDetails [id=" + id + ", bandName=" + bandName + ", bandMembers=" + bandMembers + "]";
	}

	

	

	
	
	
}
