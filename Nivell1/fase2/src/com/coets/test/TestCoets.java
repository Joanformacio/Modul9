package com.coets.test;
import com.coets.domain.Coet;
import com.coets.project.Runcoets;
import helpers.*;



public class TestCoets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coet coet1, coet2;
		
		int  power1[]={10,30,80};
		int power2[]= {30,40,50,50,30,10};
		
		int maxPowerCoet1= Calcul.Maxpower(power1);
		int maxPowerCoet2= Calcul.Maxpower(power2);
		
		coet1 = new Coet("32WESSDS", maxPowerCoet1);
		coet2 = new Coet("32WESSDS", maxPowerCoet2);
		coet1.setNumPropulsion(power1);
		coet2.setNumPropulsion(power2);
		
		Runcoets coet1Run= new Runcoets(coet1);
		Runcoets coet2Run= new Runcoets(coet2);
		
		Thread t=new Thread(coet1Run);
		Thread t2= new Thread(coet2Run);
		
		t.start();
		t2.start();
	}

}
