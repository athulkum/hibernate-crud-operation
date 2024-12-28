package com.main;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("/com/resource/hibernate.cfg.xml");

        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = new Student(74,"rahul");
        Student student2 = new Student(45,"pankaj");

        ArrayList <Student> arrayList = new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);

        for (   Student student : arrayList  ){
            session.save(student);
        }

        transaction.commit();
        session.close();
        System.out.println("inserted");
    }
}