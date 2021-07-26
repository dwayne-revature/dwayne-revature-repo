package com.revature.tests;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.ReimbursementRepoHBImpl;
import com.revature.services.ReimbursementService;
import com.revature.services.ReimbursementServiceImpl;

public class addReimbursementJUNIT {
	
	public static Reimbursement buildClass() {
		
		Reimbursement rOBJ = new Reimbursement(1, "FN", "LN", "DATE", "TIME", "LOCATION", "DESCRIPTION", 1.00, "GF", "ET", "PENDING");
		
		ReimbursementRepo rr = new ReimbursementRepoHBImpl();
		ReimbursementService rs = new ReimbursementServiceImpl(rr);
		
		return rs.addReimbursement(rOBJ);
		
	}
	
	Reimbursement rOBJ1 = new Reimbursement(1, "FN", "LN", "DATE", "TIME", "LOCATION", "DESCRIPTION", 1.00, "GF", "ET", "PENDING");
	
	Reimbursement rOBJ2 = buildClass();
	
}
