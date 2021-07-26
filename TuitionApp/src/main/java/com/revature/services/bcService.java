package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.benefitsCoordinator;

public interface bcService {
	
	public Reimbursement getReimbursement(int id);
	
	public List<Reimbursement> getAllReimbursements();
	
	public benefitsCoordinator addReimbursement(benefitsCoordinator m);
	
	public Reimbursement updateReimbursement(Reimbursement change);
	
	public Reimbursement deleteReimbursement(int id);
	
	public benefitsCoordinator approveReimbursement(int id);
	
}
