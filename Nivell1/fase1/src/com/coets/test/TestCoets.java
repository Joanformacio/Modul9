package com.coets.test;
import com.coets.project.Runcoets;
public class TestCoets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runcoets coet1= new Runcoets("x", 3);
		Runcoets coet2= new Runcoets("LDSFJA32", 6);
		
		Thread t=new Thread(coet1);
		Thread t2= new Thread(coet2);
		
		t.start();
		t2.start();
	}

}
