package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.departmentHead;
import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.dhRepo;

public class dhServiceImpl implements dhService {
	
	public dhRepo rr;

	public dhServiceImpl(dhRepo rr) {
		this.rr = rr;
	}
	
	//------------------ CREATE --------------------------
	@Override
	public departmentHead addReimbursement(departmentHead r) {
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
	public departmentHead approveReimbursement(int id) {
		return rr.approveReimbursement(id);
	}
}
