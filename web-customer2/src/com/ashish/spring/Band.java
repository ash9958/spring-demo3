package com.ashish.spring;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Band {

	
	
	private String bandname;
	private LinkedHashMap<Object,String> bandOps;
	private ArrayList<String> m1;
	private ArrayList<String> m2;
	
	public Band()
	{
		m1 = new ArrayList<String>();
		m1.add("Rupam Islam");
		m1.add("Allan Ao");
		m2 = new ArrayList<String>();
		m2.add("Vishal");
		m2.add("Shiraz");
		
		
		bandOps = new LinkedHashMap<Object, String>();
		bandOps.put(m1, "Fossils");
		bandOps.put(m2,"Pentagram");
		
		
	}

	

	public String getBandname() {
		return bandname;
	}



	public void setBandname(String bandname) {
		this.bandname = bandname;
	}



	public LinkedHashMap<Object, String> getBandOps() {
		return bandOps;
	}

	public ArrayList<String> getM1() {
		return m1;
	}



}
