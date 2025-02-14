package com.example.student;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManageStudent {
	public static void main(String[] args) {
        // Get Hibernate Session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create Student with manually assigned rollNo
        Student student = new Student("Pradeep", 11);

        // Save 
        session.persist(student);

        // Commit and Close Session
        transaction.commit();
        session.close();

        System.out.println("Student saved successfully!");
    }

}