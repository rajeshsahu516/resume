package com.technoelevate.comparable;

public class Robot implements Comparable<Robot> {
	
	private String name;
	private int chips;
	private int processingSpeed;
	
	

	public Robot(String name, int chips, int processing) {
		
		this.name = name;
		this.chips = chips;
		this.processingSpeed = processingSpeed;
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getChips() {
		return chips;
	}




	public void setChips(int chips) {
		this.chips = chips;
	}




	public int getProcessingSpeed() {
		return processingSpeed;
	}




	public void setProcessing(int processingSpeed) {
		this.processingSpeed = processingSpeed;
	}




	@Override
	public int compareTo(Robot o) {
		return this.getChips().compareTo(getChips());
		
	}
	}


