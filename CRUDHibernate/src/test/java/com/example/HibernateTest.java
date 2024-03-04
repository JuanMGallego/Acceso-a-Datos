package com.example;

import com.example.model.Alumnado;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.sql.Date;

public class HibernateTest {

    @Test
    void persist() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        var alumno1 = new Alumnado(1, "Pedrito", "Palarado Picapiedra", Date.valueOf("2004-02-10"));

        session.persist(alumno1);

        session.getTransaction().commit();

        session.close();

    }

    @Test
    void read() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        var alumno1 = session.find(Alumnado.class, 1);

        System.out.println(alumno1);
    }

    @Test
    void update() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        var alumno1 = new Alumnado(1, "Pedrito", "Palarado Picapiedra", Date.valueOf("2004-02-10"));
        alumno1.setIdAlumnado(2);
        alumno1.setNombre("Juanito");

        session.beginTransaction();
        session.merge(alumno1);
        session.getTransaction().commit();

        System.out.println(alumno1);
    }

    @Test
    void delete() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.delete(session.find(Alumnado.class, 1));
    }
}
