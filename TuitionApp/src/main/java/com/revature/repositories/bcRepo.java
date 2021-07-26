package com.revature.repositories;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.benefitsCoordinator;

public interface bcRepo {
	
	public benefitsCoordinator addReimbursement(benefitsCoordinator r);
	public List<Reimbursement> getAllReimbursements();
	public Reimbursement getReimbursement(int id);
	public Reimbursement updateReimbursement(Reimbursement change);
	public Reimbursement deleteReimbursement(int id);
	public benefitsCoordinator approveReimbursement(int id);
	
}
