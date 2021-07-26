package com.revature.controllers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.CommandJson;

import com.revature.models.Reimbursement;
import com.revature.models.benefitsCoordinator;
import com.revature.repositories.ReimbursementRepo;
import com.revature.services.ReimbursementService;
import com.revature.services.bcService;

public class bcController {
	
	bcService rs;
	Gson gson = new Gson();
	
	public bcController(bcService rs) {
		this.rs = rs;
	}
	
	//Our Controller is responsible for managing Application Logic
	//in other words, what is it that our application needs to
	//be able to do.
	//In this case, that is manage these routes (endpoints).
	
	
	//------------------ CREATE --------------------------
	public Handler addReimbursement = (context) -> {
		benefitsCoordinator r = gson.fromJson(context.body(), benefitsCoordinator.class);
		
		r = rs.addReimbursement(r);
		context.result((r != null) ? gson.toJson(r) : "{}");
	};
	
	
	//-------------------- READ --------------------------
	public Handler getAllReimbursements = (context) -> {
		List<Reimbursement> Reimbursement = rs.getAllReimbursements();
		context.result(gson.toJson(Reimbursement));
	};
	
	public Handler getReimbursementById = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.getReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
		
	};
	

	//------------------ UPDATE --------------------------
	public Handler updateReimbursement = (context) -> {
		Reimbursement r = gson.fromJson(context.body(), Reimbursement.class);
		
		r = rs.updateReimbursement(r);
		context.result((r != null) ? gson.toJson(r) : "{}");
	};
	
	public Handler approveReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		benefitsCoordinator r = rs.approveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	//------------------ DELETE --------------------------
	public Handler deleteReimbursement = (context) -> {
		String input = context.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		
		Reimbursement r = rs.deleteReimbursement(id);
		
		context.result((r != null) ? gson.toJson(r) : "{}");
	};
	
}
