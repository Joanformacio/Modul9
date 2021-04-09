package com.coets.project;





import com.coets.domain.*;


public class Runcoets implements Runnable{
	
	private Coet coet;
	
	public Runcoets(Coet coet) {
		this.coet=coet;
	}

	@Override
	public void run(){
		// TODO Auto-generated method stub
		
		try {
			while(true) {
			System.out.println( Thread.currentThread()+", " + coet.toString());
			Thread.sleep(1000);
			}
			
		}catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
			
	}
	
	
}

