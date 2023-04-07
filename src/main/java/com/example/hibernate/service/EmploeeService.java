package com.example.hibernate.service;

import com.example.hibernate.dao.EmploeeDao;
import com.example.hibernate.model.Emploee;
import com.example.hibernate.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class EmploeeService implements EmploeeDao {

    @Override
    public void addEmploee(Emploee emploee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.save(emploee);
            tx1.commit();
        }
    }


    @Override
    public Emploee findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Emploee.class, id);
    }

    @Override
    public List<Emploee> getAllEmploee() {
        return (List<Emploee>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Emploee").list();
    }

    @Override
    public void updateEmploee(Emploee emploee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.update(emploee);
            tx1.commit();
        }
    }

    public void deleteEmploee(Emploee emploee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.delete(emploee);
            tx1.commit();
        }
    }
}