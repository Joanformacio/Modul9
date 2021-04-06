package com.coets.project;

import java.util.*;
import com.coets.domain.*;
public class CreatePropellers {
	
	static List<Propulsion> propellers = new ArrayList<Propulsion>();
	
	public static List<Propulsion> AddPropellers() {
		try {
			propellers.add(new Propulsion("P1", 40));
			propellers.add(new Propulsion("P2", 60));
			propellers.add(new Propulsion("P3", 30));
			propellers.add(new Propulsion("P4", 80));
			propellers.add(new Propulsion("P5", 50));
			propellers.add(new Propulsion("P6", 70));
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return propellers;
		
	}
}
