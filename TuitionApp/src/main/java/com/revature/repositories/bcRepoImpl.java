package com.revature.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Reimbursement;
import com.revature.models.benefitsCoordinator;
import com.revature.util.HibernateUtil;

public class bcRepoImpl implements bcRepo {

	//------------------ CREATE --------------------------
	public benefitsCoordinator addReimbursement(benefitsCoordinator r) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			//GET ID BACK
			r.setId(Integer.parseInt(sess.save(r).toString()));
			sess.getTransaction().commit();		
		} catch (HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			r = null;
		} finally {
			sess.close();
		}
		
		return r;
	}
	
	//------------------ READ --------------------------
	public List<Reimbursement> getAllReimbursements() {
		Session sess = HibernateUtil.getSession();
		List<Reimbursement> Reimbursement = null;
		try {
			//SELECT * FROM actors
			//HQL - wants you to be able to just use your Java Classes.
			Reimbursement = sess.createQuery("FROM Reimbursement").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		
		return Reimbursement;
	}

	public Reimbursement getReimbursement(int id) {
		
		Session sess = HibernateUtil.getSession();
		Reimbursement r = null;

		try {
			r = sess.get(Reimbursement.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}

		return r;
		
	}
	
	//------------------ UPDATE --------------------------
	public Reimbursement updateReimbursement(Reimbursement change) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		
		try {
			tx = sess.beginTransaction();
			sess.update(change);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return change;
	}
	
	//------------------ DELETE --------------------------
	public Reimbursement deleteReimbursement(int id) {
		
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement r = sess.get(Reimbursement.class, id);
		
		try {
			tx = sess.beginTransaction();
			sess.delete(r);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return r;
	}

	@Override
	public benefitsCoordinator approveReimbursement(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		benefitsCoordinator r = sess.get(benefitsCoordinator.class, id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			r.setApproval("Approved By All");
			sess.update(r);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return r;
	}
	
	

}
