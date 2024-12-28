package com.main;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("/com/resource/hibernate.cfg.xml");

        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

       Student student = session.load(Student.class,7); //load will throw exception if object not found data base;
        session.delete(student);
        transaction.commit();
        session.close();



    }
}
