package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.benefitsCoordinator;
import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.bcRepo;

public class bcServiceImpl implements bcService {
	
	public bcRepo rr;

	public bcServiceImpl(bcRepo rr) {
		this.rr = rr;
	}
	
	//------------------ CREATE --------------------------
	@Override
	public benefitsCoordinator addReimbursement(benefitsCoordinator r) {
		return rr.addReimbursement(r);
	}
	
	//------------------ READ --------------------------
	@Override
	public Reimbursement getReimbursement(int id) {
		return rr.getReimbursement(id);
	}

	@Override
	public List<Reimbursement> getAllReimbursements() {
		return rr.getAllReimbursements();
	}
	//------------------ UPDATE --------------------------
	@Override
	public Reimbursement updateReimbursement(Reimbursement change) {
		return rr.updateReimbursement(change);
	}
	
	//------------------ DELETE --------------------------
	@Override
	public Reimbursement deleteReimbursement(int id) {
		return rr.deleteReimbursement(id);
	}

	@Override
	public benefitsCoordinator approveReimbursement(int id) {
		return rr.approveReimbursement(id);
	}
}
