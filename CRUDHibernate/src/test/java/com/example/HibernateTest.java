package com.example;

import com.example.model.Alumnado;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

public class HibernateTest {

    @Test
    void test1() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        var alumno1 = new Alumnado("Pedrito", "Palarado Picapiedra", "2004-02-10");

        session.persist(alumno1);

        session.getTransaction().commit();

        session.close();

    }
}
