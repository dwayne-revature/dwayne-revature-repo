package com.revature.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.departmentSupervisor;
import com.revature.models.Reimbursement;
import com.revature.repositories.dsRepo;

public class dsServiceImpl implements dsService {
	
	public dsRepo rr;

	public dsServiceImpl(dsRepo rr) {
		this.rr = rr;
	}
	
	//------------------ CREATE --------------------------
	@Override
	public departmentSupervisor addReimbursement(departmentSupervisor r) {
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
	public departmentSupervisor approveReimbursement(int id) {
		return rr.approveReimbursement(id);
	}
	
	
}
