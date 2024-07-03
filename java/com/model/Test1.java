package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Test1 {

    public static void main(String[] args) {
        Transaction tr = null;
        try (Session session = EmpUtil.getSessionFactory().openSession()) {
            tr = session.beginTransaction();
            List<Employee> li = session.createQuery("from Employee", Employee.class).list();
            System.out.println("Name \t\t Designation \t\t Salary");
            li.forEach(e -> {
                System.out.println(e.getName() + "\t"+"\t"+ e.getDesignation() + "\t" +"\t"+ e.getSalary());
            });
            tr.commit();
        } catch (Exception x) {
            if (tr != null) {
                tr.rollback();
            }
            x.printStackTrace();
        }
        
    }
}