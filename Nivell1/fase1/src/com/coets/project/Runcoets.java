package com.coets.project;

import com.coets.domain.Coet;

public class Runcoets implements Runnable{
	
	private Coet coet;
	public Runcoets(String name, int numPropulsion) {
		this.coet= new Coet(name, numPropulsion);
	}

	@Override
	public void run(){
		// TODO Auto-generated method stub
		try {
			while(true) {
			System.out.println( Thread.currentThread()+", " + coet.toString());
			Thread.sleep(500);
		}
			
		}catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
			
	}
	
	
}
