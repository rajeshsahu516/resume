package com.technoelevate.comparator;

public class Combox1 implements Comparable<Combox1> {
	private String owner;
	private int  pens;
	private int pencils;
	private int erasers;
	
	public Combox1(String owner, int pens, int pencils, int erasers) {
		
		this.owner = owner;
		this.pens = pens;
		this.pencils = pencils;
		this.erasers = erasers;
		
	}
	public String getOwner() {
		return owner;
	}
	public Integer getPens() {
		return pens;
	}
	public int getPencils() {
		return pencils;
	}
	public int getErasers() {
		return erasers;
	}
	@Override
	public int compareTo(Combox1 o) {
		return this.getOwner().compareTo(o.getOwner());
	}
	
	
	

}
