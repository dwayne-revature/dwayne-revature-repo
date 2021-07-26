package com.revature.repositories;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementRepo {
	
	public Reimbursement addReimbursement(Reimbursement r);
	public List<Reimbursement> getAllReimbursements();
	public Reimbursement getReimbursement(int id);
	public Reimbursement updateReimbursement(Reimbursement change);
	public Reimbursement deleteReimbursement(int id);
	public Reimbursement approveReimbursement(int id);
	public Reimbursement DSapproveReimbursement(int id);
	public Reimbursement DHapproveReimbursement(int id);
	public Reimbursement BCapproveReimbursement(int id);
	
}
