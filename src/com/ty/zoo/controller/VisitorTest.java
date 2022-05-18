package com.ty.zoo.controller;

import com.ty.zoo.dao.VisitorDao;
import com.ty.zoo.dto.Visitors;

public class VisitorTest {
	
	public static void main(String[] args) {
		
		Visitors visit = new Visitors();
		VisitorDao dao = new VisitorDao();
		visit.setId(1);
		visit.setName("anu");
		visit.setEmail("sfsd");
		
		
		
				
	}
}
