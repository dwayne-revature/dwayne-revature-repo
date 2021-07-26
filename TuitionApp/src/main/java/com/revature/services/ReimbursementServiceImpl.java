package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementRepo;

public class ReimbursementServiceImpl implements ReimbursementService {
	
	public ReimbursementRepo rr;

	public ReimbursementServiceImpl(ReimbursementRepo rr) {
		this.rr = rr;
	}
	
	//------------------ CREATE --------------------------
	@Override
	public Reimbursement addReimbursement(Reimbursement r) {
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
	public Reimbursement approveReimbursement(int id) {
		return rr.approveReimbursement(id);
	}
	
	@Override
	public Reimbursement DSapproveReimbursement(int id) {
		return rr.DSapproveReimbursement(id);
	}
	
	@Override
	public Reimbursement DHapproveReimbursement(int id) {
		return rr.DHapproveReimbursement(id);
	}
	
	@Override
	public Reimbursement BCapproveReimbursement(int id) {
		return rr.BCapproveReimbursement(id);
	}
}
