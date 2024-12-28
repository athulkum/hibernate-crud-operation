package com.main;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("/com/resource/hibernate.cfg.xml");

        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student  =  session.get(Student.class,3);//it will get all object of employee
        //get will return null if data not exist
        student.setMarks(74);
        student.setName("madu ");

        session.update(student);
        transaction.commit();
        session.close();

    }
}
