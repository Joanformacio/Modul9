package com.coets.project;

import java.util.*;

import javax.swing.JOptionPane;

import com.coets.domain.*;




public class ManageThreadsPropellers {
	
	static List<Propulsion> propeller= new ArrayList<Propulsion>();
	static Propulsion p1,p2,p3,p4,p5,p6;
	
	
	static int isBrakeSpeed=-1;
	
	
	public static void Mainrun() {
		Coet coet1= new Coet("apolo1");
		
		//add a list of propellers
		coet1.setListPropulsions(CreatePropellers.AddPropellers());
		 propeller=coet1.getListPropulsions();
		 
		isBrakeSpeed=Integer.parseInt(JOptionPane.showInputDialog("inserta la opcion 1 para frenar, 0- para acelerar"));
		
			
		
		
		
		// get one to one 
		p1=propeller.get(0);
		p2=propeller.get(1);
		p3=propeller.get(2);
		p4=propeller.get(3);
		p5=propeller.get(4);
		p6=propeller.get(5);
		
		//thread coet
		System.out.println(p1.toString());
		Runcoets coet1Run= new Runcoets(coet1);
		Thread cRun=new Thread(coet1Run);
		cRun.start();
		
		
	
		
		//threads propulsion
		Runpropeller rp1= new Runpropeller(p1);
		Runpropeller rp2= new Runpropeller(p2);
		Runpropeller rp3= new Runpropeller(p3);
		Runpropeller rp4= new Runpropeller(p4);
		Runpropeller rp5= new Runpropeller(p5);
		Runpropeller rp6= new Runpropeller(p6);
		
		rp1.setIsBrakeSpeed(isBrakeSpeed);
		rp2.setIsBrakeSpeed(isBrakeSpeed);
		rp3.setIsBrakeSpeed(isBrakeSpeed);
		rp4.setIsBrakeSpeed(isBrakeSpeed);
		rp5.setIsBrakeSpeed(isBrakeSpeed);
		rp6.setIsBrakeSpeed(isBrakeSpeed);
		
		
		//Execut all threads
		//We need select one option to start, 0 to speed up, 1 to brake
		
			
			rp1.start();
			rp2.start();		
			rp3.start();
			rp4.start();
			rp5.start();
			rp6.start();
		
		
			
			try {
				rp1.join();
				rp2.join();
				rp3.join();
				rp4.join();
				rp5.join();
				rp6.join();
								
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
			
		
		
	}
	
	
	
	
}
