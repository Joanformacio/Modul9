package com.coets.project;
import com.coets.domain.*;



public class Runpropeller extends Thread{
	private Propulsion p;
	private int isBrakeSpeed=-1;
	
	public Runpropeller(Propulsion p) {
		this.p=p;
	}
	
	
	
	
	public int getIsBrakeSpeed() {
		return isBrakeSpeed;
	}
	

	public void setIsBrakeSpeed(int isBrakeSpeed)  {
		
		this.isBrakeSpeed = isBrakeSpeed;
		
	}

	


	@Override
	public  void run(){
		
		
		try {
			if (isBrakeSpeed==0) {
				
				while(this.p.getCurrentPower()!=p.getMaxPower() && isBrakeSpeed==0) {
					
					
					this.p.SpeedUp();
				
					Thread.sleep(1000);
				}
				
			}else if(isBrakeSpeed==1) {
				
				
				this.p.setCurrentPower(this.p.getMaxPower());
				
				
				while(this.p.getCurrentPower()!=0 ) {
				
					System.out.println(Thread.currentThread()+", " +this.p.toString());
					this.p.Brake();
					Thread.sleep(1000);
				
				}
			}
		}catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
					
	}
	
	
}
