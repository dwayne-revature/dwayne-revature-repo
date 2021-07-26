package com.revature.tests;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.ReimbursementRepoHBImpl;
import com.revature.services.ReimbursementService;
import com.revature.services.ReimbursementServiceImpl;

public class updateReimbursementJUNIT {
	
	public static Reimbursement buildClass() {
		
		Reimbursement rOBJ = new Reimbursement(1, "FN", "LN", "DATE", "TIME", "LOCATION", "DESCRIPTION", 1.00, "GF", "ET", "PENDING");
		return rOBJ;

	}
	public static Reimbursement buildChange() {
		
		Reimbursement rOBJ = new Reimbursement(2, "FN1", "LN2", "DATE3", "TIME4", "LOCATION5", "DESCRIPTION6", 99.00, "GF7", "ET8", "PENDING9");
		return rOBJ;

	}
	
	Reimbursement rOBJ1 = buildClass();
	
	Reimbursement rOBJ2 = buildChange();
	
}
