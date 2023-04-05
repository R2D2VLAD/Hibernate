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
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(emploee);
        tx1.commit();
        session.close();
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
    public void updateEmploee(int id, Emploee emploee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        emploee.setId(id);
        session.update(emploee);
        tx1.commit();
        session.close();
    }

    @Override
    public void deleteEmploeeById(int id,Emploee emploee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        emploee.setId(id);
        session.delete(emploee);
        tx1.commit();
        session.close();
    }
}