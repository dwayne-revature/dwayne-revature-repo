package com.revature.app;

import com.revature.repositories.ReimbursementRepo;
import com.revature.repositories.ReimbursementRepoHBImpl;
import com.revature.repositories.bcRepo;
import com.revature.repositories.bcRepoImpl;
import com.revature.repositories.dhRepo;
import com.revature.repositories.dhRepoImpl;
import com.revature.repositories.dsRepo;
import com.revature.repositories.dsRepoImpl;
import com.revature.services.ReimbursementService;
import com.revature.services.ReimbursementServiceImpl;
import com.revature.services.bcService;
import com.revature.services.bcServiceImpl;
import com.revature.services.dhService;
import com.revature.services.dhServiceImpl;
import com.revature.services.dsService;
import com.revature.services.dsServiceImpl;
import com.revature.controllers.ReimbursementController;
import com.revature.controllers.bcController;
import com.revature.controllers.dhController;
import com.revature.controllers.dsController;

import io.javalin.Javalin;

public class App {
	public static void main(String[] args) throws InterruptedException {
		
		//Establish our Javalin Object
		Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());
		
		//Establish the Routes/Endpoints Javalin will manage
		establishRoutes(app);
		
		//Run Javalin
		app.start(7000);
		
		Thread.sleep(5000);
		
		ReimbursementRepo rr = new ReimbursementRepoHBImpl();
		ReimbursementService rs = new ReimbursementServiceImpl(rr);
		//ReimbursementController rc = new ReimbursementController(rs);
		
		rs.getReimbursement(0);
		
		Thread.sleep(10000);
		
		WebPlayground.main(args);
		
	}
	
	private static void establishRoutes(Javalin app) {
		
		//Here we are going to define a list of routes (endpoints)
		//we want Javalin to manage.

		ReimbursementRepo rr = new ReimbursementRepoHBImpl();
		ReimbursementService rs = new ReimbursementServiceImpl(rr);
		ReimbursementController rc = new ReimbursementController(rs);
		
		
		//-------------------------------       Reimbursement Routes        -----------------------------------
		
		//------------------ CREATE --------------------------
		app.post("/reimbursement", rc.addReimbursement);

		
		//------------------ READ --------------------------
		app.get("/NiceAdmin/reimbursement", rc.getAllReimbursements);
		app.get("/reimbursement/:id", rc.getReimbursementById);
		
		//------------------ UPDATE --------------------------
		app.put("/reimbursement/:id", rc.updateReimbursement);
		//app.patch("/reimbursement/:id", rc.ReimbursementTransaction);
		app.patch("/reimbursement/:id", rc.approveReimbursement);
		app.patch("/NiceAdmin/departmentSupervisor/:id", rc.DSapproveReimbursement);
		app.patch("/NiceAdmin/departmentHead/:id", rc.DHapproveReimbursement);
		app.patch("/NiceAdmin/benefitsCoordinator/:id", rc.BCapproveReimbursement);
		
		//------------------ DELETE --------------------------
		app.delete("/reimbursement/:id", rc.deleteReimbursement);
		
		
		
		
		//-----------------------------     Department Supervisor Routes         ------------------------------------------
		dsRepo dsr = new dsRepoImpl();
		dsService dss = new dsServiceImpl(dsr);
		dsController dsc = new dsController(dss);
		
		//------------------ CREATE --------------------------
		app.post("/departmentSupervisor", dsc.addReimbursement);
		
		//------------------ UPDATE --------------------------
		//app.patch("/departmentSupervisor/:id", dsc.approveReimbursement);
		
		
		
		
		//---------------------------       Department Head Routes     -------------------------------------------
		dhRepo dhr = new dhRepoImpl();
		dhService dhs = new dhServiceImpl(dhr);
		dhController dhc = new dhController(dhs);
		
		//------------------ CREATE --------------------------
		app.post("/departmentHead", dhc.addReimbursement);
		
		//------------------ UPDATE --------------------------
		//app.patch("/departmentHead/:id", dhc.approveReimbursement);
		
		
		
		//-----------------------------          Benefits Coordinator Routes       ------------------------------------
		bcRepo bcr = new bcRepoImpl();
		bcService bcs = new bcServiceImpl(bcr);
		bcController bcc = new bcController(bcs);
		
		//------------------ CREATE --------------------------
		app.post("/benefitsCoordinator", bcc.addReimbursement);
		
		//------------------ UPDATE --------------------------
		//app.patch("/benefitsCoordinator/:id", bcc.approveReimbursement);
	}
}
