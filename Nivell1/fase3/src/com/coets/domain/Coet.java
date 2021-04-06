package com.coets.domain;

import java.util.*;

public class Coet {
	private String name;
	List<Propulsion> listPropulsions = new ArrayList<Propulsion>();
	
	
	public Coet(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}
	
	public List<Propulsion> getListPropulsions() {
		return listPropulsions;
	}

	public void setListPropulsions(List<Propulsion> listPropulsions) {
		this.listPropulsions = listPropulsions;
	}

	@Override
	public String toString() {
		return "Coet [name=" + name + "]";
	}
	
	
}
