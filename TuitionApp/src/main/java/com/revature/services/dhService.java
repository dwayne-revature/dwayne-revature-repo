package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.departmentHead;

public interface dhService {
	
	public Reimbursement getReimbursement(int id);
	
	public List<Reimbursement> getAllReimbursements();
	
	public departmentHead addReimbursement(departmentHead m);
	
	public Reimbursement updateReimbursement(Reimbursement change);
	
	public Reimbursement deleteReimbursement(int id);
	
	public departmentHead approveReimbursement(int id);
	
	
}
