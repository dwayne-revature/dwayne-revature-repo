package com.revature.tests;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.ReimbursementRepoHBImpl;
import com.revature.services.ReimbursementService;
import com.revature.services.ReimbursementServiceImpl;

public class deleteReimbursementJUNIT {
	
	public static Reimbursement buildClass() {
		
		Reimbursement rOBJ = new Reimbursement(1, "FN", "LN", "DATE", "TIME", "LOCATION", "DESCRIPTION", 1.00, "GF", "ET", "PENDING");
		
		ReimbursementRepo rr = new ReimbursementRepoHBImpl();
		ReimbursementService rs = new ReimbursementServiceImpl(rr);
		
		return rs.addReimbursement(rOBJ);
		
	}
	
	public static Reimbursement buildDelete() {
		
		Reimbursement rOBJ = new Reimbursement(1, "FN", "LN", "DATE", "TIME", "LOCATION", "DESCRIPTION", 1.00, "GF", "ET", "PENDING");
		
		ReimbursementRepo rr = new ReimbursementRepoHBImpl();
		ReimbursementService rs = new ReimbursementServiceImpl(rr);
		
		rs.addReimbursement(rOBJ);
		
		
		return rs.deleteReimbursement(rOBJ.getId());

	}

	
	Reimbursement rOBJ1 = buildClass();
	
	Reimbursement rOBJ2 = buildDelete();
	

	
}
