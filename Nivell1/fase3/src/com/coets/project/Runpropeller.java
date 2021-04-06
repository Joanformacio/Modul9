package com.coets.project;


import javax.swing.JOptionPane;

import com.coets.domain.*;



public class Runpropeller implements Runnable{
	Propulsion p;
	
	public Runpropeller(Propulsion p) {
		this.p=p;
	}
	
	
	@Override
	public void run(){
		
		
		int whatDoYouWant= Integer.parseInt(JOptionPane.showInputDialog("Insert 0 to Speed Up, or  1 Brake?"));
		try {
			if (whatDoYouWant==0) {
				
				while(p.getCurrentPower()!=p.getMaxPower()) {
					
					System.out.println(Thread.currentThread()+", " +this.p.toString());
					this.p.SpeedUp();
				
					Thread.sleep(500);
				}
				
			}else if(whatDoYouWant==1) {
				this.p.setCurrentPower(this.p.getMaxPower());
				while(p.getCurrentPower()!=0) {
				
					System.out.println(Thread.currentThread()+", " +this.p.toString());
					this.p.Brake();
					Thread.sleep(500);
				
				}
			}
		}catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		
		
			
	}
}
