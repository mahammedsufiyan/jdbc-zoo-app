package com.ty.zoo.service;

import static com.ty.zoo.util.AppConstants.SECRET_KYE;
import com.ty.zoo.dao.*;
import com.ty.zoo.dto.Visitors;
import com.ty.zoo.util.AES;;
public class VisitorsServices {
	
	VisitorDao  dao = new VisitorDao();
	
	public int saveVisitors(Visitors visit) {
		String encName=AES.encrypt(visit.getName(), SECRET_KYE);
		String encEmail=AES.encrypt(visit.getEmail(), SECRET_KYE);
		String encPhone=AES.encrypt(visit.getPhone(), SECRET_KYE);
		
		visit.setName(encName);
		visit.setEmail(encEmail);
		visit.setPhone(encPhone);
		return dao.saveVisitors(visit);
	}
}
