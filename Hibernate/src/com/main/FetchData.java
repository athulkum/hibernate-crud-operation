package com.main;

import com.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class FetchData {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("/com/resource/hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);

       SessionFactory sessionFactory = configuration.buildSessionFactory();
       Session session = sessionFactory.openSession();

 List<Student>list = session.createCriteria(Student.class).list();
     for (Student student   :    list){
         System.out.println(student.getId());
         System.out.println(student.getName());
         System.out.println(student.getMarks());
         System.out.println("=======");
     }
    }
}

