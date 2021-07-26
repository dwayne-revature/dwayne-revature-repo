package com.revature.repositories;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.departmentSupervisor;

public interface dsRepo {
	
	public departmentSupervisor addReimbursement(departmentSupervisor r);
	public List<Reimbursement> getAllReimbursements();
	public Reimbursement getReimbursement(int id);
	public Reimbursement updateReimbursement(Reimbursement change);
	public Reimbursement deleteReimbursement(int id);
	public departmentSupervisor approveReimbursement(int id);
	
}
