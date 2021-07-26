package com.revature.repositories;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.departmentHead;

public interface dhRepo {
	
	public departmentHead addReimbursement(departmentHead r);
	public List<Reimbursement> getAllReimbursements();
	public Reimbursement getReimbursement(int id);
	public Reimbursement updateReimbursement(Reimbursement change);
	public Reimbursement deleteReimbursement(int id);
	public departmentHead approveReimbursement(int id);
	
}
