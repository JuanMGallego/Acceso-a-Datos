package com.example;

import com.example.model.Alumnado;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlumnadoDAO {

    public void guardarAlumnado(Alumnado alumnado) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(alumnado);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Alumnado obtenerAlumnado(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Alumnado.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void actualizarAlumnado(Alumnado alumnado) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(alumnado);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void eliminarAlumnado(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Alumnado alumnado = session.get(Alumnado.class, id);
            if (alumnado != null) {
                session.delete(alumnado);
                System.out.println("Alumnado eliminado con éxito.");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
