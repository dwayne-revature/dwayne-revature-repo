package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.departmentSupervisor;

public interface dsService {
	
	public Reimbursement getReimbursement(int id);
	
	public List<Reimbursement> getAllReimbursements();
	
	public departmentSupervisor addReimbursement(departmentSupervisor r);
	
	public Reimbursement updateReimbursement(Reimbursement change);
	
	public Reimbursement deleteReimbursement(int id);
	
	public departmentSupervisor approveReimbursement(int id);
	
}
