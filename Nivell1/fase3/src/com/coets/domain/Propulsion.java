package com.coets.domain;

public class Propulsion {
	private String namePropeller;
	private int currentPower=0;
	private int maxPower;
	
	public Propulsion (String name, int maxPower) throws Exception{
		
		if (maxPower==0) throw new Exception ("The maximun power can not to be zero");
		if(name.equals("")) throw new Exception ("Then name can no to be empty");
		
		this.maxPower=maxPower;
		this.namePropeller=name;
		
	}
	
	public String getNamePropeller() {
		return namePropeller;
	}

	public int getCurrentPower() {
		
		return currentPower;
	}

	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}

	public int getMaxPower() {
		return maxPower;
	}
	
	public void Brake() {
		if (currentPower==0) {
			System.out.println("You can not brake, the power"+ getNamePropeller()+" is lowest");
		}else {
			
			int current=getCurrentPower();
			current-=1;
			setCurrentPower(current);
		}
	}
	
	public void SpeedUp() {
		if (currentPower==maxPower) {
			System.out.println("You can not speed up, the power "+ getNamePropeller()+" is maximum");
		}else {
			int current=getCurrentPower();
			current+=1;
			setCurrentPower(current);
		}
	}

	@Override
	public String toString() {
		return "Propulsion [namePropeller=" + namePropeller + ", currentPower=" + currentPower + ", maxPower="
				+ maxPower + "]";
	}
	
	
}
