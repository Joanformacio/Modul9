package com.coets.domain;



public class Coet {
	private String name;
	private int[] numPropulsion;
	private int maxPower;
	
	public Coet(String name, int maxPower) {
		this.name=name;
		this.maxPower=maxPower;
	}

	public void setNumPropulsion(int[] numPropulsion) {
		this.numPropulsion = numPropulsion;
	}

	public String getName() {
		return name;
	}

	public int  getMaxpower() {
		
		return  maxPower ;
	}

	

	

	@Override
	public String toString() {
		return "Coet [name=" + name  + ", number propulsions= "+numPropulsion.length +", maximun power= " + maxPower+ "]";
	}
	
	
	
}
