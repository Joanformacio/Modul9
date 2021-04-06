package com.coets.test;

import java.util.*;
import com.coets.project.*;
import com.coets.domain.*;

import com.coets.project.Runcoets;

public class TestCoets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Propulsion> propeller= new ArrayList<Propulsion>();
		Propulsion p1,p2,p3,p4,p5,p6;
		
		//Create a rocket
		Coet coet1= new Coet("apolo1");
		//add a list of propellers
		coet1.setListPropulsions(CreatePropellers.AddPropellers());
		propeller=coet1.getListPropulsions();
		
		p1=propeller.get(0);
		p2=propeller.get(1);
		p3=propeller.get(2);
		p4=propeller.get(3);
		p5=propeller.get(4);
		p6=propeller.get(5);
		
		//thread coet
		Runcoets coet1Run= new Runcoets(coet1);
		Thread t=new Thread(coet1Run);
		t.start();
		
		//threads propulsion
		Runpropeller rp1= new Runpropeller(p1);
		Thread t1=new Thread(rp1);
		t1.start();
		
		Runpropeller rp2= new Runpropeller(p2);
		Thread t2=new Thread(rp2);
		t2.start();
		
		Runpropeller rp3= new Runpropeller(p3);
		Thread t3=new Thread(rp3);
		t3.start();
		
		Runpropeller rp4= new Runpropeller(p4);
		Thread t4=new Thread(rp4);
		t4.start();
		
		Runpropeller rp5= new Runpropeller(p5);
		Thread t5=new Thread(rp5);
		t5.start();
		
		Runpropeller rp6= new Runpropeller(p6);
		Thread t6=new Thread(rp6);
		t6.start();
		
		
		
	}

}
