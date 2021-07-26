package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementService {
	
	public Reimbursement getReimbursement(int id);
	
	public List<Reimbursement> getAllReimbursements();
	
	public Reimbursement addReimbursement(Reimbursement m);
	
	public Reimbursement updateReimbursement(Reimbursement change);
	
	public Reimbursement deleteReimbursement(int id);
	
	public Reimbursement approveReimbursement(int id);
	
	public Reimbursement DSapproveReimbursement(int id);
	
	public Reimbursement DHapproveReimbursement(int id);
	
	public Reimbursement BCapproveReimbursement(int id);
}
