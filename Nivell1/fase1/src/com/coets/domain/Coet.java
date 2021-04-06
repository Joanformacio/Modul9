package com.coets.domain;

public class Coet {
	private String name;
	private int numPropulsion;
	
	public Coet(String name, int numPropulsion) {
		this.name=name;
		this.numPropulsion=numPropulsion;
	}

	public String getName() {
		return name;
	}

	public int getNumPropulsion() {
		return numPropulsion;
	}

	@Override
	public String toString() {
		return "Coet [name=" + name + ", numPropulsion=" + numPropulsion + "]";
	}
	
	
	
}
