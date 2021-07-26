package com.revature.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;




public class TuitionTests {
	
	// CREATE
	@Test
	public void addReimbursementTest() {
		
		addReimbursementJUNIT addReimbursementJUNIT = new addReimbursementJUNIT();
		
		assertNotEquals(addReimbursementJUNIT.rOBJ1.getId(), addReimbursementJUNIT.rOBJ2.getId());
		assertEquals(addReimbursementJUNIT.rOBJ1.getFirstName(), addReimbursementJUNIT.rOBJ2.getFirstName());
		assertEquals(addReimbursementJUNIT.rOBJ1.getLastName(), addReimbursementJUNIT.rOBJ2.getLastName());
		assertEquals(addReimbursementJUNIT.rOBJ1.getDate(), addReimbursementJUNIT.rOBJ2.getDate());
		assertEquals(addReimbursementJUNIT.rOBJ1.getTime(), addReimbursementJUNIT.rOBJ2.getTime());
		assertEquals(addReimbursementJUNIT.rOBJ1.getLocation(), addReimbursementJUNIT.rOBJ2.getLocation());
		assertEquals(addReimbursementJUNIT.rOBJ1.getDescription(), addReimbursementJUNIT.rOBJ2.getDescription());
		assertEquals(addReimbursementJUNIT.rOBJ1.getCost(), addReimbursementJUNIT.rOBJ2.getCost(), 1.00);
		assertEquals(addReimbursementJUNIT.rOBJ1.getGradingFormat(), addReimbursementJUNIT.rOBJ2.getGradingFormat());
		assertEquals(addReimbursementJUNIT.rOBJ1.getEventType(), addReimbursementJUNIT.rOBJ2.getEventType());
		assertEquals(addReimbursementJUNIT.rOBJ1.getApproval(), addReimbursementJUNIT.rOBJ2.getApproval());
	}
	
	// READ
	@Test
	public void getReimbursementTest() {
		
		getReimbursementJUNIT getReimbursementJUNIT = new getReimbursementJUNIT();
		
		assertEquals(getReimbursementJUNIT.rOBJ1.getId(), getReimbursementJUNIT.rOBJ2.getId());
		assertEquals(getReimbursementJUNIT.rOBJ1.getFirstName(), getReimbursementJUNIT.rOBJ2.getFirstName());
		assertEquals(getReimbursementJUNIT.rOBJ1.getLastName(), getReimbursementJUNIT.rOBJ2.getLastName());
		assertEquals(getReimbursementJUNIT.rOBJ1.getDate(), getReimbursementJUNIT.rOBJ2.getDate());
		assertEquals(getReimbursementJUNIT.rOBJ1.getTime(), getReimbursementJUNIT.rOBJ2.getTime());
		assertEquals(getReimbursementJUNIT.rOBJ1.getLocation(), getReimbursementJUNIT.rOBJ2.getLocation());
		assertEquals(getReimbursementJUNIT.rOBJ1.getDescription(), getReimbursementJUNIT.rOBJ2.getDescription());
		assertEquals(getReimbursementJUNIT.rOBJ1.getCost(), getReimbursementJUNIT.rOBJ2.getCost(), 1.00);
		assertEquals(getReimbursementJUNIT.rOBJ1.getGradingFormat(), getReimbursementJUNIT.rOBJ2.getGradingFormat());
		assertEquals(getReimbursementJUNIT.rOBJ1.getEventType(), getReimbursementJUNIT.rOBJ2.getEventType());
		assertEquals(getReimbursementJUNIT.rOBJ1.getApproval(), getReimbursementJUNIT.rOBJ2.getApproval());
	}
	
	// UPDATE
	@Test
	public void updateReimbursementTest() {
		updateReimbursementJUNIT updateReimbursementJUNIT = new updateReimbursementJUNIT();
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getId(), updateReimbursementJUNIT.rOBJ2.getId());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getFirstName(), updateReimbursementJUNIT.rOBJ2.getFirstName());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getLastName(), updateReimbursementJUNIT.rOBJ2.getLastName());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getDate(), updateReimbursementJUNIT.rOBJ2.getDate());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getTime(), updateReimbursementJUNIT.rOBJ2.getTime());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getLocation(), updateReimbursementJUNIT.rOBJ2.getLocation());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getDescription(), updateReimbursementJUNIT.rOBJ2.getDescription());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getCost(), updateReimbursementJUNIT.rOBJ2.getCost(), 1.00);
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getGradingFormat(), updateReimbursementJUNIT.rOBJ2.getGradingFormat());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getEventType(), updateReimbursementJUNIT.rOBJ2.getEventType());
		assertNotEquals(updateReimbursementJUNIT.rOBJ1.getApproval(), updateReimbursementJUNIT.rOBJ2.getApproval());
	}
	
	// DELETE
	@Test
	public void deleteReimbursementTest() {
		deleteReimbursementJUNIT deleteReimbursementJUNIT = new deleteReimbursementJUNIT();
		assertNotEquals(deleteReimbursementJUNIT.rOBJ1.getId(), deleteReimbursementJUNIT.rOBJ2.getId());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getFirstName(), deleteReimbursementJUNIT.rOBJ2.getFirstName());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getLastName(), deleteReimbursementJUNIT.rOBJ2.getLastName());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getDate(), deleteReimbursementJUNIT.rOBJ2.getDate());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getTime(), deleteReimbursementJUNIT.rOBJ2.getTime());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getLocation(), deleteReimbursementJUNIT.rOBJ2.getLocation());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getDescription(), deleteReimbursementJUNIT.rOBJ2.getDescription());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getCost(), deleteReimbursementJUNIT.rOBJ2.getCost(), 1.00);
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getGradingFormat(), deleteReimbursementJUNIT.rOBJ2.getGradingFormat());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getEventType(), deleteReimbursementJUNIT.rOBJ2.getEventType());
		assertEquals(deleteReimbursementJUNIT.rOBJ1.getApproval(), deleteReimbursementJUNIT.rOBJ2.getApproval());
	}
}
