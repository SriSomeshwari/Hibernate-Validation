package com.model;

import org.hibernate.Session;

import org.hibernate.Transaction;



public class Test { 

	public static void main(String[] args) {
		Employee st=new Employee("sri","developer",74880);
		Employee st1=new Employee("vans","full stack developer",453260);
		
		Transaction tr=null;
		try(Session ses=EmpUtil.getSessionFactory().openSession()){
		tr=ses.beginTransaction();
		
		ses.persist(st);
		ses.persist(st1);
		tr.commit();
		ses.close();
		System.out.println("Data saved successfully");
		}
		catch(Exception e) {
			if(tr==null)
				tr.rollback();
		e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub

	}

}